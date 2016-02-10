package pokemon;

public class Move {
	private String name;
	private short power;
	private String category; // physical, healing, oppswitch,etc
	private String type;
	private byte priority;
	private byte accuracy;
	private byte pp;
	private String description;

	public Move(String moveName) {
		name = moveName;
		if (moveName == null) {
			return;
		}
		if (moveName.equals("Pound")) {
			power = 40;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 35;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Karate Chop")) {
			power = 50;
			category = "physical";
			type = "fighting";
			accuracy = 100;
			pp = 25;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move.";
		} else if (moveName.equals("Double Slap")) {
			power = 47;
			category = "physical";
			type = "normal";
			accuracy = 85;
			pp = 10;
			description = "Inflicts regular damage.  Hits 2�??5 times in one turn.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.";
		} else if (moveName.equals("Comet Punch")) {
			power = 57;
			category = "physical";
			type = "normal";
			accuracy = 85;
			pp = 15;
			description = "Inflicts regular damage.  Hits 2�??5 times in one turn.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.";
		} else if (moveName.equals("Mega Punch")) {
			power = 80;
			category = "physical";
			type = "normal";
			accuracy = 85;
			pp = 20;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Pay Day")) {
			power = 40;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  After the battle ends, the winner receives five times the user's level in extra money for each time this move was used.";
		} else if (moveName.equals("Fire Punch")) {
			power = 75;
			category = "physical";
			type = "fire";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 10% chance to burn the target.";
		} else if (moveName.equals("Ice Punch")) {
			power = 75;
			category = "physical";
			type = "ice";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 10% chance to freeze the target.";
		} else if (moveName.equals("Thunder Punch")) {
			power = 75;
			category = "physical";
			type = "electric";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 10% chance to paralyze the target.";
		} else if (moveName.equals("Scratch")) {
			power = 40;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 35;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Vice Grip")) {
			power = 55;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 30;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Guillotine")) {
			power = 1; //unviable
			category = "physical";
			type = "normal";
			accuracy = 30;
			pp = 5;
			description = "Inflicts damage equal to the target's max HP.  Ignores accuracy and evasion modifiers.  This move's accuracy is 30% plus 1% for each level the user is higher than the target.  If the user is a lower level than the target, this move will fail.Because this move inflicts a specific and finite amount of damage, endure still prevents the target from fainting.The effects of lock on, mind reader, and no guard still apply, as long as the user is equal or higher level than the target.  However, they will not give this move a chance to break through detect or protect.";
		} else if (moveName.equals("Razor Wind")) {
			power = 80;
			category = "special";
			type = "normal";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move.  User charges for one turn before attacking.This move cannot be selected by sleep talk.";
		} else if (moveName.equals("Swords Dance")) {
			power = 0;
			category = "buff";
			type = "normal";
			accuracy = 101;
			pp = 30;
			description = "Raises the user's Attack by two stages.";
		} else if (moveName.equals("Cut")) {
			power = 50;
			category = "physical";
			type = "normal";
			accuracy = 95;
			pp = 30;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Gust")) {
			power = 40;
			category = "special";
			type = "flying";
			accuracy = 100;
			pp = 35;
			description = "Inflicts regular damage.If the target is under the effect of bounce, fly, or sky drop, this move will hit with double power.";
		} else if (moveName.equals("Wing Attack")) {
			power = 60;
			category = "physical";
			type = "flying";
			accuracy = 100;
			pp = 35;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Whirlwind")) {
			power = 0;
			category = "oppswitch";
			type = "normal";
			priority = -6;
			accuracy = 100;
			pp = 20;
			description = "Switch the target out for another of its trainer's Pokémon selected at random.  Wild battles end immediately.Doesn't affect Pokémon with suction cups or under the effect of ingrain.";
		} else if (moveName.equals("Fly")) {
			power = 90;
			category = "physical";
			type = "flying";
			accuracy = 95;
			pp = 15;
			description = "Inflicts regular damage.  User flies high into the air for one turn, becoming immune to attack, and hits on the second turn.During the immune turn, gust, hurricane, sky uppercut, smack down, thunder, twister, and whirlwind still hit the user normally.  gust and twister also have double power against the user.The damage from hail and sandstorm still applies during the immune turn.The user may be hit during its immune turn if under the effect of lock on, mind reader, or no guard.This move cannot be used while gravity is in effect.This move cannot be selected by sleep talk.";
		} else if (moveName.equals("Bind")) {
			power = 15;
			category = "physical";
			type = "normal";
			accuracy = 85;
			pp = 20;
			description = "Inflicts regular damage.  For the next 2�??5 turns, the target cannot leave the field and is damaged for 1/16 its max HP at the end of each turn.  The user continues to use other moves during this time.  If the user leaves the field, this effect ends.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.rapid spin cancels this effect.";
		} else if (moveName.equals("Slam")) {
			power = 80;
			category = "physical";
			type = "normal";
			accuracy = 75;
			pp = 20;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Vine Whip")) {
			power = 35;
			category = "physical";
			type = "grass";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Stomp")) {
			power = 65;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Has a 30% chance to make the target flinch.Power is doubled against Pokémon that have used minimize since entering the field.";
		} else if (moveName.equals("Double Kick")) {
			power = 30;
			category = "physical";
			type = "fighting";
			accuracy = 100;
			pp = 30;
			description = "Inflicts regular damage.  Hits twice in one turn.";
		} else if (moveName.equals("Mega Kick")) {
			power = 120;
			category = "physical";
			type = "normal";
			accuracy = 75;
			pp = 5;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Jump Kick")) {
			power = 100;
			category = "physical";
			type = "fighting";
			accuracy = 95;
			pp = 10;
			description = "Inflicts regular damage.  If this move misses, is blocked by protect or detect, or has no effect, the user takes half the damage it would have inflicted in recoil.  This recoil damage will not exceed half the user's max HP.This move cannot be used while gravity is in effect.";
		} else if (moveName.equals("Rolling Kick")) {
			power = 60;
			category = "physical";
			type = "fighting";
			accuracy = 85;
			pp = 15;
			description = "Inflicts regular damage.  Has a 30% chance to make the target flinch.";
		} else if (moveName.equals("Sand Attack")) {
			power = 0;
			category = "debuff";
			type = "ground";
			accuracy = 100;
			pp = 15;
			description = "Lowers the target's accuracy by one stage.";
		} else if (moveName.equals("Headbutt")) {
			power = 70;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 30% chance to make the target flinch.";
		} else if (moveName.equals("Horn Attack")) {
			power = 65;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 25;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Fury Attack")) {
			power = 47;
			category = "physical";
			type = "normal";
			accuracy = 85;
			pp = 20;
			description = "Inflicts regular damage.  Hits 2�??5 times in one turn.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.";
		} else if (moveName.equals("Horn Drill")) {
			power = 1; //unviable
			category = "physical";
			type = "normal";
			accuracy = 30;
			pp = 5;
			description = "Inflicts damage equal to the target's max HP.  Ignores accuracy and evasion modifiers.  This move's accuracy is 30% plus 1% for each level the user is higher than the target.  If the user is a lower level than the target, this move will fail.Because this move inflicts a specific and finite amount of damage, endure still prevents the target from fainting.The effects of lock on, mind reader, and no guard still apply, as long as the user is equal or higher level than the target.  However, they will not give this move a chance to break through detect or protect.";
		} else if (moveName.equals("Tackle")) {
			power = 50;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 35;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Body Slam")) {
			power = 85;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 30% chance to paralyze the target.";
		} else if (moveName.equals("Wrap")) {
			power = 15;
			category = "physical";
			type = "normal";
			accuracy = 90;
			pp = 20;
			description = "Inflicts regular damage.  For the next 2�??5 turns, the target cannot leave the field and is damaged for 1/16 its max HP at the end of each turn.  The user continues to use other moves during this time.  If the user leaves the field, this effect ends.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.rapid spin cancels this effect.";
		} else if (moveName.equals("Take Down")) {
			power = 90;
			category = "physical";
			type = "normal";
			accuracy = 85;
			pp = 20;
			description = "Inflicts regular damage.  User takes 1/4 the damage it inflicts in recoil.";
		} else if (moveName.equals("Thrash")) {
			power = 120;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  User is forced to attack with this move for 2�??3 turns,selected at random.  After the last hit, the user becomes confused.safeguard does not protect against the confusion from this move.";
		} else if (moveName.equals("Double-Edge")) {
			power = 120;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  User takes 1/3 the damage it inflicts in recoil.";
		} else if (moveName.equals("Tail Whip")) {
			power = 0;
			category = "debuff";
			type = "normal";
			accuracy = 100;
			pp = 30;
			description = "Lowers the target's Defense by one stage.";
		} else if (moveName.equals("Poison Sting")) {
			power = 15;
			category = "physical";
			type = "poison";
			accuracy = 100;
			pp = 35;
			description = "Inflicts regular damage.  Has a 30% chance to poison the target.";
		} else if (moveName.equals("Twineedle")) {
			power = 25;
			category = "physical";
			type = "bug";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Hits twice in the same turn.  Has a 20% chance to poison the target.";
		} else if (moveName.equals("Pin Missile")) {
			power = 79;
			category = "physical";
			type = "bug";
			accuracy = 85;
			pp = 20;
			description = "Inflicts regular damage.  Hits 2-5 times in one turn.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.";
		} else if (moveName.equals("Leer")) {
			power = 0;
			category = "debuff";
			type = "normal";
			accuracy = 100;
			pp = 30;
			description = "Lowers the target's Defense by one stage.";
		} else if (moveName.equals("Bite")) {
			power = 60;
			category = "physical";
			type = "dark";
			accuracy = 100;
			pp = 25;
			description = "Inflicts regular damage.  Has a 30% chance to make the target flinch.";
		} else if (moveName.equals("Growl")) {
			power = 0;
			category = "debuff";
			type = "normal";
			accuracy = 100;
			pp = 40;
			description = "Lowers the target's Attack by one stage.";
		} else if (moveName.equals("Roar")) {
			power = 0;
			category = "oppswitch";
			type = "normal";
			priority = -6;
			accuracy = 100;
			pp = 20;
			description = "Switch the target out for another of its trainer's Pokémon selected at random.  Wild battles end immediately.Doesn't affect Pokémon with suction cups or under the effect of ingrain.";
		} else if (moveName.equals("Sing")) {
			power = 0;
			category = "status";
			type = "normal";
			accuracy = 55;
			pp = 15;
			description = "Puts the target to sleep.";
		} else if (moveName.equals("Supersonic")) {
			power = 0;
			category = "status";
			type = "normal";
			accuracy = 55;
			pp = 20;
			description = "Confuse the target.";
		} else if (moveName.equals("Sonicboom")) {
			power = 1;
			category = "special";
			type = "normal";
			accuracy = 90;
			pp = 20;
			description = "Inflicts exactly 20 damage.";
		} else if (moveName.equals("Disable")) {
			power = 0;
			category = "debuff";
			type = "normal";
			accuracy = 100;
			pp = 20;
			description = "Disables the target's last used move, preventing its use for 4�??7 turns, selected at random, or until the target leaves the field.  If the target hasn't used a move since entering the field, if it tried to use a move this turn and failed,  if its last used move has 0 PP remaining, or if it already has a move disabled, this move will fail.";
		} else if (moveName.equals("Acid")) {
			power = 40;
			category = "special";
			type = "poison";
			accuracy = 100;
			pp = 30;
			description = "Inflicts regular damage.  Has a 10% chance to lower the target's Special Defense by one stage.";
		} else if (moveName.equals("Ember")) {
			power = 40;
			category = "special";
			type = "fire";
			accuracy = 100;
			pp = 25;
			description = "Inflicts regular damage.  Has a 10% chance to burn the target.";
		} else if (moveName.equals("Flamethrower")) {
			power = 95;
			category = "special";
			type = "fire";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 10% chance to burn the target.";
		} else if (moveName.equals("Mist")) {
			power = 0;
			category = "misc";
			type = "ice";
			accuracy = 101;
			pp = 30;
			description = "Pokémon on the user's side of the field are immune to stat lowering effects for five turns.guard swap, heart swap, and power swap may still be used.defog used by an opponent will end this effect.";
		} else if (moveName.equals("Water Gun")) {
			power = 40;
			category = "special";
			type = "water";
			accuracy = 100;
			pp = 25;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Hydro Pump")) {
			power = 120;
			category = "special";
			type = "water";
			accuracy = 80;
			pp = 5;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Surf")) {
			power = 90;
			category = "special";
			type = "water";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.If the target is in the first turn of dive, this move will hit with double power.";
		} else if (moveName.equals("Ice Beam")) {
			power = 90;
			category = "special";
			type = "ice";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Has a 10% chance to freeze the target.";
		} else if (moveName.equals("Blizzard")) {
			power = 120;
			category = "special";
			type = "ice";
			accuracy = 70;
			pp = 5;
			description = "Inflicts regular damage.  Has a 10% chance to freeze the target.During hail, this move has 100% accuracy.  It also has a (100   accuracy)% chance to break through the protection of protect and detect.";
		} else if (moveName.equals("Psybeam")) {
			power = 65;
			category = "special";
			type = "psychic";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Has a 10% chance to confuse the target.";
		} else if (moveName.equals("Bubble Beam")) {
			power = 65;
			category = "special";
			type = "water";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Has a 10% chance to lower the target's Speed by one stage.";
		} else if (moveName.equals("Aurora Beam")) {
			power = 65;
			category = "special";
			type = "ice";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Has a 10% chance to lower the target's Attack by one stage.";
		} else if (moveName.equals("Hyper Beam")) {
			power = 150;
			category = "special";
			type = "normal";
			accuracy = 90;
			pp = 5;
			description = "Inflicts regular damage.  User loses its next turn to \"recharge\", and cannot attack or switch out during that turn.";
		} else if (moveName.equals("Peck")) {
			power = 35;
			category = "physical";
			type = "flying";
			accuracy = 100;
			pp = 35;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Drill Peck")) {
			power = 80;
			category = "physical";
			type = "flying";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Submission")) {
			power = 80;
			category = "physical";
			type = "fighting";
			accuracy = 80;
			pp = 25;
			description = "Inflicts regular damage.  User takes 1/4 the damage it inflicts in recoil.";
		} else if (moveName.equals("Low Kick")) {
			power = 1;
			category = "physical";
			type = "fighting";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Power increases with the target's weight in kilograms, to a maximum of 120.Target's weight | Power                |     :Up to 10kg      |    20Up to 25kg      |    40Up to 50kg      |    60Up to 100kg     |    80Up to 200kg     |   100Above 200kg     |   120";
		} else if (moveName.equals("Counter")) {
			power = 1;
			category = "physical";
			type = "fighting";
			priority = -5;
			accuracy = 100;
			pp = 20;
			description = "Targets the last opposing Pokémon to hit the user with a physical move this turn.  Inflicts twice the damage that move did to the user.  If there is no eligible target, this move will fail.  Type immunity applies, but other type effects are ignored.This move cannot be copied by mirror move, nor selected by assist or metronome.";
		} else if (moveName.equals("Seismic Toss")) {
			power = 1;
			category = "physical";
			type = "fighting";
			accuracy = 100;
			pp = 20;
			description = "Inflicts damage equal to the user's level.  Type immunity applies, but other type effects are ignored.";
		} else if (moveName.equals("Strength")) {
			power = 80;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Absorb")) {
			power = 20;
			category = "special";
			type = "grass";
			accuracy = 100;
			pp = 25;
			description = "Inflicts regular damage.  Drains half the damage inflicted to heal the user.";
		} else if (moveName.equals("Mega Drain")) {
			power = 40;
			category = "special";
			type = "grass";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Drains half the damage inflicted to heal the user.";
		} else if (moveName.equals("Leech Seed")) {
			power = 0;
			category = "healing";
			type = "grass";
			accuracy = 90;
			pp = 10;
			description = "Plants a seed on the target that drains 1/8 of its max HP at the end of every turn and heals the user for the amount taken.  Has no effect on grass Pokémon.  The seed remains until the target leaves the field.The user takes damage instead of being healed if the target has liquid ooze.rapid spin will remove this effect.This effect is passed on by baton pass.";
		} else if (moveName.equals("Growth")) {
			power = 0;
			category = "buff";
			type = "normal";
			accuracy = 101;
			pp = 40;
			description = "Raises the user's Attack and Special Attack by one stage each.  During sunny day, raises both stats by two stages.";
		} else if (moveName.equals("Razor Leaf")) {
			power = 55;
			category = "physical";
			type = "grass";
			accuracy = 95;
			pp = 25;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move.";
		} else if (moveName.equals("Solar Beam")) {
			power = 120;
			category = "special";
			type = "grass";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  User charges for one turn before attacking.During sunny day, the charge turn is skipped.During hail, rain dance, or sandstorm, power is halved.This move cannot be selected by sleep talk.";
		} else if (moveName.equals("Poison Powder")) {
			power = 0;
			category = "status";
			type = "poison";
			accuracy = 75;
			pp = 35;
			description = "Poisons the target.";
		} else if (moveName.equals("Stun Spore")) {
			power = 0;
			category = "status";
			type = "grass";
			accuracy = 75;
			pp = 30;
			description = "Paralyzes the target.";
		} else if (moveName.equals("Sleep Powder")) {
			power = 0;
			category = "status";
			type = "grass";
			accuracy = 75;
			pp = 15;
			description = "Puts the target to sleep.";
		} else if (moveName.equals("Petal Dance")) {
			power = 120;
			category = "special";
			type = "grass";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  User is forced to attack with this move for 2�??3 turns,selected at random.  After the last hit, the user becomes confused.safeguard does not protect against the confusion from this move.";
		} else if (moveName.equals("String Shot")) {
			power = 0;
			category = "debuff";
			type = "bug";
			accuracy = 95;
			pp = 40;
			description = "Lowers the target's Speed by one stage.";
		} else if (moveName.equals("Dragon Rage")) {
			power = 1;
			category = "special";
			type = "dragon";
			accuracy = 100;
			pp = 10;
			description = "Inflicts exactly 40 damage.";
		} else if (moveName.equals("Fire Spin")) {
			power = 35;
			category = "special";
			type = "fire";
			accuracy = 85;
			pp = 15;
			description = "Inflicts regular damage.  For the next 2�??5 turns, the target cannot leave the field and is damaged for 1/16 its max HP at the end of each turn.  The user continues to use other moves during this time.  If the user leaves the field, this effect ends.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.rapid spin cancels this effect.";
		} else if (moveName.equals("Thunder Shock")) {
			power = 40;
			category = "special";
			type = "electric";
			accuracy = 100;
			pp = 30;
			description = "Inflicts regular damage.  Has a 10% chance to paralyze the target.";
		} else if (moveName.equals("Thunderbolt")) {
			power = 90;
			category = "special";
			type = "electric";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 10% chance to paralyze the target.";
		} else if (moveName.equals("Thunder Wave")) {
			power = 0;
			category = "status";
			type = "electric";
			accuracy = 100;
			pp = 20;
			description = "Paralyzes the target.";
		} else if (moveName.equals("Thunder")) {
			power = 110;
			category = "special";
			type = "electric";
			accuracy = 70;
			pp = 10;
			description = "Inflicts regular damage.  Has a 30% chance to paralyze the target.During rain dance, this move has 100% accuracy.  It also has a (100   accuracy)% chance to break through the protection of protect and detect.During sunny day, this move has 50% accuracy.";
		} else if (moveName.equals("Rock Throw")) {
			power = 50;
			category = "physical";
			type = "rock";
			accuracy = 90;
			pp = 15;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Earthquake")) {
			power = 100;
			category = "physical";
			type = "ground";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.If the target is in the first turn of dig, this move will hit with double power.";
		} else if (moveName.equals("Fissure")) {
			power = 1; //unviable
			category = "physical";
			type = "ground";
			accuracy = 30;
			pp = 5;
			description = "Inflicts damage equal to the target's max HP.  Ignores accuracy and evasion modifiers.  This move's accuracy is 30% plus 1% for each level the user is higher than the target.  If the user is a lower level than the target, this move will fail.Because this move inflicts a specific and finite amount of damage, endure still prevents the target from fainting.The effects of lock on, mind reader, and no guard still apply, as long as the user is equal or higher level than the target.  However, they will not give this move a chance to break through detect or protect.";
		} else if (moveName.equals("Dig")) {
			power = 80;
			category = "physical";
			type = "ground";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  User digs underground for one turn, becoming immune to attack, and hits on the second turn.During the immune turn, earthquake, fissure, and magnitude still hit the user normally, and their power is doubled if appropriate.The user may be hit during its immune turn if under the effect of lock on, mind reader, or no guard.This move cannot be selected by sleep talk.";
		} else if (moveName.equals("Toxic")) {
			power = 0;
			category = "status";
			type = "poison";
			accuracy = 90;
			pp = 10;
			description = "Badly poisons the target.  Never misses when used by a poison type Pokémon.";
		} else if (moveName.equals("Confusion")) {
			power = 50;
			category = "special";
			type = "psychic";
			accuracy = 100;
			pp = 25;
			description = "Inflicts regular damage.  Has a 10% chance to confuse the target.";
		} else if (moveName.equals("Psychic")) {
			power = 90;
			category = "special";
			type = "psychic";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Has a 10% chance to lower the target's Special Defense by one stage.";
		} else if (moveName.equals("Hypnosis")) {
			power = 0;
			category = "status";
			type = "psychic";
			accuracy = 60;
			pp = 20;
			description = "Puts the target to sleep.";
		} else if (moveName.equals("Meditate")) {
			power = 0;
			category = "buff";
			type = "psychic";
			accuracy = 101;
			pp = 40;
			description = "Raises the user's Attack by one stage.";
		} else if (moveName.equals("Agility")) {
			power = 0;
			category = "buff";
			type = "psychic";
			accuracy = 101;
			pp = 30;
			description = "Raises the user's Speed by two stages.";
		} else if (moveName.equals("Quick Attack")) {
			power = 40;
			category = "physical";
			type = "normal";
			priority = 1;
			accuracy = 100;
			pp = 30;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Rage")) {
			power = 20;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Every time the user is hit after it uses this move but before its next action, its Attack raises by one stage.";
		} else if (moveName.equals("Teleport")) {
			power = 0;
			category = "misc";
			type = "psychic";
			accuracy = 101;
			pp = 20;
			description = "Does nothing.  Wild battles end immediately.";
		} else if (moveName.equals("Night Shade")) {
			power = 1;
			category = "special";
			type = "ghost";
			accuracy = 100;
			pp = 15;
			description = "Inflicts damage equal to the user's level.  Type immunity applies, but other type effects are ignored.";
		} else if (moveName.equals("Mimic")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 10;
			description = "This move is replaced by the target's last successfully used move, and its PP changes to 5.  If the target hasn't used a move since entering the field, if it tried to use a move this turn and failed, or if the user already knows the targeted move, this move will fail.  This effect vanishes when the user leaves the field.If chatter, metronome, mimic, sketch, or struggle is selected, this move will fail.This move cannot be copied by mirror move, nor selected by assist or metronome, nor forced by encore.";
		} else if (moveName.equals("Screech")) {
			power = 0;
			category = "debuff";
			type = "normal";
			accuracy = 85;
			pp = 40;
			description = "Lowers the target's Defense by two stages.";
		} else if (moveName.equals("Double Team")) {
			power = 0;
			category = "buff";
			type = "normal";
			accuracy = 101;
			pp = 15;
			description = "Raises the user's evasion by one stage.";
		} else if (moveName.equals("Recover")) {
			power = 0;
			category = "healing";
			type = "normal";
			accuracy = 101;
			pp = 10;
			description = "Heals the user for half its max HP.";
		} else if (moveName.equals("Harden")) {
			power = 0;
			category = "buff";
			type = "normal";
			accuracy = 101;
			pp = 30;
			description = "Raises the user's Defense by one stage.";
		} else if (moveName.equals("Minimize")) {
			power = 0;
			category = "buff";
			type = "normal";
			accuracy = 101;
			pp = 20;
			description = "Raises the user's evasion by two stages.stomp and steamroller have double power against Pokémon that have used this move since entering the field.";
		} else if (moveName.equals("Smokescreen")) {
			power = 0;
			category = "debuff";
			type = "normal";
			accuracy = 100;
			pp = 20;
			description = "Lowers the target's accuracy by one stage.";
		} else if (moveName.equals("Confuse Ray")) {
			power = 0;
			category = "debuff";
			type = "ghost";
			accuracy = 100;
			pp = 10;
			description = "Confuse the target.";
		} else if (moveName.equals("Withdraw")) {
			power = 0;
			category = "buff";
			type = "water";
			accuracy = 101;
			pp = 40;
			description = "Raises the user's Defense by one stage.";
		} else if (moveName.equals("Defense Curl")) {
			power = 0;
			category = "buff";
			type = "normal";
			accuracy = 101;
			pp = 40;
			description = "Raises user's Defense by one stage. After this move is used, the power of ice ball and rollout are doubled until the user leaves the field.";
		} else if (moveName.equals("Barrier")) {
			power = 0;
			category = "buff";
			type = "psychic";
			accuracy = 101;
			pp = 30;
			description = "Raises the user's Defense by two stages.";
		} else if (moveName.equals("Light Screen")) {
			power = 0;
			category = "buff";
			type = "psychic";
			accuracy = 101;
			pp = 30;
			description = "Erects a barrier around the user's side of the field that reduces damage from special attacks by half for five turns.  In double battles, the reduction is 1/3.  Critical hit are not affected by the barrier.If the user is holding light clay, the barrier lasts for eight turns.brick break or defog used by an opponent will destroy the barrier.";
		} else if (moveName.equals("Haze")) {
			power = 0;
			category = "misc";
			type = "ice";
			accuracy = 101;
			pp = 30;
			description = "Removes stat, accuracy, and evasion modifiers from every Pokémon on the field.This does not count as a stat reduction for the purposes of clear body or white smoke.";
		} else if (moveName.equals("Reflect")) {
			power = 0;
			category = "buff";
			type = "psychic";
			accuracy = 101;
			pp = 20;
			description = "Erects a barrier around the user's side of the field that reduces damage from physical attacks by half for five turns.  In double battles, the reduction is 1/3.  Critical hit are not affected by the barrier.If the user is holding light clay, the barrier lasts for eight turns.brick break or defog used by an opponent will destroy the barrier.";
		} else if (moveName.equals("Focus Energy")) {
			power = 0;
			category = "buff";
			type = "normal";
			accuracy = 101;
			pp = 30;
			description = "User's critical hit rate is two levels higher until it leaves the field.  If the user has already used focus energy since entering the field, this move will fail.This effect is passed on by baton pass.";
		} else if (moveName.equals("Bide")) {
			power = 1; //unviable
			category = "misc";
			type = "normal";
			priority = 1;
			accuracy = 101;
			pp = 10;
			description = "User waits for two turns.  On the second turn, the user inflicts twice the damage it accumulated on the last Pokémon to hit it.  Damage inflicted is typeless.This move cannot be selected by sleep talk.";
		} else if (moveName.equals("Metronome")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 10;
			description = "Selects any move at random and uses it.  Moves the user already knows are not eligible.  Assist, meta, protection, and reflection moves are also not eligible; specifically, assist, chatter, copycat, counter, covet, destiny bond, detect, endure, feint, focus punch, follow me, helping hand, me first, metronome, mimic, mirror coat, mirror move, protect, quick guard, sketch, sleep talk, snatch, struggle, switcheroo, thief, trick, and wide guard will not be selected by this move.This move cannot be copied by mimic or mirror move, nor selected by assist, metronome, or sleep talk.";
		} else if (moveName.equals("Mirror Move")) {
			power = 0;
			category = "misc";
			type = "flying";
			accuracy = 101;
			pp = 20;
			description = "Uses the last move targeted at the user by a Pokémon still on the field.  A move counts as targeting the user even if it hit multiple Pokémon, as long as the user was one of them; however, moves targeting the field itself do not count.  If the user has not been targeted by an appropriate move since entering the field, or if no Pokémon that targeted the user remains on the field, this move will fail.Moves that fail, miss, had no effect, or were block are still copied.Assist moves, time delayed moves, �??meta�?? moves that operate on other moves/Pokémon/abilities, and some other special moves cannot be copied and are ignored; if the last move to hit the user was such a move, the previous move will be used instead.  The full list of ignored moves is: acupressure, assist, chatter, copycat, counter, curse, doom desire, feint, focus punch, future sight, helping hand, magic coat, me first, metronome, mimic, mirror coat, mirror move, nature power, perish song, psych up, role play, sketch, sleep talk, snatch, spit up, struggle, and transform.This move cannot be selected by assist, metronome, or sleep talk, nor forced by encore.";
		} else if (moveName.equals("Self-Destruct")) {
			power = 200;
			category = "death";
			type = "normal";
			accuracy = 100;
			pp = 5;
			description = "User faint, even if the attack fail or miss.  Inflicts regular damage.";
		} else if (moveName.equals("Egg Bomb")) {
			power = 100;
			category = "physical";
			type = "normal";
			accuracy = 75;
			pp = 10;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Lick")) {
			power = 20;
			category = "physical";
			type = "ghost";
			accuracy = 100;
			pp = 30;
			description = "Inflicts regular damage.  Has a 30% chance to paralyze the target.";
		} else if (moveName.equals("Smog")) {
			power = 20;
			category = "special";
			type = "poison";
			accuracy = 70;
			pp = 20;
			description = "Inflicts regular damage.  Has a 40% chance to poison the target.";
		} else if (moveName.equals("Sludge")) {
			power = 65;
			category = "special";
			type = "poison";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Has a 30% chance to poison the target.";
		} else if (moveName.equals("Bone Club")) {
			power = 65;
			category = "physical";
			type = "ground";
			accuracy = 85;
			pp = 20;
			description = "Inflicts regular damage.  Has a 10% chance to make the target flinch.";
		} else if (moveName.equals("Fire Blast")) {
			power = 120;
			category = "special";
			type = "fire";
			accuracy = 85;
			pp = 5;
			description = "Inflicts regular damage.  Has a 10% chance to burn the target.";
		} else if (moveName.equals("Waterfall")) {
			power = 80;
			category = "physical";
			type = "water";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 20% chance to make the target flinch.";
		} else if (moveName.equals("Clamp")) {
			power = 35;
			category = "physical";
			type = "water";
			accuracy = 85;
			pp = 15;
			description = "Inflicts regular damage.  For the next 2�??5 turns, the target cannot leave the field and is damaged for 1/16 its max HP at the end of each turn.  The user continues to use other moves during this time.  If the user leaves the field, this effect ends.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.rapid spin cancels this effect.";
		} else if (moveName.equals("Swift")) {
			power = 60;
			category = "special";
			type = "normal";
			accuracy = 101;
			pp = 20;
			description = "Inflicts regular damage.  Ignores accuracy and evasion modifiers.";
		} else if (moveName.equals("Skull Bash")) {
			power = 100;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Raises the user's Defense by one stage.  User then charges for one turn before attacking.This move cannot be selected by sleep talk.";
		} else if (moveName.equals("Spike Cannon")) {
			power = 63;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Hits 25 times in one turn.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.";
		} else if (moveName.equals("Constrict")) {
			power = 10;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 35;
			description = "Inflicts regular damage.  Has a 10% chance to lower the target's Speed by one stage.";
		} else if (moveName.equals("Amnesia")) {
			power = 0;
			category = "buff";
			type = "psychic";
			accuracy = 101;
			pp = 20;
			description = "Raises the user's Special Defense by two stages.";
		} else if (moveName.equals("Kinesis")) {
			power = 0;
			category = "debuff";
			type = "psychic";
			accuracy = 80;
			pp = 15;
			description = "Lowers the target's accuracy by one stage.";
		} else if (moveName.equals("Soft-Boiled")) {
			power = 0;
			category = "healing";
			type = "normal";
			accuracy = 101;
			pp = 10;
			description = "Heals the user for half its max HP.";
		} else if (moveName.equals("High Jump Kick")) {
			power = 130;
			category = "physical";
			type = "fighting";
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage.  If this move misses, is blocked by protect or detect, or has no effect, the user takes half the damage it would have inflicted in recoil.  This recoil damage will not exceed half the user's max HP.This move cannot be used while gravity is in effect.";
		} else if (moveName.equals("Glare")) {
			power = 0;
			category = "debuff";
			type = "normal";
			accuracy = 90;
			pp = 30;
			description = "Paralyzes the target.";
		} else if (moveName.equals("Dream Eater")) {
			power = 100;
			category = "misc";
			type = "psychic";
			accuracy = 100;
			pp = 15;
			description = "Fails if not used on a sleep Pokémon.  Inflicts regular damage.  Drains half the damage inflicted to heal the user.";
		} else if (moveName.equals("Poison Gas")) {
			power = 0;
			category = "status";
			type = "poison";
			accuracy = 80;
			pp = 40;
			description = "Poisons the target.";
		} else if (moveName.equals("Barrage")) {
			power = 47;
			category = "physical";
			type = "normal";
			accuracy = 85;
			pp = 20;
			description = "Inflicts regular damage.  Hits 2�??5 times in one turn.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.";
		} else if (moveName.equals("Leech Life")) {
			power = 20;
			category = "physical";
			type = "bug";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Drains half the damage inflicted to heal the user.";
		} else if (moveName.equals("Lovely Kiss")) {
			power = 0;
			category = "status";
			type = "normal";
			accuracy = 75;
			pp = 10;
			description = "Puts the target to sleep.";
		} else if (moveName.equals("Sky Attack")) {
			power = 140;
			category = "physical";
			type = "flying";
			accuracy = 90;
			pp = 5;
			description = "Inflicts regular damage.  User charges for one turn before attacking.  Critical hit chance chance is one level higher than normal.  Has a 30% chance to make the target flinch.This move cannot be selected by sleep talk.";
		} else if (moveName.equals("Transform")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 10;
			description = "User copies the target's species, weight, type, ability, calculated stats (except HP), and moves.  Copied moves will all have 5 PP remaining.  IV are copied for the purposes of hidden power, but stats are not recalculated.choice band, choice scarf, and choice specs stay in effect, and the user must select a new move.This move cannot be copied by mirror move, nor forced by encore.";
		} else if (moveName.equals("Bubble")) {
			power = 20;
			category = "special";
			type = "water";
			accuracy = 100;
			pp = 30;
			description = "Inflicts regular damage.  Has a 10% chance to lower the target's Speed by one stage.";
		} else if (moveName.equals("Dizzy Punch")) {
			power = 70;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Has a 20% chance to confuse the target.";
		} else if (moveName.equals("Spore")) {
			power = 0;
			category = "status";
			type = "grass";
			accuracy = 100;
			pp = 15;
			description = "Puts the target to sleep.";
		} else if (moveName.equals("Flash")) {
			power = 0;
			category = "debuff";
			type = "normal";
			accuracy = 100;
			pp = 20;
			description = "Lowers the target's accuracy by one stage.";
		} else if (moveName.equals("Psywave")) {
			power = 100; // avg of 50 + 150 = 100
			category = "special";
			type = "psychic";
			accuracy = 80;
			pp = 15;
			description = "Inflicts typeless damage between 50% and 150% of the user's level, selected at random in increments of 10%.";
		} else if (moveName.equals("Splash")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 40;
			description = "Does nothing.This move cannot be used while gravity is in effect.";
		} else if (moveName.equals("Acid Armor")) {
			power = 0;
			category = "buff";
			type = "poison";
			accuracy = 101;
			pp = 40;
			description = "Raises the user's Defense by two stages.";
		} else if (moveName.equals("Crabhammer")) {
			power = 90;
			category = "physical";
			type = "water";
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move.";
		} else if (moveName.equals("Explosion")) {
			power = 250;
			category = "death";
			type = "normal";
			accuracy = 100;
			pp = 5;
			description = "User faint, even if the attack fail or miss.  Inflicts regular damage.";
		} else if (moveName.equals("Fury Swipes")) {
			power = 57;
			category = "physical";
			type = "normal";
			accuracy = 80;
			pp = 15;
			description = "Inflicts regular damage.  Hits 25 times in one turn.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.";
		} else if (moveName.equals("Bonemerang")) {
			power = 50;
			category = "physical";
			type = "ground";
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage.  Hits twice in one turn.";
		} else if (moveName.equals("Rest")) {
			power = 0;
			category = "misc";
			type = "psychic";
			accuracy = 101;
			pp = 10;
			description = "User falls to sleep and immediately regains all its HP.  If the user has another major status effect effect, sleep will replace it.  The user will always wake up after two turns, or one turn with early bird.This move fail if the Pokémon cannot fall asleep due to uproar, insomnia, or vital spirit.  It also fails if the Pokémon is at full health or is already asleep.";
		} else if (moveName.equals("Rock Slide")) {
			power = 75;
			category = "physical";
			type = "rock";
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage.  Has a 30% chance to make the target flinch.";
		} else if (moveName.equals("Hyper Fang")) {
			power = 80;
			category = "physical";
			type = "normal";
			accuracy = 90;
			pp = 15;
			description = "Inflicts regular damage.  Has a 10% chance to make the target flinch.";
		} else if (moveName.equals("Sharpen")) {
			power = 0;
			category = "buff";
			type = "normal";
			accuracy = 101;
			pp = 30;
			description = "Raises the user's Attack by one stage.";
		} else if (moveName.equals("Conversion")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 30;
			description = "User's type changes to the type of one of its moves, selected at random.  hidden power and weather ball are treated as normal.  Only moves with a different type are eligible, and curse is never eligible.  If the user has no suitable moves, this move will fail.";
		} else if (moveName.equals("Tri Attack")) {
			power = 80;
			category = "special";
			type = "normal";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Has a 20% chance to burn, freeze, or paralyze the target.  One of these effects is selected at random; they do not each have independent chances to occur.";
		} else if (moveName.equals("Super Fang")) {
			power = 2; //viable
			category = "physical";
			type = "tough";
			accuracy = 90;
			pp = 10;
			description = "Inflicts typeless damage equal to half the target's remaining HP.";
		} else if (moveName.equals("Slash")) {
			power = 70;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move.";
		} else if (moveName.equals("Substitute")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 10;
			description = "Transfers 1/4 the user's max HP into a doll that absorbs damage and causes most negative move effects to fail.  If the user leaves the field, the doll will vanish.  If the user cannot pay the HP cost, this move will fail.The doll takes damage as normal, using the user's stats and types, and will break when its HP reaches zero.  Self inflicted damage from confusion or recoil is not absorbed.  Healing effects from opponents ignore the doll and heal the user as normal.  Moves that work based on the user's HP still do so; the doll's HP does not influence any move.The doll will block major status effect effects, confusion, and flinch.  The effects of smelling salts and wake up slap do not trigger against a doll, even if the Pokémon behind the doll has the appropriate major status effect effect.  Multi turn trapping moves like wrap will hit the doll for their regular damage, but the multi turn trapping and damage effects will not activate.Moves blocked or damage absorbed by the doll do not count as hitting the user or inflicting damage for any effects that respond to such, e.g., avalanche, counter, or a rowap berry.  magic coat still works as normal, even against moves the doll would block.  Opposing Pokémon that damage the doll with a leech move like absorb are healed as normal.It will also block acupressure, block, the curse effect of curse, dream eater, embargo, flatter, gastro acid, grudge, heal block, leech seed, lock on, mean look, mimic, mind reader, nightmare, pain split, psycho shift, spider web, sketch, swagger, switcheroo, trick, worry seed, and yawn.  A Pokémon affected by yawn before summoning the doll will still fall to sleep.The doll blocks intimidate, but all other abilities act as though the doll did not exist.  If the user has an ability that absorbs moves of a certain type for HP (such as volt absorb absorbing thunder wave), such moves will not be blocked.life orb and berries that cause confusion still work as normal, but their respective HP loss and confusion are absorbed/blocked by the doll.The user is still vulnerable to damage inflicted when entering or leaving the field, such as by pursuit or spikes; however, the doll will block the poison effect of toxic spikes.The doll is passed on by baton pass.  It keeps its existing HP, but uses the replacement Pokémon's stats and types for damage calculation.All other effects work as normal.";
		} else if (moveName.equals("Struggle")) {
			power = 50;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 0;
			description = "Inflicts typeless regular damage.  User takes 1/4 its max HP in recoil.  Ignores accuracy and evasion modifiers.This move is used automatically when a Pokémon cannot use any other move legally, e.g., due to having no PP remaining or being under the effect of both encore and torment at the same time.This move's recoil is not treated as recoil for the purposes of anything that affects recoil, such as the ability rock head.  It also is not prevented by magic guard.This move cannot be copied by mimic, mirror move, or sketch, nor selected by assist or metronome, nor forced by encore.";
		} else if (moveName.equals("Sketch")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 1;
			description = "Permanently replaces itself with the target's last used move.  If that move is chatter or struggle, this move will fail.This move cannot be copied by mimic or mirror move, nor selected by assist or metronome, nor forced by encore.";
		} else if (moveName.equals("Triple Kick")) {
			power = 60; // 10 + 20 + 30
			category = "physical";
			type = "fighting";
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage.  Hits three times in the same turn.  The second hit has double power, and the third hit has triple power.  Each hit has a separate accuracy check, and this move stops if a hit misses.skill link does not apply.";
		} else if (moveName.equals("Thief")) {
			power = 40;
			category = "physical";
			type = "dark";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  If the target is holding an item and the user is not, the user will permanently take the item.  Damage is still inflicted if an item cannot be taken.Pokémon with sticky hold or multitype are immune to the item theft effect.The target cannot recover its item with recycle.This move cannot be selected by assist or metronome.";
		} else if (moveName.equals("Spider Web")) {
			power = 0;
			category = "misc";
			type = "bug";
			accuracy = 101;
			pp = 10;
			description = "The target cannot switch out normally.  Ignores accuracy and evasion modifiers.  This effect ends when the user leaves the field.The target may still escape by using baton pass, u turn, or a shed shell.Both the user and the target pass on this effect with baton pass.";
		} else if (moveName.equals("Mind Reader")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 5;
			description = "If the user targets the same target again before the end of the next turn, the move it uses is guaranteed to hit.  This move itself also ignores accuracy and evasion modifiers.One hit KO moves are also guaranteed to hit, as long as the user is equal or higher level than the target.  This effect also allows the user to hit Pokémon that are off the field due to moves such as dig or fly.If the target uses detect or protect while under the effect of this move, the user is not guaranteed to hit, but has a (100   accuracy)% chance to break through the protection.This effect is passed on by baton pass.";
		} else if (moveName.equals("Nightmare")) {
			power = 0;
			category = "misc";
			type = "ghost";
			accuracy = 100;
			pp = 15;
			description = "Only works on sleep Pokémon.  Gives the target a nightmare, damaging it for 1/4 its max HP every turn.  If the target wakes up or leaves the field, this effect ends.";
		} else if (moveName.equals("Flame Wheel")) {
			power = 60;
			category = "physical";
			type = "fire";
			accuracy = 100;
			pp = 25;
			description = "Inflicts regular damage.  Has a 10% chance to burn the target.  Frozen Pokémon may use this move, in which case they will thaw.";
		} else if (moveName.equals("Snore")) {
			power = 40;
			category = "misc";
			type = "normal";
			accuracy = 100;
			pp = 15;
			description = "Only usable if the user is sleep.  Inflicts regular damage.  Has a 30% chance to make the target flinch.";
		} else if (moveName.equals("Curse")) {
			power = 0;
			category = "misc";
			type = "ghost";
			accuracy = 101;
			pp = 10;
			description = "If the user is a ghost: user pays half its max HP to place a curse on the target, damaging it for 1/4 its max HP every turn.Otherwise: Lowers the user's Speed by one stage, and raises its Attack and Defense by one stage each.The curse effect is passed on by baton pass.This move cannot be copied by mirror move.";
		} else if (moveName.equals("Flail")) {
			power = 1;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power varies inversely with the user's proportional remaining HP.64 * current HP / max HP | Power                       : |     : 0�?? 1                    |  200 2�?? 5                    |  150 6�??12                    |  10013�??21                    |   8022�??42                    |   4043�??64                    |   20";
		} else if (moveName.equals("Conversion 2")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 30;
			description = "Changes the user's type to a type either resistant or immune to the last damaging move that hit it.  The new type is selected at random and cannot be a type the user already is.  If there is no eligible new type, this move will fail.";
		} else if (moveName.equals("Aeroblast")) {
			power = 100;
			category = "special";
			type = "flying";
			accuracy = 95;
			pp = 5;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move.";
		} else if (moveName.equals("Cotton Spore")) {
			power = 0;
			category = "debuff";
			type = "grass";
			accuracy = 100;
			pp = 40;
			description = "Lowers the target's Speed by two stages.";
		} else if (moveName.equals("Reversal")) {
			power = 1;
			category = "physical";
			type = "fighting";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power varies inversely with the user's proportional remaining HP.64 * current HP / max HP | Power                       : |     : 0�?? 1                    |  200 2�?? 5                    |  150 6�??12                    |  10013�??21                    |   8022�??42                    |   4043�??64                    |   20";
		} else if (moveName.equals("Spite")) {
			power = 0;
			category = "misc";
			type = "ghost";
			accuracy = 100;
			pp = 10;
			description = "Lowers the PP of the target's last used move by 4.  If the target hasn't used a move since entering the field, if it tried to use a move this turn and failed, or if its last used move has 0 PP remaining, this move will fail.";
		} else if (moveName.equals("Powder Snow")) {
			power = 40;
			category = "special";
			type = "ice";
			accuracy = 100;
			pp = 25;
			description = "Inflicts regular damage.  Has a 10% chance to freeze the target.";
		} else if (moveName.equals("Protect")) {
			power = 0;
			category = "protect";
			type = "normal";
			priority = 4;
			accuracy = 101;
			pp = 10;
			description = "No moves will hit the user for the remainder of this turn.  If the user is last to act this turn, this move will fail.If the user successfully used detect, endure, protect, quick guard, or wide guard on the last turn, this move has a 50% chance to fail.lock on, mind reader, and no guard provide a (100 �?? accuracy)% chance for moves to break through this move.  This does not apply to one hit KO moves (fissure, guillotine, horn drill, and sheer cold); those are always blocked by this move.thunder during rain dance and blizzard during hail have a 30% chance to break through this move.The following effects are not prevented by this move:* acupressure from an ally* curse's curse effect* Delayed damage from doom desire and future sight; however, these moves will be prevented if they are used this turn* feint, which will also end this move's protection after it hits* imprison* perish song* shadow force* Moves that merely copy the user, such as transform or psych upThis move cannot be selected by assist or metronome.";
		} else if (moveName.equals("Mach Punch")) {
			power = 40;
			category = "physical";
			type = "fighting";
			priority = 1;
			accuracy = 100;
			pp = 30;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Scary Face")) {
			power = 0;
			category = "debuff";
			type = "normal";
			accuracy = 100;
			pp = 10;
			description = "Lowers the target's Speed by two stages.";
		} else if (moveName.equals("Feint Attack")) {
			power = 60;
			category = "physical";
			type = "dark";
			accuracy = 101;
			pp = 20;
			description = "Inflicts regular damage.  Ignores accuracy and evasion modifiers.";
		} else if (moveName.equals("Sweet Kiss")) {
			power = 0;
			category = "debuff";
			type = "fairy";
			accuracy = 75;
			pp = 10;
			description = "Confuse the target.";
		} else if (moveName.equals("Belly Drum")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 10;
			description = "User pays half its max HP to raise its Attack to +6 stages.  If the user cannot pay the HP cost, this move will fail.";
		} else if (moveName.equals("Sludge Bomb")) {
			power = 90;
			category = "special";
			type = "poison";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Has a 30% chance to poison the target.";
		} else if (moveName.equals("Mud-Slap")) {
			power = 20;
			category = "special";
			type = "ground";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Has a 100% chance to lower the target's accuracy by one stage.";
		} else if (moveName.equals("Octazooka")) {
			power = 65;
			category = "special";
			type = "water";
			accuracy = 85;
			pp = 10;
			description = "Inflicts regular damage.  Has a 50% chance to lower the target's accuracy by one stage.";
		} else if (moveName.equals("Spikes")) {
			power = 0;
			category = "hazard";
			type = "ground";
			accuracy = 101;
			pp = 20;
			description = "Scatters spikes around the opposing field, which damage opposing Pokémon that enter the field for 1/8 of their max HP.  Pokémon immune to ground moves are immune to this damage, except during gravity.  Up to three layers of spikes may be laid down, adding 1/16 to the damage done: two layers of spikes damage for 3/16 max HP, and three layers damage for 1/4 max HP.wonder guard does not block damage from this effect.rapid spin removes this effect from its user's side of the field.  defog removes this effect from its target's side of the field.";
		} else if (moveName.equals("Zap Cannon")) {
			power = 120;
			category = "special";
			type = "electric";
			accuracy = 50;
			pp = 5;
			description = "Inflicts regular damage.  Has a 100% chance to paralyze the target.";
		} else if (moveName.equals("Foresight")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 40;
			description = "Resets the target's evasion to normal and prevents any further boosting until the target leaves the field.  A ghost under this effect takes normal damage from normal and fighting moves.  This move itself ignores accuracy and evasion modifiers.";
		} else if (moveName.equals("Destiny Bond")) {
			power = 0;
			category = "death";
			type = "ghost";
			accuracy = 101;
			pp = 5;
			description = "If the user faints before its next move, the Pokémon that faint it will automatically faint.  End of turn damage is ignored.This move cannot be selected by assist or metronome.";
		} else if (moveName.equals("Perish Song")) {
			power = 0;
			category = "midv";
			type = "normal";
			accuracy = 101;
			pp = 5;
			description = "Every Pokémon is given a counter that starts at 3 and decreases by 1 at the end of every turn, including this one.  When a Pokémon's counter reaches zero, that Pokémon faint.  A Pokémon that leaves the field will lose its counter; its replacement does not inherit the effect, and other Pokémon's counters remain.This effect is passed on by baton pass.This move cannot be copied by mirror move.";
		} else if (moveName.equals("Icy Wind")) {
			power = 55;
			category = "special";
			type = "ice";
			accuracy = 95;
			pp = 15;
			description = "Inflicts regular damage.  Has a 100% chance to lower the target's Speed by one stage.";
		} else if (moveName.equals("Detect")) {
			power = 0;
			category = "protect";
			type = "fighting";
			priority = 4;
			accuracy = 101;
			pp = 5;
			description = "No moves will hit the user for the remainder of this turn.  If the user is last to act this turn, this move will fail.If the user successfully used detect, endure, protect, quick guard, or wide guard on the last turn, this move has a 50% chance to fail.lock on, mind reader, and no guard provide a (100 �?? accuracy)% chance for moves to break through this move.  This does not apply to one hit KO moves (fissure, guillotine, horn drill, and sheer cold); those are always blocked by this move.thunder during rain dance and blizzard during hail have a 30% chance to break through this move.The following effects are not prevented by this move:* acupressure from an ally* curse's curse effect* Delayed damage from doom desire and future sight; however, these moves will be prevented if they are used this turn* feint, which will also end this move's protection after it hits* imprison* perish song* shadow force* Moves that merely copy the user, such as transform or psych upThis move cannot be selected by assist or metronome.";
		} else if (moveName.equals("Bone Rush")) {
			power = 79;
			category = "physical";
			type = "ground";
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage.  Hits 2�??5 times in one turn.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.";
		} else if (moveName.equals("Lock-On")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 5;
			description = "If the user targets the same target again before the end of the next turn, the move it uses is guaranteed to hit.  This move itself also ignores accuracy and evasion modifiers.One hit KO moves are also guaranteed to hit, as long as the user is equal or higher level than the target.  This effect also allows the user to hit Pokémon that are off the field due to moves such as dig or fly.If the target uses detect or protect while under the effect of this move, the user is not guaranteed to hit, but has a (100   accuracy)% chance to break through the protection.This effect is passed on by baton pass.";
		} else if (moveName.equals("Outrage")) {
			power = 120;
			category = "physical";
			type = "dragon";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  User is forced to attack with this move for 2�??3 turns,selected at random.  After the last hit, the user becomes confused.safeguard does not protect against the confusion from this move.";
		} else if (moveName.equals("Sandstorm")) {
			power = 0;
			category = "misc";
			type = "rock";
			accuracy = 101;
			pp = 10;
			description = "Changes the weather to a sandstorm for five turns.  Pokémon that are not ground, rock, or steel take 1/16 their max HP at the end of every turn.  Every rock Pokémon's original Special Defense is raised by 50% for the duration of this effect.solar beam's power is halved.moonlight, morning sun, and synthesis only heal 1/4 the user's max HP.";
		} else if (moveName.equals("Giga Drain")) {
			power = 75;
			category = "special";
			type = "grass";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Drains half the damage inflicted to heal the user.";
		} else if (moveName.equals("Endure")) {
			power = 0;
			category = "misc";
			type = "normal";
			priority = 3;
			accuracy = 101;
			pp = 10;
			description = "The user's HP cannot be lowered below 1 by any means for the remainder of this turn.If the user successfully used detect, endure, protect, quick guard, or wide guard on the last turn, this move has a 50% chance to fail.This move cannot be selected by assist or metronome.";
		} else if (moveName.equals("Charm")) {
			power = 0;
			category = "debuff";
			type = "fairy";
			accuracy = 100;
			pp = 20;
			description = "Lowers the target's Attack by two stages.";
		} else if (moveName.equals("Rollout")) {
			power = 30;
			category = "misc";
			type = "rock";
			accuracy = 90;
			pp = 20;
			description = "Inflicts regular damage.  User is forced to use this move for five turns.  Power doubles every time this move is used in succession to a maximum of 16x, and resets to normal after the lock in ends.  If this move misses or becomes unusable, the lock in ends.If the user has used defense curl since entering the field, this move has double power.";
		} else if (moveName.equals("False Swipe")) {
			power = 40;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 40;
			description = "Inflicts regular damage.  Will not reduce the target's HP below 1.";
		} else if (moveName.equals("Swagger")) {
			power = 0;
			category = "buff";
			type = "normal";
			accuracy = 90;
			pp = 15;
			description = "Raises the target's Attack by two stages, then confuses it.  If the target's Attack cannot be raised by two stages, the confusion is not applied.";
		} else if (moveName.equals("Milk Drink")) {
			power = 0;
			category = "healing";
			type = "normal";
			accuracy = 101;
			pp = 10;
			description = "Heals the user for half its max HP.";
		} else if (moveName.equals("Spark")) {
			power = 65;
			category = "physical";
			type = "electric";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Has a 30% chance to paralyze the target.";
		} else if (moveName.equals("Fury Cutter")) {
			power = 20;
			category = "physical";
			type = "bug";
			accuracy = 95;
			pp = 20;
			description = "Inflicts regular damage.  Power doubles after every time this move is used, whether consecutively or not, maxing out at 16x.  If this move misses or the user leaves the field, power resets.";
		} else if (moveName.equals("Steel Wing")) {
			power = 70;
			category = "physical";
			type = "steel";
			accuracy = 90;
			pp = 25;
			description = "Inflicts regular damage. Has a 10% chance to raise the user's Defense one stage.";
		} else if (moveName.equals("Mean Look")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 5;
			description = "The target cannot switch out normally.  Ignores accuracy and evasion modifiers.  This effect ends when the user leaves the field.The target may still escape by using baton pass, u turn, or a shed shell.Both the user and the target pass on this effect with baton pass.";
		} else if (moveName.equals("Attract")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 100;
			pp = 15;
			description = "Causes the target to fall in love with the user, giving it a 50% chance to do nothing each turn.  If the user and target are the same gender, or either is genderless, this move will fail.  If either Pokémon leaves the field, this effect ends.";
		} else if (moveName.equals("Sleep Talk")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 10;
			description = "Only usable if the user is sleep.  Randomly selects and uses one of the user's other three moves.  Use of the selected move requires and costs 0 PP.This move will not select assist, bide, bounce, chatter, copycat, dig, dive, fly, focus punch, me first, metronome, mirror move, shadow force, skull bash, sky attack, sky drop, sleep talk, solar beam, razor wind, or uproar.If the selected move requires a recharge turn�??i.e., one of blast burn, frenzy plant, giga impact, hydro cannon, hyper beam, roar of time, or rock wrecker�??and the user is still sleep next turn, then it's forced to use this move again and pay another PP for the recharge turn.This move cannot be copied by mirror move, nor selected by assist, metronome, or sleep talk.";
		} else if (moveName.equals("Heal Bell")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 5;
			description = "Removes major status effects effects and confusion from every Pokémon in the user's party.";
		} else if (moveName.equals("Return")) {
			power = 102;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Power increases with happiness, given by `happiness * 2 / 5`, to a maximum of 102.  Power bottoms out at 1.";
		} else if (moveName.equals("Present")) {
			power = 1;
			category = "misc";
			type = "normal";
			accuracy = 90;
			pp = 15;
			description = "Randomly uses one of the following effects.Effect                                             | Chance                                                   |      :Inflicts regular damage with 40 power  |    40%Inflicts regular damage with 80 power  |    30%Inflicts regular damage with 120 power |    10%Heals the target for 1/4 its max HP    |    20%On average, this move inflicts regular damage with 52 power and heals the target for 1/20 its max HP.";
		} else if (moveName.equals("Frustration")) {
			power = 1;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Power increases inversely with happiness, given by `(255   happiness) * 2 / 5`, to a maximum of 102.  Power bottoms out at 1.";
		} else if (moveName.equals("Safeguard")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 25;
			description = "Protects Pokémon on the user's side of the field from major status effects and confusion for five turns.  Does not cancel existing ailments.  This effect remains even if the user leaves the field.If yawn is used while this move is in effect, it will immediately fail.defog used by an opponent will end this effect.This effect does not prevent the confusion caused by outrage, petal dance, or thrash.";
		} else if (moveName.equals("Pain Split")) {
			power = 2;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 20;
			description = "Changes the user's and target's remaining HP to the average of their current remaining HP.  Ignores accuracy and evasion modifiers.  This effect does not count as inflicting damage for other moves and effects that respond to damage taken.This effect fail against a substitute.";
		} else if (moveName.equals("Sacred Fire")) {
			power = 100;
			category = "physical";
			type = "fire";
			accuracy = 95;
			pp = 5;
			description = "Inflicts regular damage.  Has a 50% chance to burn the target.  Frozen Pokémon may use this move, in which case they will thaw.";
		} else if (moveName.equals("Magnitude")) {
			power = 71;
			category = "physical";
			type = "ground";
			accuracy = 100;
			pp = 30;
			description = "Inflicts regular damage.  Power is selected at random between 10 and 150, with an average of 71:Magnitude | Power | Chance        : |     : |      :        4 |    10 |     5%        5 |    30 |    10%        6 |    50 |    20%        7 |    70 |    30%        8 |    90 |    20%        9 |   110 |    10%       10 |   150 |     5%This move has double power against Pokémon currently underground due to dig.";
		} else if (moveName.equals("Dynamic Punch")) {
			power = 100;
			category = "physical";
			type = "fighting";
			accuracy = 50;
			pp = 5;
			description = "Inflicts regular damage.  Has a 100% chance to confuse the target.";
		} else if (moveName.equals("Megahorn")) {
			power = 120;
			category = "physical";
			type = "bug";
			accuracy = 85;
			pp = 10;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Dragon Breath")) {
			power = 60;
			category = "special";
			type = "dragon";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Has a 30% chance to paralyze the target.";
		} else if (moveName.equals("Baton Pass")) {
			power = 0;
			category = "switch";
			type = "normal";
			accuracy = 101;
			pp = 40;
			description = "User switches out, and the trainer selects a replacement Pokémon from the party.  Stat changes, confusion, and persistent move effects are passed along to the replacement Pokémon.The following move effects are passed:* aqua ring* both the user's and target's effect of block, mean look, and spider web* the curse effect of curse* embargo* focus energy or an activated lansat berry* gastro acid* ingrain* being sapped by leech seed* being targeted by lock on or mind reader* magnet rise* perish song's counter* power trick* substitute; the doll's HP is unchangedThe replacement Pokémon does not trigger effects that respond to Pokémon switching in.";
		} else if (moveName.equals("Encore")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 100;
			pp = 5;
			description = "The next 4-8 times (selected at random) the target attempts to move, it is forced to repeat its last used move.  If the selected move allows the trainer to select a target, an opponent will be selected at random each turn.  If the target is prevented from using the selected move by some other effect, struggle will be used instead.  This effect ends if the selected move runs out of PP.If the target hasn't used a move since entering the field, if it tried to use a move this turn and failed, if it does not know the selected move, or if the selected move has 0 PP remaining, this move will fail.  If the target's last used move was encore, mimic, mirror move, sketch, struggle, or transform, this move will fail.";
		} else if (moveName.equals("Pursuit")) {
			power = 40;
			category = "physical";
			type = "dark";
			priority = 7;
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  If the target attempts to switch out this turn before the user acts, this move hits the target before it leaves and has double power.This effect can still hit a Pokémon that switches out when it has a substitute up or when an ally has used follow me.";
		} else if (moveName.equals("Rapid Spin")) {
			power = 20;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 40;
			description = "Inflicts regular damage.  Removes leech seed from the user, frees the user from bind, clamp, fire spin, magma storm, sand tomb, whirlpool, and wrap, and clears spikes, stealth rock, and toxic spikes from the user's side of the field.  If this move misses or has no effect, its effect doesn't activate.";
		} else if (moveName.equals("Sweet Scent")) {
			power = 0;
			category = "debuff";
			type = "normal";
			accuracy = 100;
			pp = 20;
			description = "Lowers the target's evasion by one stage.";
		} else if (moveName.equals("Iron Tail")) {
			power = 100;
			category = "physical";
			type = "steel";
			accuracy = 75;
			pp = 15;
			description = "Inflicts regular damage.  Has a 30% chance to lower the target's Defense by one stage.";
		} else if (moveName.equals("Metal Claw")) {
			power = 50;
			category = "physical";
			type = "steel";
			accuracy = 95;
			pp = 35;
			description = "Inflicts regular damage. Has a 10% chance to raise the user's Attack one stage.";
		} else if (moveName.equals("Vital Throw")) {
			power = 70;
			category = "physical";
			type = "fighting";
			priority = -1;
			accuracy = 101;
			pp = 10;
			description = "Inflicts regular damage.  Ignores accuracy and evasion modifiers.";
		} else if (moveName.equals("Morning Sun")) {
			power = 0;
			category = "healing";
			type = "normal";
			accuracy = 101;
			pp = 5;
			description = "Heals the user for half its max HP.During sunny day, the healing is increased to 2/3 max HP.During hail, rain dance, or sandstorm, the healing is decreased to 1/4 max HP.";
		} else if (moveName.equals("Synthesis")) {
			power = 0;
			category = "healing";
			type = "grass";
			accuracy = 101;
			pp = 5;
			description = "Heals the user for half its max HP.During sunny day, the healing is increased to 2/3 max HP.During hail, rain dance, or sandstorm, the healing is decreased to 1/4 max HP.";
		} else if (moveName.equals("Moonlight")) {
			power = 0;
			category = "healing";
			type = "fairy";
			accuracy = 101;
			pp = 5;
			description = "Heals the user for half its max HP.During sunny day, the healing is increased to 2/3 max HP.During hail, rain dance, or sandstorm, the healing is decreased to 1/4 max HP.";
		} else if (moveName.equals("Hidden Power")) {
			power = 60;
			category = "special";
			type = "normal";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Fighting")) {
			power = 60;
			category = "special";
			type = "fighting";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Flying")) {
			power = 60;
			category = "special";
			type = "flying";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Poison")) {
			power = 60;
			category = "special";
			type = "poison";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Ground")) {
			power = 60;
			category = "special";
			type = "ground";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Rock")) {
			power = 60;
			category = "special";
			type = "rock";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Bug")) {
			power = 60;
			category = "special";
			type = "bug";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Ghost")) {
			power = 60;
			category = "special";
			type = "ghost";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Steel")) {
			power = 60;
			category = "special";
			type = "steel";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Fire")) {
			power = 60;
			category = "special";
			type = "fire";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Water")) {
			power = 60;
			category = "special";
			type = "water";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Grass")) {
			power = 60;
			category = "special";
			type = "grass";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Electric")) {
			power = 60;
			category = "special";
			type = "electric";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Psychic")) {
			power = 60;
			category = "special";
			type = "psychic";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Ice")) {
			power = 60;
			category = "special";
			type = "ice";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Dragon")) {
			power = 60;
			category = "special";
			type = "dragon";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Dark")) {
			power = 60;
			category = "special";
			type = "dark";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Hidden Power Fairy")) {
			power = 60;
			category = "special";
			type = "fairy";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's IV.Power is given by `x * 40 / 63 + 30`.  `x` is obtained by arranging bit 1 from the IV for each of Special Defense, Special Attack, Speed, Defense, Attack, and HP in that order.  (Bit 1 is 1 if the IV is of the form `4n + 2` or `4n + 3`.  `x` is then 64 * Special Defense IV bit 1, plus 32 * Special Attack IV bit 1, etc.)Power is always between 30 and 70, inclusive.  Average power is 49.5.Type is given by `y * 15 / 63`, where `y` is similar to `x` above, except constructed from bit 0.  (Bit 0 is 1 if the IV is odd.)  The result is looked up in the following table.Value | Type    : |             0 | fighting    1 | flying    2 | poison    3 | ground    4 | rock    5 | bug    6 | ghost    7 | steel    8 | fire    9 | water   10 | grass   11 | electric   12 | psychic   13 | ice   14 | dragon   15 | darkThis move thus cannot be normal.  Most other types have an equal 1/16 chance to be selected, given random IV.  However, due to the flooring used here, bug, fighting, and grass appear 5/64 of the time, and dark only 1/64 of the time.";
		} else if (moveName.equals("Cross Chop")) {
			power = 100;
			category = "physical";
			type = "fighting";
			accuracy = 80;
			pp = 5;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move.";
		} else if (moveName.equals("Twister")) {
			power = 40;
			category = "special";
			type = "dragon";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Has a 20% chance to make each target flinch.If the target is under the effect of bounce, fly, or sky drop, this move will hit with double power.";
		} else if (moveName.equals("Rain Dance")) {
			power = 0;
			category = "misc";
			type = "water";
			accuracy = 101;
			pp = 5;
			description = "Changes the weather to rain for five turns, during which water moves inflict 50% extra damage, and fire moves inflict half damage.If the user is holding damp rock, this effect lasts for eight turns.thunder has 100% accuracy.  If the target has used detect or protect, thunder has a (100   accuracy)% chance to break through the protection.solar beam has half power.moonlight, morning sun, and synthesis heal only 1/4 of the user's max HP.Pokémon with swift swim have doubled original Speed.Pokémon with forecast become water.Pokémon with dry skin heal 1/8 max HP, Pokémon with hydration are cured of major status effects effects, and Pokémon with rain dish heal 1/16 max HP at the end of each turn.";
		} else if (moveName.equals("Sunny Day")) {
			power = 0;
			category = "misc";
			type = "fire";
			accuracy = 101;
			pp = 5;
			description = "Changes the weather to sunshine for five turns, during which fire moves inflict 50% extra damage, and water moves inflict half damage.If the user is holding heat rock, this effect lasts for eight turns.Pokémon cannot become frozen.thunder has 50% accuracy.solar beam skips its charge turn.moonlight, morning sun, and synthesis heal 2/3 of the user's max HP.Pokémon with chlorophyll have doubled original Speed.Pokémon with forecast become fire.Pokémon with leaf guard are not affected by major status effects effects.Pokémon with flower gift change form; every Pokémon on their side of the field have their original Attack and Special Attack increased by 50%.Pokémon with dry skin lose 1/8 max HP at the end of each turn.Pokémon with solar power have their original Special Attack raised by 50% but lose 1/8 their max HP at the end of each turn.";
		} else if (moveName.equals("Crunch")) {
			power = 80;
			category = "physical";
			type = "dark";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 20% chance to lower the target's Defense by one stage.";
		} else if (moveName.equals("Mirror Coat")) {
			power = 1;
			category = "misc";
			type = "psychic";
			priority = -5;
			accuracy = 100;
			pp = 20;
			description = "Targets the last opposing Pokémon to hit the user with a special move this turn.  Inflicts twice the damage that move did to the user.  If there is no eligible target, this move will fail.  Type immunity applies, but other type effects are ignored.This move cannot be copied by mirror move, nor selected by assist or metronome.";
		} else if (moveName.equals("Psych Up")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 10;
			description = "Discards the user's stat changes and copies the target's.This move cannot be copied by mirror move.";
		} else if (moveName.equals("Extreme Speed")) {
			power = 80;
			category = "physical";
			type = "normal";
			priority = 2;
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Ancient Power")) {
			power = 60;
			category = "special";
			type = "rock";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage. Has a 10% chance to raise all of the user's stats one stage.";
		} else if (moveName.equals("Shadow Ball")) {
			power = 80;
			category = "special";
			type = "ghost";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 20% chance to lower the target's Special Defense by one stage.";
		} else if (moveName.equals("Future Sight")) {
			power = 100;
			category = "misc";
			type = "psychic";
			accuracy = 100;
			pp = 10;
			description = "Inflicts typeless regular damage at the end of the third turn, starting with this one.  This move cannot score a critical hit.  If the target switches out, its replacement will be hit instead.  Damage is calculated at the time this move is used; stat changes and switching out during the delay won't change the damage inflicted.  No move with this effect can be used against the same target again until after the end of the third turn.This effect breaks through wonder guard.If the target is protected by protect or detect on the turn this move is used, this move will fail.  However, the damage on the third turn will break through protection.The damage is applied at the end of the turn, so it ignores endure and focus sash.This move cannot be copied by mirror move.";
		} else if (moveName.equals("Rock Smash")) {
			power = 40;
			category = "physical";
			type = "fighting";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 50% chance to lower the target's Defense by one stage.";
		} else if (moveName.equals("Whirlpool")) {
			power = 35;
			category = "special";
			type = "water";
			accuracy = 85;
			pp = 15;
			description = "Inflicts regular damage.  For the next 2�??5 turns, the target cannot leave the field and is damaged for 1/16 its max HP at the end of each turn.  The user continues to use other moves during this time.  If the user leaves the field, this effect ends.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.If the target is in the first turn of dive, this move will hit with double power.";
		} else if (moveName.equals("Beat Up")) {
			power = 1;
			category = "physical";
			type = "dark";
			accuracy = 100;
			pp = 10;
			description = "Inflicts typeless regular damage.  Every Pokémon in the user's party, excepting those that have fainted or have a major status effect effect, attacks the target.  Calculated stats are ignored; the base stats for the target and assorted attackers are used instead.  The random factor in the damage formula is not used.  dark Pokémon still get STAB.This effect breaks through wonder guard.";
		} else if (moveName.equals("Fake Out")) {
			power = 40;
			category = "physical";
			type = "normal";
			priority = 3;
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Causes the target to flinch.  Can only be used on the user's first turn after entering the field.";
		} else if (moveName.equals("Uproar")) {
			power = 90;
			category = "special";
			type = "normal";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  User is forced to use this move for 2�??5 turns, selected at random.  All Pokémon on the field wake up, and none can fall to sleep until the lock in ends.Pokémon cannot use rest during this effect.This move cannot be selected by sleep talk.";
		} else if (moveName.equals("Stockpile")) {
			power = 0;
			category = "buff";
			type = "normal";
			accuracy = 101;
			pp = 20;
			description = "Raises the user's Defense and Special Defense by one stage each.  Stores energy for use with spit up and swallow.  Up to three levels of energy can be stored, and all are lost if the user leaves the field.  Energy is still stored even if the stat boosts cannot be applied.If the user uses baton pass, the stat boosts are passed as normal, but the stored energy is not.";
		} else if (moveName.equals("Spit Up")) {
			power = 1;
			category = "misc";
			type = "normal";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Power is equal to 100 times the amount of energy stored by stockpile.  Ignores the random factor in the damage formula.  Stored energy is consumed, and the user's Defense and Special Defense are reset to what they would be if stockpile had not been used.  If the user has no energy stored, this move will fail.This move cannot be copied by mirror move.";
		} else if (moveName.equals("Swallow")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 10;
			description = "Heals the user depending on the amount of energy stored by stockpile: 1/4 its max HP after one use, 1/2 its max HP after two uses, or fully after three uses.  Stored energy is consumed, and the user's Defense and Special Defense are reset to what they would be if stockpile had not been used.  If the user has no energy stored, this move will fail.";
		} else if (moveName.equals("Heat Wave")) {
			power = 100;
			category = "special";
			type = "fire";
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage.  Has a 10% chance to burn the target.";
		} else if (moveName.equals("Hail")) {
			power = 0;
			category = "misc";
			type = "ice";
			accuracy = 101;
			pp = 10;
			description = "Changes the weather to hail for five turns, during which non ice Pokémon are damaged for 1/16 their max HP at the end of every turn.If the user is holding icy rock, this effect lasts for eight turns.blizzard has 100% accuracy.  If the target has used detect or protect, blizzard has a (100   accuracy)% chance to break through the protection.moonlight, morning sun, and synthesis heal only 1/4 of the user's max HP.Pokémon with snow cloak are exempt from this effect's damage.";
		} else if (moveName.equals("Torment")) {
			power = 0;
			category = "misc";
			type = "dark";
			accuracy = 100;
			pp = 15;
			description = "Prevents the target from attempting to use the same move twice in a row.  When the target leaves the field, this effect ends.If the target is forced to attempt a repeated move due to choice band, choice scarf, choice specs, disable, encore, taunt, only having PP remaining for one move, or any other effect, the target will use struggle instead.  The target is then free to use the forced move next turn, as it didn't use that move this turn.";
		} else if (moveName.equals("Flatter")) {
			power = 0;
			category = "buff";
			type = "dark";
			accuracy = 100;
			pp = 15;
			description = "Raises the target's Special Attack by one stage, then confuses it.";
		} else if (moveName.equals("Will-O-Wisp")) {
			power = 0;
			category = "status";
			type = "fire";
			accuracy = 75;
			pp = 15;
			description = "Burns the target.";
		} else if (moveName.equals("Memento")) {
			power = 0;
			category = "debuff";
			type = "dark";
			accuracy = 100;
			pp = 10;
			description = "Lowers the target's Attack and Special Attack by two stages.  User faints.";
		} else if (moveName.equals("Facade")) {
			power = 70; //1
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  If the user is burned, paralyzed, or poisoned, this move has double power.";
		} else if (moveName.equals("Focus Punch")) {
			power = 150;
			category = "physical";
			type = "fighting";
			priority = -3;
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  If the user takes damage this turn before hitting, this move will fail.This move cannot be copied by mirror move, nor selected by assist, metronome, or sleep talk.";
		} else if (moveName.equals("Smelling Salts")) {
			power = 60;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  If the target is paralyzed, this move has double power, and the target is cured of its paralysis.";
		} else if (moveName.equals("Follow Me")) {
			power = 0;
			category = "misc";
			type = "normal";
			priority = 2;
			accuracy = 101;
			pp = 20;
			description = "Until the end of this turn, any moves that opposing Pokémon target solely at the user's ally will instead target the user.  If both Pokémon on the same side of the field use this move on the same turn, the Pokémon that uses it last will become the target.This effect takes priority over lightningrod and storm drain.If the user's ally switches out, opposing Pokémon may still hit it with pursuit.This move cannot be selected by assist or metronome.";
		} else if (moveName.equals("Nature Power")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 20;
			description = "Uses another move chosen according to the terrain.Terrain                   | Selected move                          |                   Building                  | tri attackCave                      | rock slideDeep water                | hydro pumpDesert                    | earthquakeGrass                     | seed bombMountain                  | rock slideRoad                      | earthquakeShallow water             | hydro pumpSnow                      | blizzardTall grass                | seed bombelectric terrain | thunderboltgrassy terrain   | energy ballmisty terrain    | moonblastIn Pokémon Battle Revolution:Terrain        | Selected move               |                   Courtyard      | tri attackCrystal        | rock slideGateway        | hydro pumpMagma          | rock slideMain Street    | tri attackNeon           | tri attackStargazer      | rock slideSunny Park     | seed bombSunset         | earthquakeWaterfall      | seed bombThis move cannot be copied by mirror move.";
		} else if (moveName.equals("Charge")) {
			power = 0;
			category = "buff";
			type = "electric";
			accuracy = 101;
			pp = 20;
			description = "Raises the user's Special Defense by one stage.  If the user uses an electric move next turn, its power will be doubled.";
		} else if (moveName.equals("Taunt")) {
			power = 0;
			category = "misc";
			type = "dark";
			accuracy = 100;
			pp = 20;
			description = "Target is forced to only use damaging moves for the next 3�??5 turns, selected at random.  Moves that select other moves not known in advance do not count as damaging.assist, copycat, me first, metronome, mirror move, and sleep talk do not directly inflict damage and thus may not be used.bide, counter, endeavor, metal burst, and mirror coat are allowed.";
		} else if (moveName.equals("Helping Hand")) {
			power = 0;
			category = "misc";
			type = "normal";
			priority = 5;
			accuracy = 101;
			pp = 20;
			description = "Boosts the power of the target's moves by 50% until the end of this turn.This move cannot be copied by mirror move, nor selected by assist or metronome.";
		} else if (moveName.equals("Trick")) {
			power = 0;
			category = "misc";
			type = "psychic";
			accuracy = 100;
			pp = 10;
			description = "User and target permanently swap held item.  Works even if one of the Pokémon isn't holding anything.  If either Pokémon is holding mail, this move will fail.If either Pokémon has multitype or sticky hold, this move will fail.If this move results in a Pokémon obtaining choice band, choice scarf, or choice specs, and that Pokémon was the latter of the pair to move this turn, then the move it used this turn becomes its chosen forced move.  This applies even if both Pokémon had a choice item before this move was used.  If the first of the two Pokémon gains a choice item, it may select whatever choice move it wishes next turn.Neither the user nor the target can recover its item with recycle.This move cannot be selected by assist or metronome.";
		} else if (moveName.equals("Role Play")) {
			power = 0;
			category = "misc";
			type = "psychic";
			accuracy = 101;
			pp = 10;
			description = "User's ability is replaced with the target's until the user leaves the field.  Ignores accuracy and evasion modifiers.If the target has flower gift, forecast, illusion, imposter, multitype, stance change, trace, wonder guard, or zen mode, this move will fail.This move cannot be copied by mirror move.";
		} else if (moveName.equals("Wish")) {
			power = 0;
			category = "healing";
			type = "normal";
			accuracy = 101;
			pp = 10;
			description = "At the end of the next turn, user will be healed for half its max HP.  If the user is switched out, its replacement will be healed instead for half of the user's max HP.  If the user faint or is forcefully switched by roar or whirlwind, this effect will not activate.";
		} else if (moveName.equals("Assist")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 20;
			description = "Uses a move from another Pokémon in the user's party, both selected at random.  Moves from fainted Pokémon can be used.  If there are no eligible Pokémon or moves, this move will fail.This move will not select assist, chatter, circle throw, copycat, counter, covet, destiny bond, detect, dig, dive, dragon tail, endure, feint, fly focus punch, follow me, helping hand, me first, metronome, mimic, mirror coat, mirror move, phantom force protect, quick guard, roar shadow force, sketch, sleep talk, snatch, struggle, switcheroo, thief, trick, whirlwind, or wide guard.This move cannot be copied by mirror move, nor selected by metronome or sleep talk.";
		} else if (moveName.equals("Ingrain")) {
			power = 0;
			category = "misc";
			type = "grass";
			accuracy = 101;
			pp = 20;
			description = "Prevents the user from switching out.  User regains 1/16 of its max HP at the end of every turn.  If the user was immune to ground attacks, it will now take normal damage from them.roar and whirlwind will not affect the user.  The user cannot use magnet rise.The user may still use u turn to leave the field.This effect can be passed with baton pass.";
		} else if (moveName.equals("Superpower")) {
			power = 120;
			category = "physical";
			type = "fighting";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage, then lowers the user's Attack and Defense by one stage each.";
		} else if (moveName.equals("Magic Coat")) {
			power = 0;
			category = "misc";
			type = "psychic";
			priority = 4;
			accuracy = 101;
			pp = 15;
			description = "The first non damaging move targeting the user this turn that inflicts major status effect effects, stat change, or trap effects will be reflected at its user.defog, memento, and teeter dance are not reflected.attract, flatter, gastro acid, leech seed, swagger, worry seed, and yawn are reflected.This move cannot be copied by mirror move.";
		} else if (moveName.equals("Recycle")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 10;
			description = "User recovers the last item consumed by the user or a Pokémon in its position on the field.  The item must be used again before it can be recovered by this move again.  If the user is holding an item, this move fail.Items taken or given away by covet, knock off, switcheroo, thief, or trick may not be recovered.";
		} else if (moveName.equals("Revenge")) {
			power = 60;
			category = "physical";
			type = "fighting";
			priority = -4;
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  If the target damaged the user this turn and was the last to do so, this move has double power.pain split does not count as damaging the user.";
		} else if (moveName.equals("Brick Break")) {
			power = 75;
			category = "physical";
			type = "fighting";
			accuracy = 100;
			pp = 15;
			description = "Destroys any light screen or reflect on the target's side of the field, then inflicts regular damage.  The barriers are destroyed even if this move has no effect.";
		} else if (moveName.equals("Yawn")) {
			power = 0;
			category = "status";
			type = "normal";
			accuracy = 101;
			pp = 10;
			description = "Puts the target to sleep at the end of the next turn.  Ignores accuracy and evasion modifiers.  If the target leaves the field, this effect is canceled.  If the target has a status effect when this move is used, this move will fail.If the target is protected by safeguard when this move is used, this move will fail.insomnia and vital spirit prevent the sleep if the target has either at the end of the next turn, but will not cause this move to fail on use.";
		} else if (moveName.equals("Knock Off")) {
			power = 65;
			category = "physical";
			type = "dark";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Target loses its held item. Deals 50% more damage if used on a Pokemon holding an item that can be lost. Neither the user nor the target can recover its item with recycle.If the target has multitype or sticky hold, it will take damage but not lose its item.";
		} else if (moveName.equals("Endeavor")) {
			power = 1;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 5;
			description = "Inflicts exactly enough damage to lower the target's HP to equal the user's.  If the target's HP is not higher than the user's, this move has no effect.  Type immunity applies, but other type effects are ignored.  This effect counts as damage for moves that respond to damage.";
		} else if (moveName.equals("Eruption")) {
			power = 150;
			category = "special";
			type = "fire";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.  Power increases with the user's remaining HP and is given by `150 * HP / max HP`, to a maximum of 150 when the user has full HP.";
		} else if (moveName.equals("Skill Swap")) {
			power = 0;
			category = "misc";
			type = "psychic";
			accuracy = 101;
			pp = 10;
			description = "User and target switch abilities.  Ignores accuracy and evasion modifiers.If either Pokémon has multitype or wonder guard, this move will fail.";
		} else if (moveName.equals("Imprison")) {
			power = 0;
			category = "misc";
			type = "psychic";
			accuracy = 101;
			pp = 10;
			description = "Prevents any Pokémon on the opposing side of the field from using any move the user knows until the user leaves the field.  This effect is live; if the user obtains new moves while on the field, these moves become restricted.  If no opposing Pokémon knows any of the user's moves when this move is used, this move will fail.";
		} else if (moveName.equals("Refresh")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 20;
			description = "Removes a burn, paralysis, or poison from the user.";
		} else if (moveName.equals("Grudge")) {
			power = 0;
			category = "death";
			type = "ghost";
			accuracy = 101;
			pp = 5;
			description = "If the user faint before it next acts, the move that fainted it will have its PP dropped to 0.  End of turn damage does not trigger this effect.";
		} else if (moveName.equals("Snatch")) {
			power = 0;
			category = "misc";
			type = "dark";
			priority = 4;
			accuracy = 101;
			pp = 10;
			description = "The next time a Pokémon uses a beneficial move on itself or itself and its ally this turn, the user of this move will steal the move and use it itself.  Moves which may be stolen by this move are identified by the \"snatchable\" flag.If two Pokémon use this move on the same turn, the faster Pokémon will steal the first beneficial move, and the slower Pokémon will then steal it again�??thus, only the slowest Pokémon using this move ultimately gains a stolen move's effect.If the user steals psych up, it will target the Pokémon that used psych up.  If the user was the original target of psych up, and the Pokémon that originally used it's affected by pressure, it will only lose 1 PP.This move cannot be copied by mirror move, nor selected by assist or metronome.";
		} else if (moveName.equals("Secret Power")) {
			power = 70;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Has a 30% chance to inflict an effect chosen according to the terrain.Terrain        | Effect               |                                                              Building       | Paralyze targetCave           | Makes target flinchDeep water     | Lowers target's Attack by one stageDesert         | Lowers target's accuracy by one stageGrass          | Puts target to sleepMountain       | Makes target flinchRoad           | Lowers target's accuracy by one stageShallow water  | Lowers target's Attack by one stageSnow           | Freezes targetTall grass     | Puts target to sleepIn Pokémon Battle Revolution:Terrain        | Effect               |                                                              Courtyard      | Paralyze targetCrystal        | Makes target flinchGateway        | Lowers target's Attack by one stageMagma          | Makes target flinchMain Street    | Paralyze targetNeon           | Paralyze targetStargazer      | Makes target flinchSunny Park     | Puts target to sleepSunset         | Lowers target's accuracy by one stageWaterfall      | Puts target to sleep";
		} else if (moveName.equals("Dive")) {
			power = 80;
			category = "physical";
			type = "water";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  User dives underwater for one turn, becoming immune to attack, and hits on the second turn.During the immune turn, surf, and whirlpool still hit the user normally, and their power is doubled if appropriate.The user may be hit during its immune turn if under the effect of lock on, mind reader, or no guard.This move cannot be selected by sleep talk.";
		} else if (moveName.equals("Arm Thrust")) {
			power = 47;
			category = "physical";
			type = "fighting";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Hits 2-5 times in one turn.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.";
		} else if (moveName.equals("Camouflage")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 20;
			description = "User's type changes according to the terrain.Terrain        | New type               |               Building       | normalCave           | rockDesert         | groundGrass          | grassMountain       | rockOcean          | waterPond           | waterRoad           | groundSnow           | iceTall grass     | grassIn Pokémon Battle Revolution:Terrain        | New type               |               Courtyard      | normalCrystal        | rockGateway        | waterMagma          | rockMain Street    | normalNeon           | normalStargazer      | rockSunny Park     | grassSunset         | groundWaterfall      | grass";
		} else if (moveName.equals("Tail Glow")) {
			power = 0;
			category = "buff";
			type = "bug";
			accuracy = 101;
			pp = 20;
			description = "Raises the user's Special Attack by three stages.";
		} else if (moveName.equals("Luster Purge")) {
			power = 70;
			category = "special";
			type = "psychic";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.  Has a 50% chance to lower the target's Special Defense by one stage.";
		} else if (moveName.equals("Mist Ball")) {
			power = 70;
			category = "special";
			type = "psychic";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.  Has a 50% chance to lower the target's Special Attack by one stage.";
		} else if (moveName.equals("Feather Dance")) {
			power = 0;
			category = "debuff";
			type = "flying";
			accuracy = 100;
			pp = 15;
			description = "Lowers the target's Attack by two stages.";
		} else if (moveName.equals("Teeter Dance")) {
			power = 0;
			category = "status";
			type = "normal";
			accuracy = 100;
			pp = 20;
			description = "Confuse all targets.";
		} else if (moveName.equals("Blaze Kick")) {
			power = 85;
			category = "physical";
			type = "fire";
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move. Has a 10% chance to burn the target.";
		} else if (moveName.equals("Mud Sport")) {
			power = 0;
			category = "misc";
			type = "ground";
			accuracy = 101;
			pp = 15;
			description = "electric moves inflict half damage, regardless of target.  If the user leaves the field, this effect ends.";
		} else if (moveName.equals("Ice Ball")) {
			power = 30;
			category = "physical";
			type = "ice";
			accuracy = 90;
			pp = 20;
			description = "Inflicts regular damage.  User is forced to use this move for five turns.  Power doubles every time this move is used in succession to a maximum of 16x, and resets to normal after the lock in ends.  If this move misses or becomes unusable, the lock in ends.If the user has used defense curl since entering the field, this move has double power.";
		} else if (moveName.equals("Needle Arm")) {
			power = 60;
			category = "physical";
			type = "grass";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 30% chance to make the target flinch.";
		} else if (moveName.equals("Slack Off")) {
			power = 0;
			category = "healing";
			type = "normal";
			accuracy = 101;
			pp = 10;
			description = "Heals the user for half its max HP.";
		} else if (moveName.equals("Hyper Voice")) {
			power = 90;
			category = "special";
			type = "normal";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Poison Fang")) {
			power = 50;
			category = "physical";
			type = "poison";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 30% chance to badly poison the target.";
		} else if (moveName.equals("Crush Claw")) {
			power = 75;
			category = "physical";
			type = "normal";
			accuracy = 95;
			pp = 10;
			description = "Inflicts regular damage.  Has a 50% chance to lower the target's Defense by one stage.";
		} else if (moveName.equals("Blast Burn")) {
			power = 150;
			category = "special";
			type = "fire";
			accuracy = 90;
			pp = 5;
			description = "Inflicts regular damage.  User loses its next turn to \"recharge\", and cannot attack or switch out during that turn.";
		} else if (moveName.equals("Hydro Cannon")) {
			power = 150;
			category = "special";
			type = "water";
			accuracy = 90;
			pp = 5;
			description = "Inflicts regular damage.  User loses its next turn to \"recharge\", and cannot attack or switch out during that turn.";
		} else if (moveName.equals("Meteor Mash")) {
			power = 100;
			category = "physical";
			type = "steel";
			accuracy = 85;
			pp = 10;
			description = "Inflicts regular damage. Has a 20% chance to raise the user's Attack one stage.";
		} else if (moveName.equals("Astonish")) {
			power = 30;
			category = "physical";
			type = "ghost";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 30% chance to make the target flinch.";
		} else if (moveName.equals("Weather Ball")) {
			power = 50;
			category = "special";
			type = "normal";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  If a weather move is active, this move has double power, and its type becomes the type of the weather move.  shadow sky is typeless for the purposes of this move.";
		} else if (moveName.equals("Aromatherapy")) {
			power = 0;
			category = "misc";
			type = "grass";
			accuracy = 101;
			pp = 5;
			description = "Removes major status effects effects and confusion from every Pokémon in the user's party.";
		} else if (moveName.equals("Fake Tears")) {
			power = 0;
			category = "debuff";
			type = "dark";
			accuracy = 100;
			pp = 20;
			description = "Lowers the target's Special Defense by two stages.";
		} else if (moveName.equals("Air Cutter")) {
			power = 55;
			category = "special";
			type = "flying";
			accuracy = 95;
			pp = 25;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move.";
		} else if (moveName.equals("Overheat")) {
			power = 140;
			category = "special";
			type = "fire";
			accuracy = 90;
			pp = 5;
			description = "Inflicts regular damage, then lowers the user's Special Attack by two stages.";
		} else if (moveName.equals("Odor Sleuth")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 40;
			description = "Resets the target's evasion to normal and prevents any further boosting until the target leaves the field.  A ghost under this effect takes normal damage from normal and fighting moves.  This move itself ignores accuracy and evasion modifiers.";
		} else if (moveName.equals("Rock Tomb")) {
			power = 60;
			category = "physical";
			type = "rock";
			accuracy = 95;
			pp = 10;
			description = "Inflicts regular damage.  Has a 100% chance to lower the target's Speed by one stage.";
		} else if (moveName.equals("Silver Wind")) {
			power = 60;
			category = "special";
			type = "bug";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage. Has a 10% chance to raise all of the user's stats one stage.";
		} else if (moveName.equals("Metal Sound")) {
			power = 0;
			category = "debuff";
			type = "steel";
			accuracy = 85;
			pp = 40;
			description = "Lowers the target's Special Defense by two stages.";
		} else if (moveName.equals("Grass Whistle")) {
			power = 0;
			category = "status";
			type = "grass";
			accuracy = 55;
			pp = 15;
			description = "Puts the target to sleep.";
		} else if (moveName.equals("Tickle")) {
			power = 0;
			category = "debuff";
			type = "normal";
			accuracy = 100;
			pp = 20;
			description = "Lowers the target's Attack and Defense by one stage.";
		} else if (moveName.equals("Cosmic Power")) {
			power = 0;
			category = "buff";
			type = "psychic";
			accuracy = 101;
			pp = 20;
			description = "Raises the user's Defense and Special Defense by one stage.";
		} else if (moveName.equals("Water Spout")) {
			power = 75;
			category = "special";
			type = "water";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.  Power increases with the user's remaining HP and is given by `150 * HP / max HP`, to a maximum of 150 when the user has full HP.";
		} else if (moveName.equals("Signal Beam")) {
			power = 75;
			category = "special";
			type = "bug";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 10% chance to confuse the target.";
		} else if (moveName.equals("Shadow Punch")) {
			power = 60;
			category = "physical";
			type = "ghost";
			accuracy = 101;
			pp = 20;
			description = "Inflicts regular damage.  Ignores accuracy and evasion modifiers.";
		} else if (moveName.equals("Extrasensory")) {
			power = 80;
			category = "special";
			type = "psychic";
			accuracy = 100;
			pp = 30;
			description = "Inflicts regular damage.  Has a 10% chance to make the target flinch.";
		} else if (moveName.equals("Sky Uppercut")) {
			power = 85;
			category = "physical";
			type = "fighting";
			accuracy = 90;
			pp = 15;
			description = "Inflicts regular damage.This move can hit Pokémon under the effect of bounce, fly, or sky drop.";
		} else if (moveName.equals("Sand Tomb")) {
			power = 105; // 3 * 35
			category = "physical";
			type = "ground";
			accuracy = 85;
			pp = 15;
			description = "Inflicts regular damage.  For the next 2�??5 turns, the target cannot leave the field and is damaged for 1/16 its max HP at the end of each turn.  The user continues to use other moves during this time.  If the user leaves the field, this effect ends.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.rapid spin cancels this effect.";
		} else if (moveName.equals("Sheer Cold")) {
			power = 1;
			category = "special";
			type = "ice";
			accuracy = 30;
			pp = 5;
			description = "Inflicts damage equal to the target's max HP.  Ignores accuracy and evasion modifiers.  This move's accuracy is 30% plus 1% for each level the user is higher than the target.  If the user is a lower level than the target, this move will fail.Because this move inflicts a specific and finite amount of damage, endure still prevents the target from fainting.The effects of lock on, mind reader, and no guard still apply, as long as the user is equal or higher level than the target.  However, they will not give this move a chance to break through detect or protect.";
		} else if (moveName.equals("Muddy Water")) {
			power = 95;
			category = "special";
			type = "water";
			accuracy = 85;
			pp = 10;
			description = "Inflicts regular damage.  Has a 30% chance to lower the target's accuracy by one stage.";
		} else if (moveName.equals("Bullet Seed")) {
			power = 79;
			category = "grass";
			type = "grass";
			accuracy = 100;
			pp = 30;
			description = "Inflicts regular damage.  Hits 2-5 times in one turn.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.";
		} else if (moveName.equals("Aerial Ace")) {
			power = 60;
			category = "physical";
			type = "flying";
			accuracy = 101;
			pp = 20;
			description = "Inflicts regular damage.  Ignores accuracy and evasion modifiers.";
		} else if (moveName.equals("Icicle Spear")) {
			power = 79;
			category = "physical";
			type = "ice";
			accuracy = 100;
			pp = 30;
			description = "Inflicts regular damage.  Hits 2-5 times in one turn.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.";
		} else if (moveName.equals("Iron Defense")) {
			power = 0;
			category = "buff";
			type = "steel";
			accuracy = 101;
			pp = 15;
			description = "Raises the user's Defense by two stages.";
		} else if (moveName.equals("Block")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 5;
			description = "The target cannot switch out normally.  Ignores accuracy and evasion modifiers.  This effect ends when the user leaves the field.The target may still escape by using baton pass, u turn, or a shed shell.Both the user and the target pass on this effect with baton pass.";
		} else if (moveName.equals("Howl")) {
			power = 0;
			category = "buff";
			type = "normal";
			accuracy = 101;
			pp = 40;
			description = "Raises the user's Attack by one stage.";
		} else if (moveName.equals("Dragon Claw")) {
			power = 80;
			category = "physical";
			type = "dragon";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Frenzy Plant")) {
			power = 150;
			category = "special";
			type = "grass";
			accuracy = 90;
			pp = 5;
			description = "Inflicts regular damage.  User loses its next turn to \"recharge\", and cannot attack or switch out during that turn.";
		} else if (moveName.equals("Bulk Up")) {
			power = 0;
			category = "buff";
			type = "fighting";
			accuracy = 101;
			pp = 20;
			description = "Raises the user's Attack and Defense by one stage each.";
		} else if (moveName.equals("Bounce")) {
			power = 85;
			category = "physical";
			type = "flying";
			accuracy = 85;
			pp = 5;
			description = "Inflicts regular damage.  User bounces high into the air for one turn, becoming immune to attack, and hits on the second turn.  Has a 30% chance to paralyze the target.During the immune turn, gust, hurricane, sky uppercut, smack down, thunder, and twister still hit the user normally.  gust and twister also have double power against the user.The damage from hail and sandstorm still applies during the immune turn.The user may be hit during its immune turn if under the effect of lock on, mind reader, or no guard.This move cannot be used while gravity is in effect.This move cannot be selected by sleep talk.";
		} else if (moveName.equals("Mud Shot")) {
			power = 55;
			category = "special";
			type = "ground";
			accuracy = 95;
			pp = 15;
			description = "Inflicts regular damage.  Has a 100% chance to lower the target's Speed by one stage.";
		} else if (moveName.equals("Poison Tail")) {
			power = 50;
			category = "physical";
			type = "poison";
			accuracy = 100;
			pp = 25;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move. Has a 10% chance to poison the target.";
		} else if (moveName.equals("Covet")) {
			power = 60;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 40;
			description = "Inflicts regular damage.  If the target is holding an item and the user is not, the user will permanently take the item.  Damage is still inflicted if an item cannot be taken.Pokémon with sticky hold or multitype are immune to the item theft effect.The target cannot recover its item with recycle.This move cannot be selected by assist or metronome.";
		} else if (moveName.equals("Volt Tackle")) {
			power = 120;
			category = "physical";
			type = "electric";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  User takes 1/3 the damage it inflicts in recoil.  Has a 10% chance to paralyze the target.";
		} else if (moveName.equals("Magical Leaf")) {
			power = 60;
			category = "special";
			type = "grass";
			accuracy = 101;
			pp = 20;
			description = "Inflicts regular damage.  Ignores accuracy and evasion modifiers.";
		} else if (moveName.equals("Water Sport")) {
			power = 0;
			category = "debuff";
			type = "water";
			accuracy = 101;
			pp = 15;
			description = "fire moves inflict half damage, regardless of target.  If the user leaves the field, this effect ends.";
		} else if (moveName.equals("Calm Mind")) {
			power = 0;
			category = "buff";
			type = "psychic";
			accuracy = 101;
			pp = 20;
			description = "Raises the user's Special Attack and Special Defense by one stage each.";
		} else if (moveName.equals("Leaf Blade")) {
			power = 90;
			category = "physical";
			type = "grass";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move.";
		} else if (moveName.equals("Dragon Dance")) {
			power = 0;
			category = "buff";
			type = "dragon";
			accuracy = 101;
			pp = 20;
			description = "Raises the user's Attack and Speed by one stage each.";
		} else if (moveName.equals("Rock Blast")) {
			power = 79;
			category = "physical";
			type = "rock";
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage.  Hits 2�??5 times in one turn.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.";
		} else if (moveName.equals("Shock Wave")) {
			power = 60;
			category = "special";
			type = "electric";
			accuracy = 101;
			pp = 20;
			description = "Inflicts regular damage.  Ignores accuracy and evasion modifiers.";
		} else if (moveName.equals("Water Pulse")) {
			power = 60;
			category = "special";
			type = "water";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Has a 20% chance to confuse the target.";
		} else if (moveName.equals("Doom Desire")) {
			power = 140;
			category = "special";
			type = "steel";
			accuracy = 100;
			pp = 5;
			description = "Inflicts typeless regular damage at the end of the third turn, starting with this one.  This move cannot score a critical hit.  If the target switches out, its replacement will be hit instead.  Damage is calculated at the time this move is used; stat changes and switching out during the delay won't change the damage inflicted.  No move with this effect can be used against the same target again until after the end of the third turn.This effect breaks through wonder guard.If the target is protected by protect or detect on the turn this move is used, this move will fail.  However, the damage on the third turn will break through protection.The damage is applied at the end of the turn, so it ignores endure and focus sash.This move cannot be copied by mirror move.";
		} else if (moveName.equals("Psycho Boost")) {
			power = 140;
			category = "special";
			type = "psychic";
			accuracy = 90;
			pp = 5;
			description = "Inflicts regular damage, then lowers the user's Special Attack by two stages.";
		} else if (moveName.equals("Roost")) {
			power = 0;
			category = "healing";
			type = "flying";
			accuracy = 101;
			pp = 10;
			description = "Heals the user for half its max HP.  If the user is flying, its flying type is ignored until the end of this turn.";
		} else if (moveName.equals("Gravity")) {
			power = 0;
			category = "status";
			type = "psychic";
			accuracy = 101;
			pp = 5;
			description = "For five turns (including this one), all immunities to ground moves are disabled.  For the duration of this effect, the evasion of every Pokémon on the field is lowered by two stages.  Cancels the effects of bounce, fly, and sky drop.Specifically, flying Pokémon and those with levitate or that have used magnet rise are no longer immune to ground attacks, arena trap, spikes, or toxic spikes.bounce, fly, sky drop, high jump kick, jump kick, and splash cannot be used while this move is in effect.*Bug*: If this move is used during a double or triple battle while Pokémon are under the effect of sky drop, Sky Drop's effect is not correctly canceled on its target, and it remains high in the air indefinitely.  As Sky Drop prevents the target from acting, the only way to subsequently remove it from the field is to faint it.";
		} else if (moveName.equals("Miracle Eye")) {
			power = 0;
			category = "status";
			type = "psychic";
			accuracy = 101;
			pp = 40;
			description = "Resets the target's evasion to normal and prevents any further boosting until the target leaves the field.  A dark Pokémon under this effect takes normal damage from psychic moves.  This move itself ignores accuracy and evasion modifiers.";
		} else if (moveName.equals("Wake-Up Slap")) {
			power = 60;
			category = "physical";
			type = "fighting";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  If the target is sleep, this move has double power, and the target wakes up.";
		} else if (moveName.equals("Hammer Arm")) {
			power = 100;
			category = "physical";
			type = "fighting";
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage, then lowers the user's Speed by one stage.";
		} else if (moveName.equals("Gyro Ball")) {
			power = 1;
			category = "physical";
			type = "steel";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.  Power increases with the target's current Speed compared to the user, given by `1 + 25 * target Speed / user Speed`, capped at 150.";
		} else if (moveName.equals("Healing Wish")) {
			power = 0;
			category = "death";
			type = "psychic";
			accuracy = 101;
			pp = 10;
			description = "User faints.  Its replacement's HP is fully restored, and any major status effect effect is removed.  If the replacement Pokémon is immediately fainted by a switch in effect, the next replacement is healed by this move instead.";
		} else if (moveName.equals("Brine")) {
			power = 65;
			category = "special";
			type = "water";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  If the target has less than half its max HP remaining, this move has double power.";
		} else if (moveName.equals("Natural Gift")) {
			power = 1;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Power and type are determined by the user's held berry.  The berry is consumed.  If the user is not holding a berry, this move will fail.";
		} else if (moveName.equals("Feint")) {
			power = 30;
			category = "physical";
			type = "normal";
			priority = 2;
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Removes the effects of detect or protect from the target before hitting.This move cannot be copied by mirror move, nor selected by assist or metronome.";
		} else if (moveName.equals("Pluck")) {
			power = 60;
			category = "physical";
			type = "flying";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  If the target is holding a berry, this move has double power, and the user takes the berry and uses it immediately.If the target is holding a jaboca berry or rowap berry, the berry is still removed, but has no effect.If this move is super effective and the target is holding a berry that can reduce this move's damage, it will do so, and will not be stolen.";
		} else if (moveName.equals("Tailwind")) {
			power = 0;
			category = "buff";
			type = "flying";
			accuracy = 101;
			pp = 30;
			description = "For the next three turns, all Pokémon on the user's side of the field have their original Speed doubled.  This effect remains if the user leaves the field.";
		} else if (moveName.equals("Acupressure")) {
			power = 0;
			category = "buff";
			type = "normal";
			accuracy = 101;
			pp = 30;
			description = "Raises one of the target's stats by two stages.  The raised stat is chosen at random from any stats that can be raised by two stages.  If no stat is eligible, this move will fail.If the target has a substitute, this move will have no effect, even if the user is the target.This move cannot be copied by mirror move.";
		} else if (moveName.equals("Metal Burst")) {
			power = 1;
			category = "misc";
			type = "steel";
			accuracy = 100;
			pp = 10;
			description = "Targets the last opposing Pokémon to hit the user with a damaging move this turn.  Inflicts 1.5�? the damage that move did to the user.  If there is no eligible target, this move will fail.  Type immunity applies, but other type effects are ignored.";
		} else if (moveName.equals("U-turn")) {
			power = 70;
			category = "switch";
			type = "bug";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage, then the user immediately switches out, and the trainer selects a replacement Pokémon from the party.  If the target faint from this attack, the user's trainer selects the new Pokémon to send out first.  If the user is the last Pokémon in its party that can battle, it will not switch out.The user may be hit by pursuit when it switches out, if it has been targeted and pursuit has not yet been used.This move may be used even if the user is under the effect of ingrain.  ingrain's effect will end.";
		} else if (moveName.equals("Close Combat")) {
			power = 120;
			category = "physical";
			type = "fighting";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage, then lowers the user's Defense and Special Defense by one stage each.";
		} else if (moveName.equals("Payback")) {
			power = 50;
			category = "physical";
			type = "dark";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  If the target uses a move or switches out this turn before this move is used, this move has double power.";
		} else if (moveName.equals("Assurance")) {
			power = 50;
			category = "physical";
			type = "dark";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  If the target takes damage this turn for any reason before this move is used, this move has double power.";
		} else if (moveName.equals("Embargo")) {
			power = 0;
			category = "status";
			type = "dark";
			accuracy = 100;
			pp = 15;
			description = "Target cannot use its held item for five turns.  If the target leaves the field, this effect ends.If a Pokémon under this effect uses bug bite or pluck on a Pokémon holding a berry, the berry is destroyed but not used.  If a Pokémon under this effect uses fling, it will fail.This effect is passed by baton pass.";
		} else if (moveName.equals("Fling")) {
			power = 1;
			category = "physical";
			type = "dark";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Power and type are determined by the user's held item.  The item is consumed.  If the user is not holding an item, or its item has no set type and power, this move will fail.This move ignores sticky hold.If the user is under the effect of embargo, this move will fail.";
		} else if (moveName.equals("Psycho Shift")) {
			power = 0;
			category = "status";
			type = "psychic";
			accuracy = 90;
			pp = 10;
			description = "If the user has a major status effect effect and the target does not, the user's status is transferred to the target.";
		} else if (moveName.equals("Trump Card")) {
			power = 1;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 5;
			description = "Inflicts regular damage.  Power is determined by the PP remaining for this move, after its PP cost is deducted.  Ignores accuracy and evasion modifiers.PP remaining | Power             |     :4 or more    |    403            |    502            |    601            |    800            |   200If this move is activated by another move, the activating move's PP is used to calculate power.";
		} else if (moveName.equals("Heal Block")) {
			power = 0;
			category = "status";
			type = "psychic";
			accuracy = 100;
			pp = 15;
			description = "For the next five turns, the target may not use any moves that only restore HP, and move effects that heal the target are disabled.  Moves that steal HP may still be used, but will only inflict damage and not heal the target.";
		} else if (moveName.equals("Wring Out")) {
			power = 1;
			category = "special";
			type = "normal";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.  Power directly relates to the target's relative remaining HP, given by `1 + 120 * current HP / max HP`, to a maximum of 121.";
		} else if (moveName.equals("Power Trick")) {
			power = 0;
			category = "misc";
			type = "psychic";
			accuracy = 101;
			pp = 10;
			description = "The user's original Attack and Defense are swapped.This effect is passed on by baton pass.";
		} else if (moveName.equals("Gastro Acid")) {
			power = 0;
			category = "misc";
			type = "poison";
			accuracy = 100;
			pp = 10;
			description = "The target's ability is disabled as long as it remains on the field.This effect is passed on by baton pass.";
		} else if (moveName.equals("Lucky Chant")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 30;
			description = "For five turns, opposing Pokémon cannot score critical hits.";
		} else if (moveName.equals("Me First")) {
			power = 1;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 20;
			description = "If the target has selected a damaging move this turn, the user will copy that move and use it against the target, with a 50% increase in power.If the target moves before the user, this move will fail.This move cannot be copied by mirror move, nor selected by assist, metronome, or sleep talk.";
		} else if (moveName.equals("Copycat")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 20;
			description = "Uses the last move that was used successfully by any Pokémon, including the user.This move cannot copy itself, nor roar nor whirlwind.This move cannot be copied by mirror move, nor selected by assist, metronome, or sleep talk.";
		} else if (moveName.equals("Power Swap")) {
			power = 0;
			category = "misc";
			type = "psychic";
			accuracy = 101;
			pp = 10;
			description = "User swaps its Attack and Special Attack stat modifiers modifiers with the target.";
		} else if (moveName.equals("Guard Swap")) {
			power = 0;
			category = "misc";
			type = "psychic";
			accuracy = 101;
			pp = 10;
			description = "User swaps its Defense and Special Defense modifiers with the target.";
		} else if (moveName.equals("Punishment")) {
			power = 1;
			category = "physical";
			type = "dark";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.  Power starts at 60 and is increased by 20 for every stage any of the target's stats has been raised, capping at 200.  Accuracy and evasion modifiers do not increase this move's power.";
		} else if (moveName.equals("Last Resort")) {
			power = 140;
			category = "misc";
			type = "normal";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.  This move can only be used if each of the user's other moves has been used at least once since the user entered the field.  If this is the user's only move, this move will fail.";
		} else if (moveName.equals("Worry Seed")) {
			power = 0;
			category = "misc";
			type = "grass";
			accuracy = 100;
			pp = 10;
			description = "Changes the target's ability to insomnia.If the target's ability is truant or multitype, this move will fail.";
		} else if (moveName.equals("Sucker Punch")) {
			power = 80;
			category = "physical";
			type = "dark";
			priority = 1;
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.  If the target has not selected a damaging move this turn, or if the target has already acted this turn, this move will fail.This move is not affected by iron fist.";
		} else if (moveName.equals("Toxic Spikes")) {
			power = 0;
			category = "hazard";
			type = "poison";
			accuracy = 101;
			pp = 20;
			description = "Scatters poisoned spikes around the opposing field, which poison opposing Pokémon that enter the field.  A second layer of these spikes may be laid down, in which case Pokémon will be badly poison instead.  Pokémon immune to either ground moves or being poison are immune to this effect.  Pokémon otherwise immune to ground moves are affected during gravity.If a poison Pokémon not immune to ground moves enters a field covered with poisoned spikes, the spikes are removed.rapid spin will remove this effect from its user's side of the field.  defog will remove this effect from its target's side of the field.This move does not trigger synchronize, unless the Pokémon with synchronize was forced to enter the field by another effect such as roar.Pokémon entering the field due to baton pass are not affected by this effect.";
		} else if (moveName.equals("Heart Swap")) {
			power = 0;
			category = "misc";
			type = "psychic";
			accuracy = 101;
			pp = 10;
			description = "User swaps its stat modifiers with the target.";
		} else if (moveName.equals("Aqua Ring")) {
			power = 0;
			category = "healing";
			type = "water";
			accuracy = 101;
			pp = 20;
			description = "Restores 1/16 of the user's max HP at the end of each turn.  If the user leaves the field, this effect ends.This effect is passed on by baton pass.";
		} else if (moveName.equals("Magnet Rise")) {
			power = 0;
			category = "misc";
			type = "electric";
			accuracy = 101;
			pp = 10;
			description = "For five turns, the user is immune to ground moves.If the user is under the effect of ingrain or has levitate, this move will fail.This effect is temporarily disabled by and cannot be used during gravity.This effect is passed on by baton pass.";
		} else if (moveName.equals("Flare Blitz")) {
			power = 120;
			category = "physical";
			type = "fire";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  User takes 1/3 the damage it inflicts in recoil.  Has a 10% chance to burn the target.  Frozen Pokémon may use this move, in which case they will thaw.";
		} else if (moveName.equals("Force Palm")) {
			power = 60;
			category = "physical";
			type = "fighting";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Has a 30% chance to paralyze the target.";
		} else if (moveName.equals("Aura Sphere")) {
			power = 90;
			category = "special";
			type = "fighting";
			accuracy = 101;
			pp = 20;
			description = "Inflicts regular damage.  Ignores accuracy and evasion modifiers.";
		} else if (moveName.equals("Rock Polish")) {
			power = 0;
			category = "buff";
			type = "rock";
			accuracy = 101;
			pp = 20;
			description = "Raises the user's Speed by two stages.";
		} else if (moveName.equals("Poison Jab")) {
			power = 80;
			category = "physical";
			type = "poison";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Has a 30% chance to poison the target.";
		} else if (moveName.equals("Dark Pulse")) {
			power = 80;
			category = "special";
			type = "dark";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 20% chance to make the target flinch.";
		} else if (moveName.equals("Night Slash")) {
			power = 70;
			category = "physical";
			type = "dark";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move.";
		} else if (moveName.equals("Aqua Tail")) {
			power = 90;
			category = "physical";
			type = "water";
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Seed Bomb")) {
			power = 80;
			category = "physical";
			type = "grass";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Air Slash")) {
			power = 75;
			category = "special";
			type = "flying";
			accuracy = 95;
			pp = 20;
			description = "Inflicts regular damage.  Has a 30% chance to make the target flinch.";
		} else if (moveName.equals("X-Scissor")) {
			power = 80;
			category = "physical";
			type = "bug";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Bug Buzz")) {
			power = 90;
			category = "special";
			type = "bug";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Has a 10% chance to lower the target's Special Defense by one stage.";
		} else if (moveName.equals("Dragon Pulse")) {
			power = 85;
			category = "special";
			type = "dragon";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Dragon Rush")) {
			power = 100;
			category = "physical";
			type = "dragon";
			accuracy = 75;
			pp = 10;
			description = "Inflicts regular damage.  Has a 20% chance to make the target flinch.";
		} else if (moveName.equals("Power Gem")) {
			power = 70;
			category = "special";
			type = "rock";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Drain Punch")) {
			power = 75;
			category = "physical";
			type = "fighting";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Drains half the damage inflicted to heal the user.";
		} else if (moveName.equals("Vacuum Wave")) {
			power = 40;
			category = "special";
			type = "fighting";
			priority = 1;
			accuracy = 100;
			pp = 30;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Focus Blast")) {
			power = 120;
			category = "special";
			type = "fighting";
			accuracy = 70;
			pp = 5;
			description = "Inflicts regular damage.  Has a 10% chance to lower the target's Special Defense by one stage.";
		} else if (moveName.equals("Energy Ball")) {
			power = 80;
			category = "special";
			type = "grass";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Has a 10% chance to lower the target's Special Defense by one stage.";
		} else if (moveName.equals("Brave Bird")) {
			power = 120;
			category = "physical";
			type = "flying";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  User takes 1/3 the damage it inflicts in recoil.";
		} else if (moveName.equals("Earth Power")) {
			power = 90;
			category = "special";
			type = "ground";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Has a 10% chance to lower the target's Special Defense by one stage.";
		} else if (moveName.equals("Switcheroo")) {
			power = 0;
			category = "misc";
			type = "dark";
			accuracy = 100;
			pp = 10;
			description = "User and target permanently swap held item.  Works even if one of the Pokémon isn't holding anything.  If either Pokémon is holding mail, this move will fail.If either Pokémon has multitype or sticky hold, this move will fail.If this move results in a Pokémon obtaining choice band, choice scarf, or choice specs, and that Pokémon was the latter of the pair to move this turn, then the move it used this turn becomes its chosen forced move.  This applies even if both Pokémon had a choice item before this move was used.  If the first of the two Pokémon gains a choice item, it may select whatever choice move it wishes next turn.Neither the user nor the target can recover its item with recycle.This move cannot be selected by assist or metronome.";
		} else if (moveName.equals("Giga Impact")) {
			power = 150;
			category = "physical";
			type = "normal";
			accuracy = 90;
			pp = 5;
			description = "Inflicts regular damage.  User loses its next turn to \"recharge\", and cannot attack or switch out during that turn.";
		} else if (moveName.equals("Nasty Plot")) {
			power = 0;
			category = "buff";
			type = "dark";
			accuracy = 101;
			pp = 20;
			description = "Raises the user's Special Attack by two stages.";
		} else if (moveName.equals("Bullet Punch")) {
			power = 40;
			category = "physical";
			type = "steel";
			priority = 1;
			accuracy = 100;
			pp = 30;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Avalanche")) {
			power = 60;
			category = "physical";
			priority = -4;
			type = "ice";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  If the target damaged the user this turn and was the last to do so, this move has double power.pain split does not count as damaging the user.";
		} else if (moveName.equals("Ice Shard")) {
			power = 40;
			category = "physical";
			type = "ice";
			priority = 1;
			accuracy = 100;
			pp = 30;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Shadow Claw")) {
			power = 70;
			category = "physical";
			type = "ghost";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move.";
		} else if (moveName.equals("Thunder Fang")) {
			power = 65;
			category = "physical";
			type = "electric";
			accuracy = 95;
			pp = 15;
			description = "Inflicts regular damage.  Has a 10% chance to paralyze the target and a separate 10% chance to make the target flinch.";
		} else if (moveName.equals("Ice Fang")) {
			power = 65;
			category = "physical";
			type = "ice";
			accuracy = 95;
			pp = 15;
			description = "Inflicts regular damage.  Has a 10% chance to freeze the target and a separate 10% chance to make the target flinch.";
		} else if (moveName.equals("Fire Fang")) {
			power = 65;
			category = "physical";
			type = "fire";
			accuracy = 95;
			pp = 15;
			description = "Inflicts regular damage.  Has a 10% chance to burn the target and a separate 10% chance to make the target flinch.";
		} else if (moveName.equals("Shadow Sneak")) {
			power = 40;
			category = "physical";
			type = "ghost";
			priority = 1;
			accuracy = 100;
			pp = 30;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Mud Bomb")) {
			power = 65;
			category = "special";
			type = "ground";
			accuracy = 85;
			pp = 10;
			description = "Inflicts regular damage.  Has a 30% chance to lower the target's accuracy by one stage.";
		} else if (moveName.equals("Psycho Cut")) {
			power = 70;
			category = "physical";
			type = "psychic";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move.";
		} else if (moveName.equals("Zen Headbutt")) {
			power = 80;
			category = "physical";
			type = "psychic";
			accuracy = 90;
			pp = 15;
			description = "Inflicts regular damage.  Has a 20% chance to make the target flinch.";
		} else if (moveName.equals("Mirror Shot")) {
			power = 65;
			category = "special";
			type = "steel";
			accuracy = 85;
			pp = 10;
			description = "Inflicts regular damage.  Has a 30% chance to lower the target's accuracy by one stage.";
		} else if (moveName.equals("Flash Cannon")) {
			power = 80;
			category = "special";
			type = "steel";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Has a 10% chance to lower the target's Special Defense by one stage.";
		} else if (moveName.equals("Rock Climb")) {
			power = 90;
			category = "physical";
			type = "normal";
			accuracy = 85;
			pp = 20;
			description = "Inflicts regular damage.  Has a 20% chance to confuse the target.";
		} else if (moveName.equals("Defog")) {
			power = 0;
			category = "misc";
			type = "flying";
			accuracy = 101;
			pp = 15;
			description = "Lowers the target's evasion by one stage.  Clears away fog.  Removes the effects of mist, light screen, reflect, safeguard, spikes, stealth rock, and toxic spikes from the target's side of the field.If the target is protected by mist, it will prevent the evasion change, then be removed by this move.";
		} else if (moveName.equals("Trick Room")) {
			power = 0;
			category = "misc";
			type = "psychic";
			priority = -7;
			accuracy = 101;
			pp = 5;
			description = "For five turns (including this one), slower Pokémon will act before faster Pokémon.  Move priority is not affected.  Using this move when its effect is already active will end the effect.Pokémon holding full incense, lagging tail, or quick claw and Pokémon with stall ignore this effect.";
		} else if (moveName.equals("Draco Meteor")) {
			power = 130;
			category = "special";
			type = "dragon";
			accuracy = 90;
			pp = 5;
			description = "Inflicts regular damage, then lowers the user's Special Attack by two stages.";
		} else if (moveName.equals("Discharge")) {
			power = 80;
			category = "special";
			type = "electric";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 30% chance to paralyze the target.";
		} else if (moveName.equals("Lava Plume")) {
			power = 80;
			category = "special";
			type = "fire";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 30% chance to burn the target.";
		} else if (moveName.equals("Leaf Storm")) {
			power = 130;
			category = "special";
			type = "grass";
			accuracy = 90;
			pp = 5;
			description = "Inflicts regular damage, then lowers the user's Special Attack by two stages.";
		} else if (moveName.equals("Power Whip")) {
			power = 120;
			category = "physical";
			type = "grass";
			accuracy = 85;
			pp = 10;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Rock Wrecker")) {
			power = 150;
			category = "physical";
			type = "rock";
			accuracy = 90;
			pp = 5;
			description = "Inflicts regular damage.  User loses its next turn to \"recharge\", and cannot attack or switch out during that turn.";
		} else if (moveName.equals("Cross Poison")) {
			power = 70;
			category = "physical";
			type = "poison";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move. Has a 10% chance to poison the target.";
		} else if (moveName.equals("Gunk Shot")) {
			power = 120;
			category = "physical";
			type = "poison";
			accuracy = 70;
			pp = 5;
			description = "Inflicts regular damage.  Has a 30% chance to poison the target.";
		} else if (moveName.equals("Iron Head")) {
			power = 80;
			category = "physical";
			type = "steel";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 30% chance to make the target flinch.";
		} else if (moveName.equals("Magnet Bomb")) {
			power = 60;
			category = "physical";
			type = "steel";
			accuracy = 101;
			pp = 20;
			description = "Inflicts regular damage.  Ignores accuracy and evasion modifiers.";
		} else if (moveName.equals("Stone Edge")) {
			power = 100;
			category = "physical";
			type = "rock";
			accuracy = 80;
			pp = 5;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move.";
		} else if (moveName.equals("Captivate")) {
			power = 0;
			category = "debuff";
			type = "normal";
			accuracy = 100;
			pp = 20;
			description = "Lowers the target's Special Attack by two stages.  If the user and target are the same gender, or either is genderless, this move will fail.";
		} else if (moveName.equals("Stealth Rock")) {
			power = 0;
			category = "hazard";
			type = "rock";
			accuracy = 101;
			pp = 20;
			description = "Spreads sharp rocks around the opposing field, damaging any Pokémon that enters the field for 1/8 its max HP.  This damage is affected by the entering Pokémon's susceptibility to rock moves.rapid spin removes this effect from its user's side of the field.";
		} else if (moveName.equals("Grass Knot")) {
			power = 1;
			category = "special";
			type = "grass";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Power increases with the target's weight in kilograms, to a maximum of 120.Target's weight | Power                |     :Up to 10kg      |    20Up to 25kg      |    40Up to 50kg      |    60Up to 100kg     |    80Up to 200kg     |   100Above 200kg     |   120";
		} else if (moveName.equals("Chatter")) {
			power = 60;
			category = "special";
			type = "flying";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Has either a 1%, 11%, or 31% chance to confuse the target, based on the volume of the recording made for this move; louder recordings increase the chance of confusion.  If the user is not a chatot, this move will not cause confusion.This move cannot be copied by mimic, mirror move, or sketch, nor selected by assist, metronome, or sleep talk.";
		} else if (moveName.equals("Judgment")) {
			power = 100;
			category = "special";
			type = "normal";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  If the user is holding a plate or a drive, this move's type is the type corresponding to that item.Note: This effect is technically shared by both techno blast and judgment; however, Techno Blast is only affected by drives, and Judgment is only affected by plates.";
		} else if (moveName.equals("Bug Bite")) {
			power = 60;
			category = "physical";
			type = "bug";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  If the target is holding a berry, this move has double power, and the user takes the berry and uses it immediately.If the target is holding a jaboca berry or rowap berry, the berry is still removed, but has no effect.If this move is super effective and the target is holding a berry that can reduce this move's damage, it will do so, and will not be stolen.";
		} else if (moveName.equals("Charge Beam")) {
			power = 50;
			category = "special";
			type = "electric";
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage.  Has a 70% chance to raise the user's Special Attack by one stage.";
		} else if (moveName.equals("Wood Hammer")) {
			power = 120;
			category = "physical";
			type = "grass";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  User takes 1/3 the damage it inflicts in recoil.";
		} else if (moveName.equals("Aqua Jet")) {
			power = 40;
			category = "physical";
			type = "water";
			priority = 1;
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.";
		} else if (moveName.equals("Attack Order")) {
			power = 90;
			category = "physical";
			type = "bug";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move.";
		} else if (moveName.equals("Defend Order")) {
			power = 0;
			category = "buff";
			type = "bug";
			accuracy = 101;
			pp = 10;
			description = "Raises the user's Defense and Special Defense by one stage.";
		} else if (moveName.equals("Heal Order")) {
			power = 0;
			category = "healing";
			type = "bug";
			accuracy = 101;
			pp = 10;
			description = "Heals the user for half its max HP.";
		} else if (moveName.equals("Head Smash")) {
			power = 150;
			category = "physical";
			type = "rock";
			accuracy = 80;
			pp = 5;
			description = "Inflicts regular damage.  User takes 1/2 the damage it inflicts in recoil.";
		} else if (moveName.equals("Double Hit")) {
			power = 70;
			category = "physical";
			type = "normal";
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage.  Hits twice in one turn.";
		} else if (moveName.equals("Roar of Time")) {
			power = 150;
			category = "special";
			type = "dragon";
			accuracy = 90;
			pp = 5;
			description = "Inflicts regular damage.  User loses its next turn to \"recharge\", and cannot attack or switch out during that turn.";
		} else if (moveName.equals("Spacial Rend")) {
			power = 100;
			category = "special";
			type = "dragon";
			accuracy = 95;
			pp = 5;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move.";
		} else if (moveName.equals("Lunar Dance")) {
			power = 0;
			category = "death";
			type = "psychic";
			accuracy = 101;
			pp = 10;
			description = "User faint.  Its replacement's HP and PP are fully restored, and any major status effect effect is removed.";
		} else if (moveName.equals("Crush Grip")) {
			power = 1;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.  Power directly relates to the target's relative remaining HP, given by `1 + 120 * current HP / max HP`, to a maximum of 121.";
		} else if (moveName.equals("Magma Storm")) {
			power = 100;
			category = "special";
			type = "fire";
			accuracy = 75;
			pp = 5;
			description = "Inflicts regular damage.  For the next 2�??5 turns, the target cannot leave the field and is damaged for 1/16 its max HP at the end of each turn.  The user continues to use other moves during this time.  If the user leaves the field, this effect ends.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.rapid spin cancels this effect.";
		} else if (moveName.equals("Dark Void")) {
			power = 0;
			category = "status";
			type = "dark";
			accuracy = 80;
			pp = 10;
			description = "Puts the target to sleep.";
		} else if (moveName.equals("Seed Flare")) {
			power = 120;
			category = "special";
			type = "grass";
			accuracy = 85;
			pp = 5;
			description = "Inflicts regular damage.  Has a 40% chance to lower the target's Special Defense by two stages.";
		} else if (moveName.equals("Ominous Wind")) {
			power = 60;
			category = "special";
			type = "ghost";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage. Has a 10% chance to raise all of the user's stats one stage.";
		} else if (moveName.equals("Shadow Force")) {
			power = 120;
			category = "physical";
			type = "ghost";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.  User vanishes for one turn, becoming immune to attack, and hits on the second turn.This move ignores the effects of detect and protect.This move cannot be selected by sleep talk.";
		} else if (moveName.equals("Hone Claws")) {
			power = 0;
			category = "buff";
			type = "dark";
			accuracy = 101;
			pp = 15;
			description = "Raises the user's Attack and accuracy by one stage.";
		} else if (moveName.equals("Wide Guard")) {
			power = 0;
			category = "misc";
			type = "rock";
			priority = 3;
			accuracy = 101;
			pp = 10;
			description = "Moves with multiple targets will not hit friendly Pokémon for the remainder of this turn.  If the user is last to act this turn, this move will fail.This move cannot be selected by assist or metronome.";
		} else if (moveName.equals("Guard Split")) {
			power = 0;
			category = "misc";
			type = "psychic";
			accuracy = 101;
			pp = 10;
			description = "Averages the user's unmodified Defense with the target's unmodified Defense; the value becomes the unmodified Defense for both Pokémon. Unmodified Special Defense is averaged the same way.";
		} else if (moveName.equals("Power Split")) {
			power = 0;
			category = "misc";
			type = "psychic";
			accuracy = 101;
			pp = 10;
			description = "Averages the user's unmodified Attack with the target's unmodified Attack; the value becomes the unmodified Attack for both Pokémon. Unmodified Special Attack is averaged the same way.This effect applies before any other persistent changes to unmodified Attack or Special Attack, such as flower gift during sunny day.";
		} else if (moveName.equals("Wonder Room")) {
			power = 0;
			category = "misc";
			type = "psychic";
			accuracy = 101;
			pp = 10;
			description = "For five turns (including this one), every Pokémon's Defense and Special Defense are swapped.";
		} else if (moveName.equals("Psyshock")) {
			power = 80;
			category = "spatkdef";
			type = "psychic";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Damage calculation always uses the target's Defense, regardless of this move's damage class.";
		} else if (moveName.equals("Venoshock")) {
			power = 65;
			category = "special";
			type = "poison";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  If the target is poisoned, this move has double power.";
		} else if (moveName.equals("Autotomize")) {
			power = 0;
			category = "buff";
			type = "steel";
			accuracy = 101;
			pp = 15;
			description = "Raises the user's Speed by two stages.  Halves the user's weight; this effect does not stack.";
		} else if (moveName.equals("Rage Powder")) {
			power = 0;
			category = "misc";
			type = "bug";
			priority = 2;
			accuracy = 101;
			pp = 20;
			description = "Until the end of this turn, any moves that opposing Pokémon target solely at the user's ally will instead target the user.  If both Pokémon on the same side of the field use this move on the same turn, the Pokémon that uses it last will become the target.This effect takes priority over lightningrod and storm drain.If the user's ally switches out, opposing Pokémon may still hit it with pursuit.This move cannot be selected by assist or metronome.";
		} else if (moveName.equals("Telekinesis")) {
			power = 0;
			category = "misc";
			type = "psychic";
			accuracy = 101;
			pp = 15;
			description = "For three turns (including this one), moves used against the target have 100% accuracy, but the target is immune to ground damage.  Accuracy of one hit KO moves is exempt from this effect.This effect is removed by gravity.  If Gravity is already in effect, this move will fail.";
		} else if (moveName.equals("Magic Room")) {
			power = 0;
			category = "misc";
			type = "psychic";
			accuracy = 101;
			pp = 10;
			description = "For five turns (including this one), passive effects of held items are ignored, and Pokémon will not use their held items.";
		} else if (moveName.equals("Smack Down")) {
			power = 50;
			category = "physical";
			type = "rock";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Removes the target's immunity to ground type damage.  This effect removes any existing Ground immunity due to levitate, magnet rise, or telekinesis, and causes the target's flying type to be ignored when it takes Ground damage.If the target isn't immune to Ground damage, this move will fail.This move can hit Pokémon under the effect of bounce, fly, or sky drop, and ends the effect of Bounce or Fly.";
		} else if (moveName.equals("Storm Throw")) {
			power = 90;
			category = "physical";
			type = "fighting";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Always scores a critical hit.";
		} else if (moveName.equals("Flame Burst")) {
			power = 70;
			category = "special";
			type = "fire";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  If this move successfully hits the target, any Pokémon adjacent to the target are damaged for 1/16 their max HP.";
		} else if (moveName.equals("Sludge Wave")) {
			power = 95;
			category = "special";
			type = "poison";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Has a 10% chance to poison the target.";
		} else if (moveName.equals("Quiver Dance")) {
			power = 0;
			category = "buff";
			type = "bug";
			accuracy = 101;
			pp = 20;
			description = "Raises the user's Special Attack, Special Defense, and Speed by one stage each.";
		} else if (moveName.equals("Heavy Slam")) {
			power = 1;
			category = "physical";
			type = "steel";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  The greater the user's weight compared to the target's, the higher power this move has, to a maximum of 120.User's weight                    | Power                                 |     :Up to 2�? the target's weight     |    40Up to 3�? the target's weight     |    60Up to 4�? the target's weight     |    80Up to 5�? the target's weight     |   100More than 5�? the target's weight |   120";
		} else if (moveName.equals("Synchronoise")) {
			power = 120;
			category = "special";
			type = "psychic";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Only Pokémon that share a type with the user will take damage from this move.";
		} else if (moveName.equals("Electro Ball")) {
			power = 1;
			category = "special";
			type = "electric";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  The greater the user's Speed compared to the target's, the higher power this move has, to a maximum of 150.User's Speed                     | Power                                 |     :Up to 2�? the target's Speed      |    60Up to 3�? the target's Speed      |    80Up to 4�? the target's Speed      |   120More than 4�? the target's Speed  |   150";
		} else if (moveName.equals("Soak")) {
			power = 0;
			category = "misc";
			type = "water";
			accuracy = 100;
			pp = 20;
			description = "Changes the target to pure water type until it leaves the field.  If the target has multitype, this move will fail.";
		} else if (moveName.equals("Flame Charge")) {
			power = 50;
			category = "physical";
			type = "fire";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Raises the user's Speed by one stage.";
		} else if (moveName.equals("Coil")) {
			power = 0;
			category = "buff";
			type = "poison";
			accuracy = 101;
			pp = 20;
			description = "Raises the user's Attack, Defense, and accuracy by one stage each.";
		} else if (moveName.equals("Low Sweep")) {
			power = 60;
			category = "debuff";
			type = "fighting";
			accuracy = 100;
			pp = 20;
			description = "Lowers the target's Speed by one stage.";
		} else if (moveName.equals("Acid Spray")) {
			power = 40;
			category = "special";
			type = "poison";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Lowers the target's Special Defense by two stages.";
		} else if (moveName.equals("Foul Play")) {
			power = 95;
			category = "physical";
			type = "dark";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Damage is calculated using the target's attacking stat rather than the user's.";
		} else if (moveName.equals("Simple Beam")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 100;
			pp = 15;
			description = "Changes the target's ability to simple.";
		} else if (moveName.equals("Entrainment")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 100;
			pp = 15;
			description = "Changes the target's ability to match the user's.  This effect ends when the target leaves battle.";
		} else if (moveName.equals("After You")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 15;
			description = "The target will act next this turn, regardless of Speed or move priority.If the target has already acted this turn, this move will fail.";
		} else if (moveName.equals("Round")) {
			power = 60;
			category = "special";
			type = "normal";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  If round has already been used this turn, this move's power is doubled.  After this move is used, any other Pokémon using it this turn will immediately do so (in the order they would otherwise act), regardless of Speed or priority.  Pokémon using other moves will then continue to act as usual.";
		} else if (moveName.equals("Echoed Voice")) {
			power = 40;
			category = "special";
			type = "normal";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  If any friendly Pokémon used this move earlier this turn or on the previous turn, that use's power is added to this move's power, to a maximum of 200.";
		} else if (moveName.equals("Chip Away")) {
			power = 70;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Damage calculation ignores the target's stat modifiers, including evasion.";
		} else if (moveName.equals("Clear Smog")) {
			power = 50;
			category = "special";
			type = "poison";
			accuracy = 101;
			pp = 15;
			description = "Inflicts regular damage.  All of the target's stat modifiers are reset to zero.";
		} else if (moveName.equals("Stored Power")) {
			power = 20;
			category = "special";
			type = "psychic";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Power is increased by 100% its original value for every stage any of the user's stats have been raised.  Accuracy, evasion, and lowered stats do not affect this move's power.  For a Pokémon with all five stats modified to +6, this move's power is 31�?.";
		} else if (moveName.equals("Quick Guard")) {
			power = 0;
			category = "misc";
			type = "fighting";
			priority = 3;
			accuracy = 101;
			pp = 15;
			description = "Moves with priority greater than 0 will not hit friendly Pokémon for the remainder of this turn.  If the user is last to act this turn, this move will fail.This move cannot be selected by assist or metronome.";
		} else if (moveName.equals("Ally Switch")) {
			power = 0;
			category = "misc";
			type = "psychic";
			priority = 1;
			accuracy = 101;
			pp = 15;
			description = "User switches position on the field with the friendly Pokémon opposite it.  If the user is in the middle position in a triple battle, or there are no other friendly Pokémon, this move will fail.";
		} else if (moveName.equals("Scald")) {
			power = 80;
			category = "special";
			type = "water";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  Has a 30% chance to burn the target.";
		} else if (moveName.equals("Shell Smash")) {
			power = 0;
			category = "buff";
			type = "normal";
			accuracy = 101;
			pp = 15;
			description = "Raises the user's Attack, Special Attack, and Speed by two stages each.  Lowers the user's Defense and Special Defense by one stage each.";
		} else if (moveName.equals("Heal Pulse")) {
			power = 0;
			category = "healing";
			type = "psychic";
			accuracy = 101;
			pp = 10;
			description = "Heals the target for half its max HP.";
		} else if (moveName.equals("Hex")) {
			power = 65;
			category = "special";
			type = "ghost";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  If the target has a major status ailment ailment, this move has double power.";
		} else if (moveName.equals("Sky Drop")) {
			power = 60;
			category = "physical";
			type = "flying";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  User carries the target high into the air for one turn, during which no moves will hit either Pokémon and neither can act.  On the following turn, the user drops the target, inflicting damage and ending the effect.If the target is flying type, this move will function as normal but inflict no damage.gust, hurricane, sky uppercut, smack down, thunder, twister, and whirlwind can hit both the user and the target during this effect.  gust and twister will additionally have double power.The damage from hail and sandstorm still applies during this effect.Either Pokémon may be hit during this effect if also under the effect of lock on, mind reader, or no guard.This move cannot be used while gravity is in effect.This move cannot be selected by sleep talk.*Bug*: If gravity is used during a double or triple battle while this move is in effect, this move is not correctly canceled on the target, and it remains high in the air indefinitely.  As this move prevents the target from acting, the only way to subsequently remove it from the field is to faint it.";
		} else if (moveName.equals("Shift Gear")) {
			power = 0;
			category = "buff";
			type = "steel";
			accuracy = 101;
			pp = 10;
			description = "Raises the user's Attack by one stage and its Speed by two stages.";
		} else if (moveName.equals("Circle Throw")) {
			power = 60;
			category = "oppswitch";
			type = "fighting";
			priority = -6;
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage, then switches the target out for another of its trainer's Pokémon, selected at random.If the target is under the effect of ingrain or suction cups, or it has a substitute, or its Trainer has no more usable Pokémon, it will not be switched out.  If the target is a wild Pokémon, the battle ends instead.";
		} else if (moveName.equals("Incinerate")) {
			power = 60;
			category = "special";
			type = "fire";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  If the target is holding a berry, it's destroyed and cannot be used in response to this move.";
		} else if (moveName.equals("Quash")) {
			power = 0;
			category = "misc";
			type = "dark";
			accuracy = 100;
			pp = 15;
			description = "Forces the target to act last this turn, regardless of Speed or move priority.  If the target has already acted this turn, this move will fail.";
		} else if (moveName.equals("Acrobatics")) {
			power = 110;
			category = "physical";
			type = "flying";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  If the user has no held item, this move has double power.";
		} else if (moveName.equals("Reflect Type")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 15;
			description = "User's type changes to match the target's.";
		} else if (moveName.equals("Retaliate")) {
			power = 70;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.  If a friendly Pokémon fainted on the previous turn, this move has double power.";
		} else if (moveName.equals("Final Gambit")) {
			power = 1;
			category = "special";
			type = "fighting";
			accuracy = 100;
			pp = 5;
			description = "Inflicts damage equal to the user's remaining HP.  User faints.";
		} else if (moveName.equals("Bestow")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 15;
			description = "Transfers the user's held item to the target.  If the user has no held item, or the target already has a held item, this move will fail.";
		} else if (moveName.equals("Inferno")) {
			power = 100;
			category = "special";
			type = "fire";
			accuracy = 50;
			pp = 5;
			description = "Inflicts regular damage.  Has a 100% chance to burn the target.";
		} else if (moveName.equals("Water Pledge")) {
			power = 80;
			category = "special";
			type = "water";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  If a friendly Pokémon used grass pledge earlier this turn, all opposing Pokémon have halved Speed for four turns (including this one).";
		} else if (moveName.equals("Fire Pledge")) {
			power = 50;
			category = "special";
			type = "fire";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  If a friendly Pokémon used water pledge earlier this turn, moves used by any friendly Pokémon have doubled effect chance for four turns (including this one).";
		} else if (moveName.equals("Grass Pledge")) {
			power = 50;
			category = "special";
			type = "grass";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  If a friendly Pokémon used fire pledge earlier this turn, all opposing Pokémon will take 1/8 their max HP in damage at the end of every turn for four turns (including this one).";
		} else if (moveName.equals("Volt Switch")) {
			power = 70;
			category = "switch";
			type = "electric";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage, then the user immediately switches out, and the trainer selects a replacement Pokémon from the party.  If the target faint from this attack, the user's trainer selects the new Pokémon to send out first.  If the user is the last Pokémon in its party that can battle, it will not switch out.The user may be hit by pursuit when it switches out, if it has been targeted and pursuit has not yet been used.This move may be used even if the user is under the effect of ingrain.  ingrain's effect will end.";
		} else if (moveName.equals("Struggle Bug")) {
			power = 50;
			category = "special";
			type = "bug";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Has a 100% chance to lower the target's Special Attack by one stage.";
		} else if (moveName.equals("Bulldoze")) {
			power = 60;
			category = "physical";
			type = "ground";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Has a 100% chance to lower the target's Speed by one stage.";
		} else if (moveName.equals("Frost Breath")) {
			power = 90;
			category = "special";
			type = "ice";
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage.  Always scores a critical hit.";
		} else if (moveName.equals("Dragon Tail")) {
			power = 60;
			category = "oppswitch";
			type = "dragon";
			accuracy = 90;
			priority = -6;
			pp = 10;
			description = "Inflicts regular damage, then switches the target out for another of its trainer's Pokémon, selected at random.If the target is under the effect of ingrain or suction cups, or it has a substitute, or its Trainer has no more usable Pokémon, it will not be switched out.  If the target is a wild Pokémon, the battle ends instead.";
		} else if (moveName.equals("Work Up")) {
			power = 0;
			category = "buff";
			type = "normal";
			accuracy = 101;
			pp = 30;
			description = "Raises the user's Attack and Special Attack by one stage each.";
		} else if (moveName.equals("Electroweb")) {
			power = 55;
			category = "debuff";
			type = "electric";
			accuracy = 95;
			pp = 15;
			description = "Lowers the target's Speed by one stage.";
		} else if (moveName.equals("Wild Charge")) {
			power = 90;
			category = "physical";
			type = "electric";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  User takes 1/4 the damage it inflicts in recoil.";
		} else if (moveName.equals("Drill Run")) {
			power = 80;
			category = "physical";
			type = "ground";
			accuracy = 95;
			pp = 10;
			description = "Inflicts regular damage.  User's critical hit rate is one level higher when using this move.";
		} else if (moveName.equals("Dual Chop")) {
			power = 40;
			category = "physical";
			type = "dragon";
			accuracy = 90;
			pp = 15;
			description = "Inflicts regular damage.  Hits twice in one turn.";
		} else if (moveName.equals("Heart Stamp")) {
			power = 60;
			category = "physical";
			type = "psychic";
			accuracy = 100;
			pp = 25;
			description = "Inflicts regular damage.  Has a 30% chance to make the target flinch.";
		} else if (moveName.equals("Horn Leech")) {
			power = 75;
			category = "physical";
			type = "grass";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Drains half the damage inflicted to heal the user.";
		} else if (moveName.equals("Sacred Sword")) {
			power = 90;
			category = "physical";
			type = "fighting";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Damage calculation ignores the target's stat modifiers, including evasion.";
		} else if (moveName.equals("Razor Shell")) {
			power = 75;
			category = "physical";
			type = "water";
			accuracy = 95;
			pp = 10;
			description = "Inflicts regular damage.  Has a 50% chance to lower the target's Defense by one stage.";
		} else if (moveName.equals("Heat Crash")) {
			power = 1;
			category = "physical";
			type = "fire";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  The greater the user's weight compared to the target's, the higher power this move has, to a maximum of 120.User's weight                    | Power                                 |     :Up to 2�? the target's weight     |    40Up to 3�? the target's weight     |    60Up to 4�? the target's weight     |    80Up to 5�? the target's weight     |   100More than 5�? the target's weight |   120";
		} else if (moveName.equals("Leaf Tornado")) {
			power = 65;
			category = "special";
			type = "grass";
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage.  Has a 50% chance to lower the target's accuracy by one stage.";
		} else if (moveName.equals("Steamroller")) {
			power = 65;
			category = "physical";
			type = "bug";
			accuracy = 100;
			pp = 20;
			description = "Inflicts regular damage.  Has a 30% chance to make the target flinch.Power is doubled against Pokémon that have used minimize since entering the field.";
		} else if (moveName.equals("Cotton Guard")) {
			power = 0;
			category = "buff";
			type = "grass";
			accuracy = 101;
			pp = 10;
			description = "Raises the user's Defense by three stages.";
		} else if (moveName.equals("Night Daze")) {
			power = 85;
			category = "special";
			type = "dark";
			accuracy = 95;
			pp = 10;
			description = "Inflicts regular damage.  Has a 40% chance to lower the target's accuracy by one stage.";
		} else if (moveName.equals("Psystrike")) {
			power = 100;
			category = "spatkdef";
			type = "psychic";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Damage calculation always uses the target's Defense, regardless of this move's damage class.";
		} else if (moveName.equals("Tail Slap")) {
			power = 79;
			category = "physical";
			type = "normal";
			accuracy = 85;
			pp = 10;
			description = "Inflicts regular damage.  Hits 2�??5 times in one turn.Has a 3/8 chance each to hit 2 or 3 times, and a 1/8 chance each to hit 4 or 5 times.  Averages to 3 hits per use.";
		} else if (moveName.equals("Hurricane")) {
			power = 120;
			category = "special";
			type = "flying";
			accuracy = 70;
			pp = 10;
			description = "Inflicts regular damage.  Has a 30% chance to confuse the target.This move can hit Pokémon under the effect of bounce, fly, or sky drop.During rain dance, this move has 100% accuracy.  During sunny day, this move has 50% accuracy.";
		} else if (moveName.equals("Head Charge")) {
			power = 120;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 15;
			description = "Inflicts regular damage.  User takes 1/4 the damage it inflicts in recoil.";
		} else if (moveName.equals("Gear Grind")) {
			power = 100;
			category = "physical";
			type = "steel";
			accuracy = 85;
			pp = 15;
			description = "Inflicts regular damage.  Hits twice in one turn.";
		} else if (moveName.equals("Searing Shot")) {
			power = 100;
			category = "special";
			type = "fire";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.  Has a 30% chance to burn the target.";
		} else if (moveName.equals("Techno Blast")) {
			power = 120;
			category = "special";
			type = "normal";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.  If the user is holding a plate or a drive, this move's type is the type corresponding to that item.Note: This effect is technically shared by both techno blast and judgment; however, Techno Blast is only affected by drives, and Judgment is only affected by plates.";
		} else if (moveName.equals("Relic Song")) {
			power = 75;
			category = "special";
			type = "normal";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Has a 10% chance to put the target to sleep.If the user is a meloetta, it will toggle between Aria and Pirouette Forme.";
		} else if (moveName.equals("Secret Sword")) {
			power = 85;
			category = "spatkdef";
			type = "fighting";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Damage calculation always uses the target's Defense, regardless of this move's damage class.";
		} else if (moveName.equals("Glaciate")) {
			power = 65;
			category = "special";
			type = "ice";
			accuracy = 95;
			pp = 10;
			description = "Inflicts regular damage.  Lowers the target's Speed by one stage.";
		} else if (moveName.equals("Bolt Strike")) {
			power = 130;
			category = "physical";
			type = "electric";
			accuracy = 85;
			pp = 5;
			description = "Inflicts regular damage.  Has a 20% chance to paralyze the target.";
		} else if (moveName.equals("Blue Flare")) {
			power = 130;
			category = "special";
			type = "fire";
			accuracy = 85;
			pp = 5;
			description = "Inflicts regular damage.  Has a 20% chance to burn the target.";
		} else if (moveName.equals("Fiery Dance")) {
			power = 80;
			category = "special";
			type = "fire";
			accuracy = 100;
			pp = 10;
			description = "Inflicts regular damage.  Has a 50% chance to raise the user's Special Attack by one stage.";
		} else if (moveName.equals("Freeze Shock")) {
			power = 140;
			category = "physical";
			type = "ice";
			accuracy = 90;
			pp = 5;
			description = "Inflicts regular damage.  Has a 30% chance to paralyze the target.  User charges for one turn before attacking.";
		} else if (moveName.equals("Ice Burn")) {
			power = 140;
			category = "special";
			type = "ice";
			accuracy = 90;
			pp = 5;
			description = "Inflicts regular damage.  Has a 30% chance to burn the target.  User charges for one turn before attacking.";
		} else if (moveName.equals("Snarl")) {
			power = 55;
			category = "special";
			type = "dark";
			accuracy = 95;
			pp = 15;
			description = "Inflicts regular damage.  Has a 100% chance to lower the target's Special Attack by one stage.";
		} else if (moveName.equals("Icicle Crash")) {
			power = 85;
			category = "physical";
			type = "ice";
			accuracy = 90;
			pp = 10;
			description = "Inflicts regular damage.  Has a 30% chance to make the target flinch.";
		} else if (moveName.equals("V-create")) {
			power = 180;
			category = "physical";
			type = "fire";
			accuracy = 95;
			pp = 5;
			description = "Inflicts regular damage.  Lowers the user's Defense, Special Defense, and Speed by one stage each.";
		} else if (moveName.equals("Fusion Flare")) {
			power = 100;
			category = "special";
			type = "fire";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.  If a friendly Pokémon used fusion bolt earlier this turn, this move has double power.";
		} else if (moveName.equals("Fusion Bolt")) {
			power = 100;
			category = "physical";
			type = "electric";
			accuracy = 100;
			pp = 5;
			description = "Inflicts regular damage.  If a friendly Pokémon used fusion flare earlier this turn, this move has double power.";
		} else if (moveName.equals("Flying Press")) {
			power = 80;
			category = "physical";
			type = "fighting";
			accuracy = 95;
			pp = 10;
			description = "Flying and fighting move";
		} else if (moveName.equals("Mat Block")) {
			power = 0;
			category = "misc";
			type = "fighting";
			accuracy = 101;
			pp = 10;
			description = "protects all pokemon. can only be used first turn";
		} else if (moveName.equals("Belch")) {
			power = 120;
			category = "special";
			type = "poison";
			accuracy = 90;
			pp = 10;
			description = "can only be used after eating berry";
		} else if (moveName.equals("Rototiller")) {
			power = 0;
			category = "buff";
			type = "ground";
			accuracy = 101;
			pp = 10;
			description = "buffs all grass pokemon";
		} else if (moveName.equals("Sticky Web")) {
			power = 0;
			category = "hazard";
			type = "bug";
			accuracy = 101;
			pp = 20;
			description = "hazard that reduces speed";
		} else if (moveName.equals("Fell Stinger")) {
			power = 30;
			category = "physical";
			type = "bug";
			accuracy = 100;
			pp = 25;
			description = "if this causes pokemon to faint, buff attack 2 stages";
		} else if (moveName.equals("Phantom Force")) {
			power = 90;
			category = "physical";
			type = "ghost";
			accuracy = 100;
			pp = 10;
			description = "become semi-invulerable then attack next turn";
		} else if (moveName.equals("Trick-or-treat")) {
			power = 0;
			category = "debuff";
			type = "ghost";
			accuracy = 100;
			pp = 20;
			description = "adds ghost type to target";
		} else if (moveName.equals("Noble Roar")) {
			power = 0;
			category = "debuff";
			type = "normal";
			accuracy = 100;
			pp = 30;
			description = "lowers targets attack and spatk by 1 stage";
		} else if (moveName.equals("Ion Deluge")) {
			power = 0;
			category = "misc";
			type = "electric";
			priority = 1;
			accuracy = 101;
			pp = 25;
			description = "changes all normal type attacks to electric";
		} else if (moveName.equals("Parabolic Charge")) {
			power = 50;
			category = "special";
			type = "electric";
			accuracy = 100;
			pp = 20;
			description = "heals half of dmg dealt";
		} else if (moveName.equals("Forest's Curse")) {
			power = 0;
			category = "debuff";
			type = "grass";
			accuracy = 100;
			pp = 20;
			description = "changes target to grass type";
		} else if (moveName.equals("Petal Blizzard")) {
			power = 90;
			category = "physical";
			type = "grass";
			accuracy = 100;
			pp = 15;
			description = "attacks everyone";
		} else if (moveName.equals("Freeze-Dry")) {
			power = 70;
			category = "special";
			type = "ice";
			accuracy = 100;
			pp = 15;
			description = "super effective against water";
		} else if (moveName.equals("Disarming Voice")) {
			power = 40;
			category = "special";
			type = "fairy";
			accuracy = 101;
			pp = 15;
			description = "ignores evasion and accuracy";
		} else if (moveName.equals("Parting Shot")) {
			power = 0;
			category = "switch";
			type = "dark";
			accuracy = 100;
			pp = 20;
			description = "lower target attack and spatk by 1 stage then switch out";
		} else if (moveName.equals("Topsy-Turvy")) {
			power = 0;
			category = "debuff";
			type = "dark";
			accuracy = 101;
			pp = 10;
			description = "reverse stat changes on target. positive become negative";
		} else if (moveName.equals("Draining Kiss")) {
			power = 50;
			category = "special";
			type = "fairy";
			accuracy = 100;
			pp = 20;
			description = "does dmg then restore hp by 75% of dmg dealt";
		} else if (moveName.equals("Crafty Shield")) {
			power = 0;
			category = "misc";
			type = "fairy";
			priority = 3;
			accuracy = 101;
			pp = 10;
			description = "protects all pokemon on users side from status moves";
		} else if (moveName.equals("Flower Shield")) {
			power = 0;
			category = "misc";
			type = "fairy";
			accuracy = 101;
			pp = 10;
			description = "raiser def of all grass type pokemon in battle by 1 stage";
		} else if (moveName.equals("Grassy Terrain")) {
			power = 0;
			category = "misc";
			type = "grass";
			accuracy = 101;
			pp = 10;
			description = "heal 1/16 each turn and grass type moves 50% stronger";
		} else if (moveName.equals("Misty Terrain")) {
			power = 0;
			category = "misc";
			type = "fairy";
			accuracy = 101;
			pp = 15;
			description = "cannot fall asleep and dragon type moves 50% weaker";
		} else if (moveName.equals("Electrify")) {
			power = 0;
			category = "misc";
			type = "electric";
			accuracy = 101;
			pp = 20;
			description = "changes target's next move to be electric type";
		} else if (moveName.equals("Play Rough")) {
			power = 90;
			category = "physical";
			type = "fairy";
			accuracy = 90;
			pp = 10;
			description = "10% chance lowering target's attack by 1 stage";
		} else if (moveName.equals("Fairy Wind")) {
			power = 40;
			category = "special";
			type = "fairy";
			accuracy = 100;
			pp = 30;
			description = "inflicts damage and has no secondary effect";
		} else if (moveName.equals("Moonblast")) {
			power = 95;
			category = "special";
			type = "fairy";
			accuracy = 100;
			pp = 15;
			description = "30% chance of lower target's special attack by 1 stage";
		} else if (moveName.equals("Boomburst")) {
			power = 140;
			category = "special";
			type = "normal";
			accuracy = 100;
			pp = 10;
			description = "dmgs ALL adjacent pokemon";
		} else if (moveName.equals("Fairy Lock")) {
			power = 0;
			category = "misc";
			type = "fairy";
			accuracy = 101;
			pp = 10;
			description = "prevents all pokemon from switching out of fleeing during next turn";
		} else if (moveName.equals("King's Shield")) {
			power = 0;
			category = "protect";
			type = "steel";
			priority = 4;
			accuracy = 101;
			pp = 10;
			description = "like protect. if make contact, reduce atk by 2 stages";
		} else if (moveName.equals("Play Nice")) {
			power = 0;
			category = "debuff";
			type = "normal";
			accuracy = 101;
			pp = 20;
			description = "recude atk by 1 stage";
		} else if (moveName.equals("Confide")) {
			power = 0;
			category = "debuff";
			type = "normal";
			accuracy = 101;
			pp = 20;
			description = "lower spatk by 1 stage";
		} else if (moveName.equals("Diamond Storm")) {
			power = 100;
			category = "physical";
			type = "rock";
			accuracy = 95;
			pp = 5;
			description = "50% chance to raise user's defense by 1 stage for each pokemon that it hits";
		} else if (moveName.equals("Steam Eruption")) {
			power = 110;
			category = "special";
			type = "water";
			accuracy = 95;
			pp = 5;
			description = "30% chance to burn target and thaws user if frozen";
		} else if (moveName.equals("Hyperspace Hole")) {
			power = 80;
			category = "special";
			type = "psychic";
			accuracy = 101;
			pp = 5;
			description = "goes through protect-type moves and removes them";
		} else if (moveName.equals("Water Shuriken")) {
			power = 47;
			category = "physical";
			type = "water";
			priority = 1;
			accuracy = 100;
			pp = 20;
			description = "hits up to 5 times. average 3.168 times. avg power = 47.52";
		} else if (moveName.equals("Mystical Fire")) {
			power = 65;
			category = "special";
			type = "fire";
			accuracy = 100;
			pp = 10;
			description = "lowers target's spatk by 1 stage";
		} else if (moveName.equals("Spiky Shield")) {
			power = 0;
			category = "protect";
			type = "grass";
			priority = 4;
			accuracy = 101;
			pp = 20;
			description = "protect-type move. if contact made, attacker suffers damage equal to 1/8 of its max hp";
		} else if (moveName.equals("Aromatic Mist")) {
			power = 0;
			category = "misc";
			type = "fairy";
			accuracy = 100;
			pp = 20;
			description = "inceases spdef of an ally. cannot use on self";
		} else if (moveName.equals("Eerie Impulse")) {
			power = 0;
			category = "debuff";
			type = "electric";
			accuracy = 100;
			pp = 15;
			description = "lowers targets spatk by 2 stages";
		} else if (moveName.equals("Venom Drench")) {
			power = 0;
			category = "debuff";
			type = "poison";
			accuracy = 100;
			pp = 20;
			description = "lowers atk, spatk, speed of all poisoned targets by 1 stage";
		} else if (moveName.equals("Powder")) {
			power = 0;
			category = "misc";
			type = "bug";
			priority = 1;
			accuracy = 100;
			pp = 20;
			description = "if target uses firetype move, they take 25% of max hp as dmg and cannot execute move";
		} else if (moveName.equals("Geomancy")) {
			power = 0;
			category = "buff";
			type = "fairy";
			accuracy = 101;
			pp = 10;
			description = "charges move on first turn. second turn, user spatk, spdef, speed increase by 2 stages. power herb allows for no charged and will be consumed";
		} else if (moveName.equals("Magnetic Flux")) {
			power = 0;
			category = "buff";
			type = "electric";
			accuracy = 101;
			pp = 20;
			description = "raises def and spdef of ally with plus or minus ability by one stage each";
		} else if (moveName.equals("Happy Hour")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 30;
			description = "doubles amount of prize money earned at end of battle";
		} else if (moveName.equals("Electric Terrain")) {
			power = 0;
			category = "misc";
			type = "electric";
			accuracy = 101;
			pp = 10;
			description = "prevents sleep and increases dmg done by electric type moves by 50%";
		} else if (moveName.equals("Dazzling Gleam")) {
			power = 80;
			category = "special";
			type = "fairy";
			accuracy = 100;
			pp = 10;
			description = "hits 2 opposing adjacent pokemon";
		} else if (moveName.equals("Celebrate")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 40;
			description = "congratulations";
		} else if (moveName.equals("Hold Hands")) {
			power = 0;
			category = "misc";
			type = "normal";
			accuracy = 101;
			pp = 40;
			description = "hold hands with ally";
		} else if (moveName.equals("Baby-Doll Eyes")) {
			power = 0;
			category = "debuff";
			type = "fairy";
			priority = 1;
			accuracy = 100;
			pp = 30;
			description = "lowers target's attack by 1 stage";
		} else if (moveName.equals("Nuzzle")) {
			power = 20;
			category = "status";
			type = "electric";
			accuracy = 100;
			pp = 20;
			description = "deals dmg and paralyzes target";
		} else if (moveName.equals("Hold Back")) {
			power = 40;
			category = "physical";
			type = "normal";
			accuracy = 100;
			pp = 40;
			description = "will leave target with 1 hp if it would otherwise faint";
		} else if (moveName.equals("Infestation")) {
			power = 20;
			category = "status";
			type = "bug";
			accuracy = 100;
			pp = 35;
			description = "deals 1/8 dmg each turn and prevents switching for 4-5 turns";
		} else if (moveName.equals("Power-Up Punch")) {
			power = 40;
			category = "physical";
			type = "fighting";
			accuracy = 100;
			pp = 20;
			description = "raises user's attack by 1 stage";
		} else if (moveName.equals("Oblivion Wing")) {
			power = 80;
			category = "special";
			type = "flying";
			accuracy = 100;
			pp = 10;
			description = "restores hp by 75% of dmg dealt";
		} else if (moveName.equals("Thousand Arrows")) {
			power = 90;
			category = "physical";
			type = "ground";
			accuracy = 100;
			pp = 10;
			description = "can hit flying type and levitate makes target vulnerable to ground tpye moves until affected Pokemon switches out";
		} else if (moveName.equals("Thousand Waves")) {
			power = 90;
			category = "physical";
			type = "ground";
			accuracy = 100;
			pp = 10;
			description = "prevents for from fleeing or switching as long as user remains in battle";
		} else if (moveName.equals("Land's Wrath")) {
			power = 90;
			category = "physical";
			type = "ground";
			accuracy = 100;
			pp = 10;
			description = "inflicts dmg to all opponents";
		} else if (moveName.equals("Light of Ruin")) {
			power = 140;
			category = "special";
			type = "fairy";
			accuracy = 90;
			pp = 5;
			description = "causes user to receieve recoil equal to 1/2 of dmg done to target";
		} else if (moveName.equals("Origin Pulse")) {
			power = 110;
			category = "special";
			type = "water";
			accuracy = 85;
			pp = 10;
			description = "hits all adjacent opponents";
		} else if (moveName.equals("Precipice Blades")) {
			power = 120;
			category = "physical";
			type = "ground";
			accuracy = 85;
			pp = 10;
			description = "hits all adjacent opponents";
		} else if (moveName.equals("Dragon Ascent")) {
			power = 120;
			category = "physical";
			type = "flying";
			accuracy = 100;
			pp = 5;
			description = "inflicts damage and then lowers the user's Defense stat and Special Defense stat by one stage each.";
		} else if (moveName.equals("Hyperspace Fury")) {
			power = 100;
			category = "physical";
			type = "dark";
			accuracy = 101;
			pp = 5;
			description = "lowers user's def by 1 stage and hits through protect-type moves and lifts their effect";
		} else {
			System.out.println("COULD NOT FIND " + moveName);
		}
	}

	public String getName() {
		return name;
	}

	public short getPower() {
		return power;
	}

	public String getCategory() {
		return category;
	}

	public String getType() {
		return type;
	}

	public byte getPriority() {
		return priority;
	}

	public byte getAccuracy() {
		return accuracy;
	}

	public byte getPp() {
		return pp;
	}

	public String getDescription() {
		return description;
	}

}
