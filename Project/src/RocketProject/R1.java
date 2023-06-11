package RocketProject;

import java.util.Random;

//R1 class
public class R1 extends Rocket {

//	private double landingExplosionChance;

	R1() {
		super(100000000, 10000, 18000, 0.05, 0.01);

	}

	@Override
	public boolean launch() {
		double randomNumber = new Random().nextDouble();
		System.out.println("The random number is " + randomNumber);
		double explosionProbability = launchExplosionChance * (double) currentWeight / maxWeight;
		System.out.println("The explosion probability is " + explosionProbability);
		// double crashProbability;
		return randomNumber > explosionProbability;
	}

	@Override
	public boolean land() {
		double randomNumber = new Random().nextDouble();
		//System.out.println("The random number is " + randomNumber);
		double crashProbability = landingCrashChance * (double) currentWeight / maxWeight;
		// double crashProbability;
		return randomNumber > crashProbability;
	}
}
