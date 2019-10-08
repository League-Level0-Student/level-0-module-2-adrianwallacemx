import javax.swing.JOptionPane;

public class rolllercoaster {
	public static void main(String[] args) {
		
		String rollercoaster= JOptionPane.showInputDialog("how tal are you in inches");
		int num=Integer.parseInt(rollercoaster);
		if(num<48) {
			JOptionPane.showMessageDialog(null, "you need to grow more first");
			}
		else {
			JOptionPane.showMessageDialog(null, "you can ride the rollercoaster");
			
		}
	}

}
