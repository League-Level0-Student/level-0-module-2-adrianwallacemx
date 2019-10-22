package _99_extra;

public class methodCalling {
	public static void main(String[] args) {
		printMessage();
		setName("name");
		getNumber();
	}

	static void printMessage() {
		System.out.println("message");
	}

	static void setName(String name) {
		String n = name;
	}
static	int getNumber() {
		int number = 5;
		return number;
		
	}
}
