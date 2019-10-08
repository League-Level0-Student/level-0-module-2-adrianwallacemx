import javax.swing.JOptionPane;

public class vote {
public static void main(String[] args) {
	String vote =JOptionPane.showInputDialog("how old are you");
int num=Integer.parseInt(vote);
if(num<18) {
String JOptionPane.showMessageDialog(null, "nobody cares what you think");
}
else {
	JOptionPane.showMessageDialog(null, "who should be the next president");
}
}
}