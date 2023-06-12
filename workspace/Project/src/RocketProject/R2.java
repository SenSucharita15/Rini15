package RocketProject;

import java.util.Random;

//R2 class
public class R2 extends Rocket {

	R2() {
		super(120000000, 18000, 29000, 0.04, 0.08);
	}

	@Override
	public boolean launch() {
		double randomNumber = new Random().nextDouble();
		double explosionProbability = launchExplosionChance * (double) currentWeight / maxWeight;
		//System.out.println("Current weight is " + currentWeight);
	//	System.out.println("maximum weight is " + maxWeight);

		// double crashProbability;
		return randomNumber > explosionProbability;
	}

	@Override
	public boolean land() {
		double randomNumber = new Random().nextDouble();
		double crashProbability = landingCrashChance * (double) currentWeight / maxWeight;
		// double crashProbability;
		return randomNumber > crashProbability;
	}

}
