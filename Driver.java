package pokemon;


import java.util.List;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	private WebDriver driver;
	private String userId;
	private String megaPokemon;
	private int wins = 0, loses = 0;
	
	public void initialize(String browser) {
		if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("Google Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("Internet Explorer")) {
			driver = new InternetExplorerDriver();
		}
		sleep(3000);
		driver.get("http://play.pokemonshowdown.com");
		sleep(5000);
	}

	public void login(boolean randomAccount, String user, String pass, boolean randomUsername) {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		WebElement username = driver.findElement(By.name("username"));

		if (randomAccount) {
			if (randomUsername) {
				userId = UUID.randomUUID().toString().replace("-", "").substring(0, 18);
				username.sendKeys(userId);
			} else {
				userId = user;
				username.sendKeys(user);
			}
			sleep(3000);
			username.submit();
			sleep(1000);
		} else {
			userId = user;
			username.sendKeys(user);
			sleep(1000);
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys(pass);
			password.submit();
			sleep(1000);
		}
	}

	public void challenge(boolean randomOpponent, String opponent) {
		if (randomOpponent) {
			WebElement random = driver.findElement(By.name("search"));
			random.click();
		} else {
			WebElement findUser = driver.findElement(By.name("finduser"));
			findUser.click();
			sleep(1000);
			WebElement user = driver.findElement(By.name("data"));
			user.sendKeys(opponent);
			user.submit();
			sleep(1000);
			WebElement challenge = driver.findElement(By.name("challenge"));
			challenge.click();
			WebElement makeChallenge = driver.findElement(By.name("makeChallenge"));
			makeChallenge.click();
		}
		// sleep while in battle is false
		while (waitingForOpponent()) {
			sleep(5000);
		}
	}

	public void printPokemon() {
		String pageSource = driver.getPageSource();
		String[] team = parsePokemon(pageSource.substring(pageSource.lastIndexOf('\n') + 1));
		System.out.println("Size is " + team.length);

		for (int i = 0; i < team.length; i++) {
			System.out.println(team[i]);
		}

		String opponent = getOpponentPokemon(pageSource);
		System.out.println("The opponent active pokemon is " + opponent);
	}

	public void play() {
		boolean megaEvo = false;
		boolean playing = true;
		boolean timerOn = false;
		
		while (playing) {
			while (waitingForOpponent()) {
				if (!isPlaying()) {
					playing = false;
					break;
				}
				sleep(3000);
			}
			if (!playing) {
				break;
			}
			if (isAlive()) {
				//save getpagesource here and reuse for everything in this block
		        //System.out.println("HP FOR CURRENT POKEMON IS " + getOwnHp(driver.getPageSource()));
		        if (moveOrSwitch()) {
		            switchPokemon();
		        } else {
		            if (!megaEvo && megaEvo()) {
		            	megaEvo = true;
		            	megaPokemon = getActivePokemon(driver.getPageSource());
		            }
		            chooseMove(getMoves(driver.getPageSource()));
		        }
		        
			} else {
				switchPokemon();
			}
			if (!timerOn && startTimer()) {
				timerOn = true;
			}
		}
	}

	private boolean startTimer() {
		List<WebElement> timer = driver.findElements(By.name("setTimer"));
		if (timer.size() > 0) {
			try {
				timer.get(0).click();
				return true;
			} catch (StaleElementReferenceException e) {
				System.out.println("Could not click start timer");
			}
		}
		return false;
	}

	public void muteVolume() {
		driver.findElement(By.name("openSounds")).click();
		driver.findElement(By.name("muted")).click();
	}

	private boolean isPlaying() {
		List<WebElement> menu = driver.findElements(By.name("closeAndMainMenu"));
		if (menu.size() > 0) {
			if (didIWin()) {
				wins++;
				System.out.println("Game is over. You WIN!");
			} else {
				loses++;
				System.out.println("Game is over. You LOSE!");
			}
			System.out.println("TOTALS: Win: " + wins + " Loses: " + loses);
			System.out.println("closemenu size is " + menu.size());
			megaPokemon = null;
			driver.findElement(By.name("closeAndMainMenu")).click();
			return false;
		} else {
			return true;
		}
	}

	private boolean megaEvo() {
		List<WebElement> megamenu = driver.findElements(By.name("megaevo"));
		if (megamenu.size() > 0) {
			megamenu.get(0).click();
			return true;
		} else {
			return false;
		}
	}

	private boolean moveOrSwitch() {
		//switch = true, move = false
		if (driver.findElements(By.cssSelector(".movemenu button")).isEmpty()) {
			return true;
		}
		//test this disabled pokemon + disabled moves or just disabled pokemon??
		//System.out.println("moveorswitch disabled == 6?: " + driver.findElements(By.className("disabled")).size());
		if (driver.findElements(By.className("disabled")).size() == 6) {
			//System.out.println("disabled size = 6");
			return false;
		}
		String pageSource = driver.getPageSource();
		Pokemon self = new Pokemon(getActivePokemon(pageSource));
		if (self.getName() == null) {
			return false;
		}
		
		Pokemon opponent = new Pokemon(getOpponentPokemon(pageSource));
		List<WebElement> moves = getMoves(pageSource);
		String[] pokeMoves = parseMoves(moves);
		Move[] m = new Move[4];
		boolean switchPoke = false; // default to do not switch
		int usableMoves = 0;
		for (int i = 0; i < pokeMoves.length; i++) {
			m[i] = new Move(pokeMoves[i]);
		}

		for (int i = 0; i < m.length; i++) {
			if (m[i].getPower() < 50) {
				usableMoves++; 
			}
		}

		if (usableMoves == 4) {
			System.out.println("All the moves are less than power 50, prepare to switch.");
			switchPoke = true;
		}
		
/*		System.out.println("ACTIVE POKEMON IS " + self.getName());
		System.out.println("OPPONENT POKEMON IS " + opponent.getName());
		System.out.println("us against them " + Effectiveness.getDualEffectiveness(self.getType1(), self.getType2(), opponent.getType1(), opponent.getType2()));
		System.out.println("them against us " + Effectiveness.getDualEffectiveness(opponent.getType1(), opponent.getType2(), self.getType1(), self.getType2()));
*/
		if (Effectiveness.getDualEffectiveness(self.getType1(), self.getType2(), opponent.getType1(), opponent.getType2()) < 1
				&& Effectiveness.getDualEffectiveness(opponent.getType1(), opponent.getType2(), self.getType1(), self.getType2()) >= 2) {
			switchPoke = true;
			System.out.println("Opponent is supereffective and we are ineffective, prepare to switch.");
		} 
		return switchPoke;
	}
    
	private void switchPokemon() {
		List<WebElement> faintList = driver.findElements(By.className("disabled"));
		//IMPORTANT
		//MAKE A METHOD TO CHECK IF POKEMON AT INDEX I IS ALIVE USING NAME OR CLASS CHECK. CLASS = BUTTONDISABLED, NAME = POKEMONNAME (fainted)
		List<WebElement> pokeSwitch = driver.findElements(By.cssSelector(".switchmenu button"));

		/*System.out.println(pokeSwitch.size());
		for (int i = 0; i < pokeSwitch.size(); i++) {
			System.out.println(pokeSwitch.get(i).getText());
		}*/

		if (pokeSwitch.size() > 0) {
			Pokemon[] p = new Pokemon[6];

			for (int i = 0; i < p.length; i++) {
				p[i] = new Pokemon(pokeSwitch.get(i).getText());
			}
		/*	for (int i = 0; i < p.length; i++) {
				System.out.print(pokeSwitch.get(i).getText() + " ");
			}*/
			
			Pokemon opponent = new Pokemon(getOpponentPokemon(driver.getPageSource()));
			if (opponent.getName() == null) {
				pokeSwitch.get((int) (Math.random() * pokeSwitch.size())).click();
				return;
			}
			
			double effectiveOwn;
			double effectiveOpp;
			double effectiveBest;
			double effectiveBestOpp;
			Pokemon bestCandidate = null;
			int bestCandidateIndex = -1;
			boolean fainted;
			
			for (int i = 0; i < p.length; i++) {
				fainted = false;
				for (int j = 0; j < faintList.size(); j++) {
					if (faintList.get(j).getText().equals(p[i].getName())) {
						//System.out.println(faintList.get(j).getText() + " has fainted...skipping...");
						fainted = true;
						break;
					}
				}
				if (fainted) {
					continue;
				}
				if (bestCandidate == null && bestCandidateIndex == -1) {
					bestCandidate = p[i];
					bestCandidateIndex = i;
				}
				effectiveOwn = Effectiveness.getDualEffectiveness(p[i].getType1(), p[i].getType2(), opponent.getType1(), opponent.getType2()); // us against them
				effectiveOpp = Effectiveness.getDualEffectiveness(opponent.getType1(), opponent.getType2(), p[i].getType1(), p[i].getType2()); // them against us
				effectiveBest = Effectiveness.getDualEffectiveness(bestCandidate.getType1(), bestCandidate.getType2(), opponent.getType1(), opponent.getType2());
				effectiveBestOpp = Effectiveness.getDualEffectiveness(opponent.getType1(), opponent.getType2(), bestCandidate.getType1(), bestCandidate.getType2());
				// enemy: grass
				// electric ground vs water ground
				// 0.25 0.25
				// 2 4
				// -1.75 -3.75

				// fire dark vs ghost rock
				// 2 + 0 0 + 0
				// 0.5 2
				// 1.5 -2
				if ((effectiveOwn - effectiveOpp) > (effectiveBest - effectiveBestOpp)) {
					bestCandidate = p[i];
					bestCandidateIndex = i;
					//System.out.println("GREATER THAN SO BEST CANDIDATE IS " + bestCandidate.getName());
				} else if ((effectiveOwn - effectiveOpp) == (effectiveBest - effectiveBestOpp)) {
					if (p[i].getTotal() > bestCandidate.getTotal()) {
						bestCandidate = p[i];
						bestCandidateIndex = i;
						//System.out.println("equal SO BEST CANDIDATE IS " + bestCandidate.getName());
					}
					//THIS DOES NOT WORK BECAUSE IT IS INITIALIZED TO INDEX 0 pokemon but we CANNOT CHANGE TO INDEX 0 POKEMon
					//BECAUSE IT IS ALREADY IN USE/POKEMON BUTTON DISABLED
					//System.out.println("ENTERED ((effectiveOwn - effectiveOpp) == (effectiveBest - effectiveBestOpp)) BUT DID NOT CHANGE " + p[i].getName());
				} else {
					if (bestCandidateIndex == 0) {
						bestCandidate = p[i];
						bestCandidateIndex = i;
						//System.out.println("NO GOOD CANDIDATE WENT INTO ELSE " + bestCandidate.getName());
					}
					//System.out.println("ENTERED ELSE BUT DID NOT CHANGE " + p[i].getName());
				}
			}
			System.out.println("\nBest candidate is " + bestCandidate.getName());
			pokeSwitch.get(bestCandidateIndex).click();
			
		}
		
	}

	private boolean isAlive() {
		List<WebElement> menu = driver.findElements(By.cssSelector(".rstatbar"));

		if (menu.size() > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean waitingForOpponent() {
		if (driver.findElements(By.cssSelector(".movemenu button")).size() > 0) {
			return false;
		} else {
			if (driver.findElements(By.cssSelector(".switchmenu button")).size() > 0) {
				return false;
			} else {
				return true;
			}
		}
	}

	private String[] parsePokemon(String pageSource) {
		String[] pokemonParse = pageSource.split("class=\"picon\"></span>");
		String[] pokemonNames = new String[6];
		for (int i = 1; i < pokemonParse.length; i++) {
			pokemonParse[i] = pokemonParse[i].substring(0, pokemonParse[i].indexOf('<'));
		}
		//put the following 6 lines into the loop
		pokemonNames[0] = pokemonParse[1];
		pokemonNames[1] = pokemonParse[2];
		pokemonNames[2] = pokemonParse[3];
		pokemonNames[3] = pokemonParse[4];
		pokemonNames[4] = pokemonParse[5];
		pokemonNames[5] = pokemonParse[6];
		return pokemonNames;
	}

	private String getOpponentPokemon(String pageSource) {
		String[] pokemonParse = pageSource.split("top: 54px; opacity: 1;\"><strong>");
		if (pokemonParse.length > 1) {
			return pokemonParse[1].substring(0, pokemonParse[1].indexOf(" "));
		} else {
			System.out.println("The opponent Pokemon could not be parsed.");
			return null;
		}
	}

	private void chooseMove(List<WebElement> moves) {
		String[] moveNames = parseMoves(moves);
		int numDisabled = 0;
		for (int i = 0; i < moves.size(); i++) {
			if (!moves.get(i).isEnabled()) {
				numDisabled++;
				System.out.println("Move disabled: " + moves.get(i).getText());
			}
		}
		//System.out.println("num moves disabled is " + numDisabled);

		if (numDisabled == 3) {
			moves.get((int) (Math.random() * moves.size())).click();
			//System.out.println("CHOSE RANDOM MOVE....");
		} else if (moveNames != null) {
			if (moveNames.length == 4) {
				String active = getActivePokemon(driver.getPageSource());
				if (active.equals(megaPokemon)) {
					if (active.equals("Charizard") || active.equals("Mewtwo")) {
						active = specialMega();
					} else {
						active = "Mega " + active;
					}
				}
				//System.out.println("ACTIVE POKEMON IS: " + active);
				Moveset moveset = new Moveset(active, moveNames);
				String pageSource = driver.getPageSource();
				moves.get(moveset.getIndexOfBestMove(new Pokemon(getOpponentPokemon(pageSource)), getOwnHp(pageSource), getOppHp(pageSource))).click();
			} else if (moveNames.length == 1) {
				//System.out.println("CLICKING ONLY POSSIBLE MOVE");
				moves.get(0).click();
			} else {
				//System.out.println("NO POSSIBLE MOVES TO CLICK");
			}
		}
	}

	private int getOwnHp(String pageSource) {
		return Integer.parseInt(driver.findElement(By.cssSelector(".rstatbar .hpbar .hptext")).getText().replace("%", ""));
	}

	private int getOppHp(String pageSource) {
		return Integer.parseInt(driver.findElement(By.cssSelector(".lstatbar .hpbar .hptext")).getText().replace("%", ""));
	}

	private String getActivePokemon(String pageSource) {
		String[] pokemonParse = pageSource.substring(pageSource.lastIndexOf('\n') + 1).split("class=\"picon\"></span>");
		//IMPORTANT: THROWS ARRAYOUTOFBOUNDS WHEN OUTRAGE PETALDANCE. 
		//no longer does this since we do not call this if 1 move only
		if (pokemonParse.length > 1) {
			//System.out.println("ACTIVE POKEMON IS " + pokemonParse[1].substring(0, pokemonParse[1].indexOf('<')));
			return pokemonParse[1].substring(0, pokemonParse[1].indexOf('<'));
		} else {
			System.out.println("Active pokemon cannot be retrieved.");
			return null;
		}
		//ERROR THROWN IF TRAPPED IN. SHADOW TAG INFESTATION ETC.
		//CHANGE TO PARSING FROM BATTLEFIELD RATHER THAN TEAM VIEW 1/29/16
	}

	private String[] parseMoves(List<WebElement> moves) {
		String[] moveNames = new String[moves.size()];
		String s;
		for (int i = 0; i < moves.size(); i++) {
			if (moves.get(i).isEnabled()) {
				s = moves.get(i).getText();
				moveNames[i] = s.substring(0, s.indexOf("\n"));
				if (moveNames[i].equals("Hidden Power")) {
					moveNames[i] += " " + s.substring(s.indexOf("\n") + 1, s.indexOf("\n", s.indexOf("\n") + 1));
				}
				//System.out.println("MOVE NAME IS "  + moveNames[i]);
			} else {
				moveNames[i] = null;
			}
		}
		
		return moveNames;
	}

	private List<WebElement> getMoves(String pageSource) {
		List<WebElement> moves = driver.findElements(By.cssSelector(".movemenu button"));
		//System.out.println("WE HAVE " + moves.size() + " MOVES");
		/*for (int i = 0; i < moves.size(); i++) {
			System.out.println(moves.get(i).getText());
		}*/
		return moves;
	}

	public void tellThemIAmABot() {
		WebElement chatbox = driver.findElements(By.cssSelector(".textbox")).get(1);
		chatbox.sendKeys("I am a bot.");
		chatbox.submit();
	}
	
	//FIX FOR RANDOM OPPONENT BATTLES. ONLY WORKS FOR CHALLENGE BATTLES
	private boolean didIWin() {
		List<WebElement> chat = driver.findElements(By.className("inner"));
		//System.out.println("FINAL CHAT SIZE IS " + chat.size());
		String result = chat.get(chat.size() - 1).getText();
		return result.contains(userId + " won the battle");
		//userId + " won the battle"
	}
	
	private String specialMega() {
	    List<WebElement> chat = driver.findElements(By.className("inner"));
	    String result = chat.get(chat.size() - 1).getText();
	    if (result.contains("Charizard's Charizardite X is reacting to " + userId + "'s Mega Bracetlet!")) {
	    	return "Mega Charizard X";
	    } else if (result.contains("Charizard's Charizardite Y is reacting to " + userId + "'s Mega Bracetlet!")) {
	    	return "Mega Charizard Y";
	    } else if (result.contains("Mewtwo's Mewtwonite X is reacting to " + userId + "'s Mega Bracetlet!")) {
	    	return "Mega Mewtwo X";
	    } else if (result.contains("Mewtwo's Mewtwonite Y is reacting to " + userId + "'s Mega Bracetlet!")) {
	    	return "Mega Mewtwo Y";
	    } else {
	    	System.out.println("CHARIZARD OR MEWTWO NOT FOUND");
	    	return null;
	    }
	}
	
	//STATUS CHECK: span class = slp
	private String getStatus() {
		if (driver.findElements(By.className("brn")).size() > 0) {
			return "brn";
		}
		if (driver.findElements(By.className("frz")).size() > 0) {
			return "frz";
		}
		if (driver.findElements(By.className("par")).size() > 0) {
			return "par";
		}
		if (driver.findElements(By.className("psn")).size() > 0) {
			return "psn";
		}
		if (driver.findElements(By.className("tox")).size() > 0) {
			return "tox";
		}
		if (driver.findElements(By.className("slp")).size() > 0) {
			return "slp";
		}
		if (driver.findElements(By.className("Confused")).size() > 0) {
			return "con";
		}
		if (driver.findElements(By.className("Drowsy")).size() > 0) {
			return "drowsy";
		}
		return null;
	}
	
	private String getWeather() {
		List<WebElement> weather = driver.findElements(By.cssSelector("battle innerbattle weather"));
		if (weather.size() > 0) {
			return weather.get(0).getText();
		} else {
			return null;
		}
	}
	
	public static void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			System.out.println("Sleep short time...");
		}
	}
}
