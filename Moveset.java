package pokemon;
import java.util.ArrayList;

public class Moveset extends Pokemon {
    private ArrayList<Move> moveset = new ArrayList<Move>(4);

    public Moveset(String pokeName, String[] moves) {
    	super(pokeName);
    	moveset.add(new Move(moves[0]));
    	moveset.add(new Move(moves[1]));
    	moveset.add(new Move(moves[2]));
    	moveset.add(new Move(moves[3]));
    }

    public Move getMove1() {
    	return moveset.get(0);
    }

    public Move getMove2() {
    	return moveset.get(1);
    }

    public Move getMove3() {
    	return moveset.get(2);
    }

    public Move getMove4() {
    	return moveset.get(3);
    }

    //note take weather and ability into account
    public int getIndexOfBestMove(Pokemon opponent, int ownHp, int oppHp) {
		// FIRST METHOD: effectiveness (type move, type1enemy, type2enemy)
		// //double
		// SECOND METHOD: stab don't need to call
		// if stab = 1.5
		// if effectiveness = 2
		// if uneffective = 0.5
    	int highestPower = 0;
		int index = 0;
		int actualPower;
		int basePower;
		double factor = 1.0;
		for (int i = 0; i < moveset.size(); i++) {
			try {
				Move move = moveset.get(i);
				basePower = move.getPower();
				factor = Effectiveness.getEffectiveness(move.getType(), opponent.getType1(), opponent.getType2());
				factor *= Effectiveness.getStab(move.getType(), getType1(), getType2());
				
				if (move.getPower() == 1) {
					basePower = getVaryingPower(move.getName(), opponent, ownHp, oppHp);
				}
				if (move.getCategory().equals("healing")) {
				    System.out.println("WENT INTO HEALING METHOD");
				    if (ownHp < 50) {
						if (Effectiveness.getDualEffectiveness(opponent.getType1(), opponent.getType2(), this.getType1(), this.getType2()) < 2) {
						//if not super effective against us 
						    if (this.getSpd() > opponent.getSpd() && (opponent.getAtk() / this.getDef() > 2 || opponent.getSpatk() / this.getSpdef() > 2)) {
							//if their atk/def is high or spatk/def is high and speed is faster than us
						    return i;
						    }
						}
				    }
				}
				if (move.getCategory().equals("physical")) {
					factor *= (double) getAtk() / opponent.getDef();
				} else if (move.getCategory().equals("special")) {
					factor *= (double) getSpatk() / opponent.getSpdef();
				} else if (move.getCategory().equals("spatkdef")) { //psyshock psystrike secret sword
					factor *= (double) getSpatk() / opponent.getDef();
				}
				
				System.out.println("factor is " + factor);
				actualPower = (int) (basePower * factor);
				if (actualPower > highestPower && !abilityImmune(move, opponent)) {
					highestPower = actualPower;
					index = i;
				}
				
				System.out.println("MOVE IS: " + move.getName() + " POWER IS " + actualPower);
			} catch (NullPointerException e) {
				System.out.println(i + 1 + " MOVE NOT FOUND/IS DISABLED");
			}
		}
		return index;
	}
    
    private int getVaryingPower(String moveName, Pokemon opponent, int ownHp, int oppHp) {
		if (moveName.equals("Low Kick") || moveName.equals("Grass Knot")) {
			if (opponent.getWeight() <= 99) {
				return 20;
			} else if (opponent.getWeight() <= 249) {
				return 40;
			} else if (opponent.getWeight() <= 499) {
				return 60;
			} else if (opponent.getWeight() <= 999) {
				return 80;
			} else if (opponent.getWeight() <= 1999) {
				return 100;
			} else {
				return 120;
			}
		}
		if (moveName.equals("Heavy Slam") || moveName.equals("Heat Crash")) {//heat crash
			if (opponent.getWeight() <= (double) this.getWeight() / 5) {
				return 120;
			} else if (opponent.getWeight() <= (double) this.getWeight() / 4) {
				return 100;
			} else if (opponent.getWeight() <= (double) this.getWeight() / 3) {
				return 80;
			} else if (opponent.getWeight() <= (double) this.getWeight() / 2) {
				return 60;
			} else {
				return 40;
			}
		}
		if (moveName.equals("Electro Ball")) {
			double r = (double) this.getSpd() / opponent.getSpd();
			if (r >= 4) {
				return 150;
			} else if (r >= 3) {
				return 120;
			} else if (r >= 2) {
				return 80;
			} else if (r >= 1) {
				return 60;
			} else {
				return 40;
			}
		}
		if (moveName.equals("Flail") || moveName.equals("Reversal")) {
		    if (ownHp <= 4) {
		    	return 200;
		    } else if (ownHp <= 10) {
		    	return 150;
		    } else if (ownHp <= 20) {
		    	return 100;
		    } else if (ownHp <= 35) {
		    	return 80;
		    } else if (ownHp <= 70) {
		    	return 40;
		    } else {
		    	return 20;
		    }
		}
		if (moveName.equals("Crush Grip") || moveName.equals("Wring Out")) {
		    return (int) (1 + 120 * ((double) oppHp / 100));
		}
		if (moveName.equals("Water Spout") || moveName.equals("Eruption")) {
		    return (int) (150 * ((double) ownHp / 100));
		}
		if (moveName.equals("Pain Split")) {
		    int difference = oppHp - ownHp;
		    if (difference > 25) {
			return 50;
		    } else if (difference > 50) {
			return 75;
		    } else if (difference > 75) {
			return 100;
		    } else {
			return 0;
		    }
		}
		if (moveName.equals("Gyro Ball")) {
			return (int) (25 * (double) opponent.getSpd() / this.getSpd());
		}
		System.out.println("COULD NOT FIND " + moveName + " in VARYING MOVES");
		return -1;
	}
    
    /*private boolean isBetween(int num, int low, int high) {
    	return num >= low && num <= high;
    }*/

	//implement mold breaker
    private boolean abilityImmune(Move move, Pokemon opponent) {
    	if (hasAbility(this, "Mold-breaker")) {
    		return false;
    	}
    	if (hasAbility(opponent, "Damp") && move.getName().equals("Explosion") || move.getName().equals("Self-Destruct")) {
    		return true;
    	}
       	if (hasAbility(opponent, "Dry-skin") && move.getType().equals("water")) {
    		return true;
    	}
       	if (hasAbility(opponent, "Flash-fire") && move.getType().equals("fire")) {
    		return true;
    	}
       	if (hasAbility(opponent, "Levitate") && move.getType().equals("ground")) {
    		return true;
    	}
       	if (hasAbility(opponent, "Lightningrod") && move.getType().equals("electric")) {
    		return true;
    	}
    	if (hasAbility(opponent, "Motor-drive") && move.getType().equals("electric")) {
    		return true;
    	}
    	if (hasAbility(opponent, "Sap-sipper") && move.getType().equals("grass")) {
    		return true;
    	}
    	if (hasAbility(opponent, "Storm-drain") && move.getType().equals("water")) {
    		return true;
    	}
    	if (hasAbility(opponent, "Volt-absorb") && move.getType().equals("electric")) {
    		return true;
    	}
       	if (hasAbility(opponent, "Water-absorb") && move.getType().equals("water")) {
    		return true;
    	}
       	if (hasAbility(opponent, "Wonder-guard") && !(move.getType().equals("flying")
       			|| move.getType().equals("rock") || move.getType().equals("ghost")
       			|| move.getType().equals("fire") || move.getType().equals("dark"))) {
    		return true;
    	}
       	//PRIMAL GROUDON AND PRIMAL KYOGRE
       	/*if (hasAbility(opponent, "Desolate-land") && move.getType().equals("water")) {
       		return true;
       	}
      	if (hasAbility(opponent, "Primordial-sea") && move.getType().equals("fire")) {
       		return true;
       	}*/
       	return false;
    }
    
    private boolean hasAbility(Pokemon pokemon, String ability) {
    	if (pokemon.getAbility1().equals(ability)) {
    		return true;
    	}
    	if (pokemon.getAbility2() != null && pokemon.getAbility2().equals(ability)) {
    		return true;
    	}
    	if (pokemon.getAbility3() != null && pokemon.getAbility3().equals(ability)) {
    		return true;
    	}
    	return false;
    }
}
