package RocketProject;

//Rocket Class
public class Rocket implements SpaceShip {
	int rocketCost;
	int rocketweight;
	int maxWeight;
	double launchExplosionChance;
	double landingCrashChance;
	int currentWeight;

	public Rocket(int rocketCost, int rocketweight, int maxWeight, double launchExplosionChance,
			double landingCrashChance) {
		// super();
		this.rocketCost = rocketCost;
		this.rocketweight = rocketweight;
		this.maxWeight = maxWeight;
		this.launchExplosionChance = launchExplosionChance;
		this.landingCrashChance = landingCrashChance;
		this.currentWeight = currentWeight;
		//System.out.println("Current weight is "+currentWeight);
	}

	public boolean launch() {
		return true;
	}

	public boolean land() {
		return true;
	}

	public boolean canCarry(Item item) {
		return (currentWeight + item.weight) <= maxWeight;
	}

	public void carry(Item item) {
		currentWeight = currentWeight + item.weight;
		System.out.println("Current weight is "+ currentWeight);
		System.out.println("Maximum weight is "+ maxWeight);
		
	}

}
