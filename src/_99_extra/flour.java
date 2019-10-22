package _99_extra;

import javax.swing.JOptionPane;

public class flour {
public static void main(String[] args) {
	String flour=JOptionPane.showInputDialog("how many cups of flour do you have");
	int num=Integer.parseInt(flour);
	if (num < 2) {JOptionPane.showMessageDialog(null, "go to the store and buy more");
		
	}
	String cookies=	JOptionPane.showInputDialog("how many people are you going to give cookies too");
	int num2=Integer.parseInt(cookies);
	if(num2>30) {JOptionPane.showMessageDialog(null, "you are going to have to bake 2 batches of cookies");
		
	}
	String batches=JOptionPane.showInputDialog("how many batches did you make");
	int num3=Integer.parseInt(batches);
	if(num3>2);JOptionPane.showMessageDialog(null, "you are lucky to have that much friends");
}
}
