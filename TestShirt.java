package mypackage;

public class TestShirt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initializing three shirt objects
		
		Shirt s1=new Shirt();                 // it will call default constructor of Shirt class
		Shirt s2=new Shirt(12,23);      // it will call parameterized constructor of shirt class
		Shirt s3=new Shirt(45,43);     //it will call parameterized constructor of shirt class
		
		// Calling static method displayResult of this class and passing Shirt object reference.

		TestShirt.dislayResult(s1);
		TestShirt.dislayResult(s2);
		TestShirt.dislayResult(s3);
	}
	
	public static void dislayResult(Shirt obj){
		
		//Printing the value of the private members of the Shirt class.
		
		System.out.println("The shirt collor size for this object is "+obj.getShirtCollorSize()+" \n The shirt sleeve length for this object is "+obj.getShirtSleeveLength()+" \n The shirt material for this object is "+obj.getShirtMaterial()+"\n");
		
	}

}