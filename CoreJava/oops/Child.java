package oops;

class GrandParent{
	public void displayMsg() {
		System.out.println("Iam from the grand parent class");
	}
}

class Parent extends GrandParent{
	
	public void display() { //Dynamic - void 
	System.out.println("Iam from the parent class");
	}
	
}

public class Child extends Parent{
	public void displayMsg() {
		System.out.println("Iam from the child class");
	}
	
	
	public static void main(String[] args) {
		Child obj = new Child();
		
		obj.displayMsg();
		
	}
}
