package basics;

public class MethodEx {
	
	public static void displayMsg() {	//static -void
		System.out.println("Iam form the static method");
	}
	
	public static boolean check() {
		return true;
	}
	
	
	public int add() {	//Dynamic - int
		return (2+3);
	}
	
	public void display() {//Dynamic - void
		System.out.println("Hello Everyone!!!!");
	}
	
	public static void main(String args[]) {
		
		displayMsg();
		
		System.out.println(check());
	}

}
