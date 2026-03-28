package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Cereal extends Food{
	public Cereal() {
		   this.item = new Random().nextBoolean() ? "cereal1.jpeg" : "cereal2.jpeg";
	}

	@Override
	public JLabel getFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
