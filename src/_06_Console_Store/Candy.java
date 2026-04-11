package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Candy extends Food{
	public Candy() {
		   this.item = new Random().nextBoolean() ? "candy1.jpeg" : "candy2.jpeg";
	}

	@Override
	public JLabel getFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}

