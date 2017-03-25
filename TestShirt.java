public class TestShirt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shirt s = new Shirt();
		Shirt s1 = new Shirt(4.5f, 25.5f);
		Shirt s2 = new Shirt(5.4f, 52.5f);
		Shirt s3 = new Shirt();

		// using default constructor display
		System.out.println("1. Disply using Default Constructor");
		s.displayShirtDetails();

		// using overloaded constructor display
		System.out
				.println("2. Disply using first object overloaded constructor");
		s1.displayShirtDetails();

		// using overloaded constructor display
		System.out
				.println("3. Disply using second object overloaded constructor");
		s2.displayShirtDetails();

		// set shirt details using setter methods
		System.out.println("4. Disply using getter and setter methods");
		s3.setShirt_collar_size(30.5f);
		s3.setShirt_sleeve_length(25.7f);
		s3.setShirt_material("Cotton");

		// prints shirt details using getter methods
		System.out
				.println("shirt collar size is  " + s3.getShirt_collar_size());
		System.out.println("shirt sleeve size is  "
				+ s3.getShirt_sleeve_length());
		System.out.println("shirt material is " + s3.getShirt_material());

	}

}

class Shirt {

	// Make all the member variables private.
	private float shirt_collar_size, shirt_sleeve_length;
	private String shirt_material;

	// default constructor
	Shirt() {
		shirt_collar_size = 38.9f;
		shirt_sleeve_length = 42.5f;
		shirt_material = "Cotton";

	}

	/*
	 * constructor that accepts arguments for the collar size and sleeve length.
	 * The constructor can set the material to cotton for all objects
	 */
	Shirt(float a, float b) {
		shirt_collar_size = a;
		shirt_sleeve_length = b;
		shirt_material = "Cotton";

	}

	// public display method
	public void displayShirtDetails() {
		System.out.println("shirt collar size is " + shirt_collar_size + " cm");
		System.out.println("shirt sleeve length is " + shirt_sleeve_length
				+ " cm");
		System.out.println("shirt material is " + shirt_material);
	}

	// Add accessor (get) and mutator (set) methods for each member variable.
	public float getShirt_collar_size() {
		return shirt_collar_size;
	}

	public void setShirt_collar_size(float shirt_collar_size) {
		this.shirt_collar_size = shirt_collar_size;
	}

	public float getShirt_sleeve_length() {
		return shirt_sleeve_length;
	}

	public void setShirt_sleeve_length(float shirt_sleeve_length) {
		this.shirt_sleeve_length = shirt_sleeve_length;
	}

	public String getShirt_material() {
		return shirt_material;
	}

	public void setShirt_material(String shirt_material) {
		this.shirt_material = shirt_material;
	}

}
