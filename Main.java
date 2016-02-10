package pokemon;

public class Main {

	public static void main(String[] args) {
		/*PokemonGui gui = new PokemonGui();
		gui.main(args);
		while (!gui.isComplete()) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(gui.getUsername());
		
		*/
		Driver driver = new Driver();
		driver.initialize("Firefox");
		driver.login(true, "dshgsd", null, true);
		driver.muteVolume();
		while (true) {
			driver.challenge(true, "bananawana"); //true is stranger
			driver.play();
		}
		/*Thread t = new Thread() {			
			public void run() {
				while (true) {
					driver.tellThemIAmABot();
					try {
						Thread.sleep(120000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		t.start();*/
		
		//t.interrupt();
	}
}
