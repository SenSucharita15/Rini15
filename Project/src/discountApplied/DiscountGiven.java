package discountApplied;

public class DiscountGiven {
	double price = 110;
	double discountedValue;
	double discountPercentage = 50;
	// when no promo is applied
	String promoCode = "Promo5";
	// check with Promo5,Promo10,Promo20;

	void discountCalculate() {
		if (promoCode == "Promo5") {
			discountPercentage = discountPercentage + 5;
			discountedValue = price - (discountPercentage / 100) * price;
			System.out.println("The actual price is " + price);
			System.out.println("The discounted value is " + discountedValue);
		} else if (promoCode == "Promo10") {

			discountPercentage = discountPercentage + 10;
			discountedValue = price - (discountPercentage / 100) * price;
			System.out.println("The actual price is " + price);
			System.out.println(" The discounted value is " + discountedValue);
		} else if (promoCode == "Promo20") {

			discountPercentage = discountPercentage + 20;
			discountedValue = price - (discountPercentage / 100) * price;
			System.out.println("The actual price is " + price);
			System.out.println(" The discounted value is " + discountedValue);
		} else {
			discountedValue = price - (discountPercentage / 100) * price;
			System.out.println("The actual price is " + price);
			System.out.println(" The discounted value is " + discountedValue);
		}
	}

}
