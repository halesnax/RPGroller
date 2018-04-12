import java.util.Random;
public class Character {

	Random rand = new Random();
//TODO: Data types: atkType

	public makeCharacter() {


	}

	private damageRoll(Character target, BodyPart area){
		//can get negative... must solve

		area.getHP() -= (rand % (this.strength + this.equipmentMeleeBonusSum() )) - target.bodyPartArmorSum(area);
		//return?
	}

	int strength; 
	int wisdom;
	int agility;
	int intelegence;
	int charisma;
	int perception;
	int endurance;
	int craft;

	int coldMag;
	int warmMag;
	int lifeMag;
	int orderMag;


	private aimedHitRoll(){

	}
	private hitRoll(){

	}

	Body body = new Body();

}
