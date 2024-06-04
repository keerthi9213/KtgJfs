package controlstatements;

public class ForEachEx {
	
	public static void main(String[] args) {
		
		
		String name[] = {"apple","banana","orange","pear","kiwi"};

		for(int x =0;x<name.length;x++) {
			System.out.println(name[x]);
		}
		
		System.out.println("***********************");
		
		
		for(String value : name) {
			System.out.println(value);
		}
		
		
		
	}

}
