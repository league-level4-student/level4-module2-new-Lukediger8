package _06_Console_Store;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GoShopping {

	// 1. Look through other classes to see how they all interact.
	//
	//    There is a generic Cart class that can hold different 
	//    types of objects.
	//
	//    Candy and Cereal are Food objects
	//    Clothing and Toy are NonFood objects.
	static Cereal cereal = new Cereal();
	static Candy candy = new Candy();
	static Clothing clothing = new Clothing();
	static Toy toys = new Toy();
	public static void main(String[] args) {
		double money = 20;
		 JFrame frame = new JFrame();
		 JPanel panel = new JPanel();
		 JPanel panel2 = new JPanel();
		 JFrame frame2 = new JFrame();
		 JLabel label = new JLabel();
		frame2.setSize(200,200);
		frame2.setName("Wallet");
		frame2.add(panel2);
		panel2.add(label);
		label.setText("$20");
		label.setSize(150,150);
		frame2.setVisible(true);
		label.setVisible(true);
		frame.setSize(400,400);
		panel.setName("Cart");
		frame.add(panel);
		frame.setVisible(true);
		Scanner scanner;
		scanner = new Scanner(System.in);
		do {
		System.out.println("Welcome to the Console Store\nItems:\nCandy($1.5)\nCereal($3)\nClothing($10)\nToys($8)\nWhat would you like to buy?");
		String answer = scanner.next();
		if(answer.toLowerCase().equals("candy")) {
			panel.add(candy.getFood());
			money -= 1.5;
		}
		else if(answer.toLowerCase().equals("cereal")){
			panel.add(cereal.getFood());
			money -= 3;
		}
		else if(answer.toLowerCase().equals("clothing")) {
			panel.add(clothing.getNonFood());
			money -= 10;
		}
		else if(answer.toLowerCase().equals("toy")) {
			panel.add(toys.getNonFood());
			money -= 8;
		}
		label.setText("Wallet: $" + money);
		frame2.pack();
		frame.pack();
		} while(money >= 1.5);
		if(money < 0) {
			System.out.println("You've ran out of money!");
		}
		/*
		int stipend = 20;
		showItems();
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
		*/
		
		// 5. Call the showCart() method on EACH cart
			//CandyCart.showCart();
			//CerealCart.showCart();
		
		// 6. Run the code

		
		// 7. Comment out the code you have so far
		
		// 8. Repeat steps 2-5 for a Clothing Cart and a Toy Cart
		
		
		
		// Why are there errors?
		
		// 9. Modify the Cart class so that this code compiles
		// HINT: There are 3 lines of code to edit
				
		// 10. Run the code. Does it work?
		
	}
}
