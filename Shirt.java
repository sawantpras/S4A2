package mypackage;

public class Shirt {

    //Declaring Instance variables as private so that they can be access only by getters and setters outside of the class

private int shirtCollorSize;
private int shirtSleeveLength;
private String shirtMaterial;

// Getter and setters to access the private members of the class.

public int getShirtCollorSize() {
	return shirtCollorSize;
}
public void setShirtCollorSize(int shirtCollorSize) {
	this.shirtCollorSize = shirtCollorSize;
}
public int getShirtSleeveLength() {
	return shirtSleeveLength;
}
public void setShirtSleeveLength(int shirtSleeveLength) {
	this.shirtSleeveLength = shirtSleeveLength;
}
public String getShirtMaterial() {
	return shirtMaterial;
}
public void setShirtMaterial(String shirtMaterial) {
	this.shirtMaterial = shirtMaterial;
}

//Constructor having shirtCollorSize and shirtSleeveLength as argument

public Shirt(int shirtCollorSize, int shirtSleeveLength) {
	super();
	this.shirtCollorSize = shirtCollorSize;
	this.shirtSleeveLength = shirtSleeveLength;
	
	//Shirt material is set to cotton 
	
	shirtMaterial="Cotton";
}
//Default constructor 
public Shirt() {
	super();
	shirtCollorSize=34;
	shirtSleeveLength=42;
	shirtMaterial="Cotton";
}




}