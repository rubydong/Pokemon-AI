package pokemon;

public class Effectiveness {
	public static double calculateEffectiveness(String attack, String defend) {
		switch (attack) {
		case "Normal":
			switch (defend) {
			case "Rock":
				return .5;
			case "Ghost":
				return 0;
			case "Steel":
				return .5;
			default:
				return 1;
			}
		case "Fighting":
			switch (defend) {
			case "Normal":
				return 2;
			case "Flying":
				return .5;
			case "Poison":
				return .5;
			case "Rock":
				return 2;
			case "Bug":
				return .5;
			case "Ghost":
				return 0;
			case "Steel":
				return 2;
			case "Psychic":
				return .5;
			case "Ice":
				return 2;
			case "Dark":
				return 2;
			case "Fairy":
				return .5;
			default:
				return 1;
			}
		case "Flying":
			switch (defend) {
			case "Fighting":
				return 2;
			case "Rock":
				return .5;
			case "Bug":
				return 2;
			case "Steel":
				return .5;
			case "Grass":
				return 2;
			case "Electric":
				return .5;
			default:
				return 1;
			}
		case "Poison":
			switch (defend) {
			case "Poison":
				return .5;
			case "Ground":
				return .5;
			case "Rock":
				return .5;
			case "Ghost":
				return .5;
			case "Steel":
				return 0;
			case "Grass":
				return 2;
			case "Fairy":
				return 2;
			default:
				return 1;
			}
		case "Ground":
			switch (defend) {
			case "Flying":
				return 0;
			case "Poison":
				return 2;
			case "Rock":
				return 2;
			case "Bug":
				return .5;
			case "Steel":
				return 2;
			case "Fire":
				return 2;
			case "Grass":
				return .5;
			case "Electric":
				return 2;
			default:
				return 1;
			}
		case "Rock":
			switch (defend) {
			case "Fighting":
				return .5;
			case "Flying":
				return 2;
			case "Ground":
				return .5;
			case "Bug":
				return 2;
			case "Steel":
				return .5;
			case "Fire":
				return 2;
			case "Ice":
				return 2;
			default:
				return 1;
			}
		case "Bug":
			switch (defend) {
			case "Fighting":
				return .5;
			case "Flying":
				return .5;
			case "Poison":
				return .5;
			case "Ghost":
				return .5;
			case "Steel":
				return .5;
			case "Fire":
				return .5;
			case "Grass":
				return 2;
			case "Psychic":
				return 2;
			case "Dark":
				return 2;
			case "Fairy":
				return .5;
			default:
				return 1;
			}
		case "Ghost":
			switch (defend) {
			case "Normal":
				return 0;
			case "Ghost":
				return 2;
			case "Psychic":
				return 2;
			case "Dark":
				return .5;
			default:
				return 1;
			}
		case "Steel":
			switch (defend) {
			case "Rock":
				return 2;
			case "Steel":
				return .5;
			case "Fire":
				return .5;
			case "Water":
				return .5;
			case "Electric":
				return .5;
			case "Ice":
				return 2;
			case "Fairy":
				return 2;
			default:
				return 1;
			}
		case "Fire":
			switch (defend) {
			case "Rock":
				return .5;
			case "Bug":
				return 2;
			case "Steel":
				return 2;
			case "Fire":
				return .5;
			case "Water":
				return .5;
			case "Grass":
				return 2;
			case "Ice":
				return 2;
			case "Dragon":
				return .5;
			default:
				return 1;
			}
		case "Water":
			switch (defend) {
			case "Ground":
				return 2;
			case "Rock":
				return 2;
			case "Fire":
				return 2;
			case "Water":
				return .5;
			case "Grass":
				return .5;
			case "Dragon":
				return .5;
			default:
				return 1;
			}
		case "Grass":
			switch (defend) {
			case "Flying":
				return .5;
			case "Poison":
				return .5;
			case "Ground":
				return 2;
			case "Rock":
				return 2;
			case "Bug":
				return .5;
			case "Steel":
				return .5;
			case "Fire":
				return .5;
			case "Water":
				return 2;
			case "Grass":
				return .5;
			case "Dragon":
				return .5;
			default:
				return 1;
			}
		case "Electric":
			switch (defend) {
			case "Flying":
				return 2;
			case "Ground":
				return 0;
			case "Water":
				return 2;
			case "Grass":
				return .5;
			case "Electric":
				return .5;
			case "Dragon":
				return .5;
			default:
				return 1;
			}
		case "Psychic":
			switch (defend) {
			case "Fighting":
				return 2;
			case "Poison":
				return 2;
			case "Steel":
				return .5;
			case "Psychic":
				return .5;
			case "Dark":
				return 0;
			default:
				return 1;
			}
		case "Ice":
			switch (defend) {
			case "Flying":
				return 2;
			case "Ground":
				return 2;
			case "Steel":
				return .5;
			case "Fire":
				return .5;
			case "Water":
				return .5;
			case "Grass":
				return 2;
			case "Ice":
				return .5;
			case "Dragon":
				return 2;
			default:
				return 1;
			}
		case "Dragon":
			switch (defend) {
			case "Steel":
				return .5;
			case "Dragon":
				return 2;
			case "Fairy":
				return 0;
			default:
				return 1;
			}
		case "Dark":
			switch (defend) {
			case "Fighting":
				return .5;
			case "Ghost":
				return 2;
			case "Psychic":
				return 2;
			case "Dark":
				return .5;
			case "Fairy":
				return .5;
			default:
				return 1;
			}
		case "Fairy":
			switch (defend) {
			case "Fighting":
				return 2;
			case "Poison":
				return .5;
			case "Steel":
				return .5;
			case "Fire":
				return .5;
			case "Dragon":
				return 2;
			case "Dark":
				return 2;
			default:
				return 1;
			}
		default:
			return 1;
		}
	}
	
	public static double getEffectiveness(String moveType, String type1, String type2) {
		return Math.round(calculateEffectiveness(moveType.substring(0, 1).toUpperCase() + moveType.substring(1), type1) * (type2 != null ? calculateEffectiveness(moveType.substring(0, 1).toUpperCase() + moveType.substring(1), type2) : 1) * 100.0) / 100.0;
	}
	
	public static double getDualEffectiveness(String ourType1, String ourType2, String oppType1, String oppType2) {
		if (ourType1 != null && oppType1 != null) {
			return Math.round(calculateEffectiveness(ourType1, oppType1) *
					(ourType2 != null ? calculateEffectiveness(ourType2, oppType1) : 1) * 
					(oppType2 != null ? calculateEffectiveness(ourType1, oppType2) : 1) *
					(ourType2 != null && oppType2 != null ? calculateEffectiveness(ourType2, oppType2) : 1) * 100.0) / 100.0;
		} else {
			return 1.0;
		}
	}
	
	public static double getStab(String moveType, String type1, String type2) {
		if (moveType.equalsIgnoreCase(type1) || moveType.equalsIgnoreCase(type2)) {
			//System.out.println("stab is 1.5");
			return 1.5;
		} else {
			//System.out.println("stab is 1");
			return 1;
		}
	}
}
