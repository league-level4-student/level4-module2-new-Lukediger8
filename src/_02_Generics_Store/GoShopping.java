package _02_Generics_Store;

public class GoShopping {
	// 1. Look through other classes to see how they all interact.
	//
	//    There is a generic Cart class that can hold different 
	//    types of objects.
	//
	//    Candy and Cereal are Food objects
	//    Clothing and Toy are NonFood objects.
	public static void main(String[] args) {
		Candy candy = new Candy();
		Candy candy2 = new Candy();
		Candy candy3 = new Candy();
		Cereal cereal = new Cereal();
		Cereal cereal2 = new Cereal();
		Cereal cereal3 = new Cereal();

		// 2. Create a Cart object of type Candy
		Cart<Candy> CandyCart = new Cart<Candy>();
		// 3. Create another Cart object of type Cereal
		Cart<Cereal> CerealCart = new Cart<Cereal>();
		// 4. Add a few items to EACH cart
		CandyCart.add(candy);
		CandyCart.add(candy2);
		CandyCart.add(candy3);
		CerealCart.add(cereal);
		CerealCart.add(cereal2);
		CerealCart.add(cereal3);
		
		
		// 5. Call the showCart() method on EACH cart
		int i =0;
		do {
			CandyCart.showCart();
		}while(i < CandyCart.length());

		int j =0;
		do {
			CandyCart.showCart();
		}while(j < CandyCart.length());

		
		// 6. Run the code
		
		// 7. Comment out the code you have so far
		
		// 8. Repeat steps 2-5 for a Clothing Cart and a Toy Cart
		
		
		
		
		// Why are there errors?
		
		// 9. Modify the Cart class so that this code compiles
		// HINT: There are 3 lines of code to edit
				
		// 10. Run the code. Does it work?
		
	}
}