package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoaster {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String roller = JOptionPane.showInputDialog("how tall are you in inches");
		int num = Integer.parseInt(roller);
		if (num > 48) {
			JOptionPane.showMessageDialog(null, "you can go on the rollercoaster");

		} else {
			JOptionPane.showMessageDialog(null, "you need to grow more first" + "");

		}
	}

}
