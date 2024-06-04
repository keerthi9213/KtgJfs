package basics;

public class VariablesEx4 {
	
	static String Nationality = "Indian";
	
	int aadhaar;
	
	public static void main(String[] args) {
		
		VariablesEx4 mahesh = new VariablesEx4();
		
		VariablesEx4 suresh = new VariablesEx4();
		
		VariablesEx4 ramesh = new VariablesEx4();
		
		mahesh.aadhaar=123;
		
		suresh.aadhaar=120;
		
		ramesh.aadhaar =121;
		
		System.out.println("Mahesh :-"+Nationality +"\t"+mahesh.aadhaar);
		
		System.out.println("Suresh :-"+Nationality +"\t"+suresh.aadhaar);
		
		System.out.println("Ramesh :-"+Nationality +"\t"+ramesh.aadhaar);
		
	}

}
