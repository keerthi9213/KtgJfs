package basics;

public class VaraiblesEx2 {
	
	static int staticcounter;  //static global var
	
	int instancecounter;	//instance global var
	
	public void counter() {
		staticcounter++;  //staticcounter = staticcounter +1;
		
		instancecounter++;
	}
	
	public void display() {
		System.out.println("StaticCounter:-"+staticcounter);
		
		System.out.println("InstanceCounter:-"+instancecounter);
	}
	
	
	public static void main(String[] args) {
		
		VaraiblesEx2 obj1 = new VaraiblesEx2();
		
		VaraiblesEx2 obj2 = new VaraiblesEx2();
		
		VaraiblesEx2 obj3 = new VaraiblesEx2();
		
		obj1.counter();
		
		obj2.counter();
		
		obj3.counter();
		
		obj3.counter();
		
		obj3.display();
		
		
	}

}
