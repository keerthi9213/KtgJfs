package basics;

public class MethodEx1 {
	
	public int add(int a,int b) {		//Dynamic - int 
		return a+b;
	}

	public static void display(String name) { //static - void
		System.out.println("Your name is:-"+name);
	}
	
	public static void main(String[] args) {
		
		display("apple");
		
		display("Keerthi");
		
		MethodEx1 obj = new MethodEx1();
		
		System.out.println(obj.add(34, 67));
		
	}
}
