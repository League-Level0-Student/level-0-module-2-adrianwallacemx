package _06_lottery_numbers;

import java.util.Random;

public class lottery {
	public static void main(String[] args) {
		
		
	
	Random ran=new Random();
	int rand=ran.nextInt(50);
	int ra=ran.nextInt(50);
	int r=ran.nextInt(50);		
	int rando=ran.nextInt(50);	
	int rr=ran.nextInt(50);
	System.out.println(rand + "  " + ra + " "+ r + " " + rando + " " + rr );

}
}