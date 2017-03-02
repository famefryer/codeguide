package codeguide;
// Exercise 2
//TODO From the "Hide Implementation Details",Change the modifier of these method to the appropriate modifier.(private,protected,public)
public class Cylinder {
	public double radius;
	public double high;

	public Cylinder(double radius, double high) {
		this.radius = radius;
		this.high = high;
	}

	public double convertToCenti(double num) {
		return num=num/100;
	}

	public double convertToMilli(double num) {
		return num=num/100;
	}

	public double volumeOfCylinder() {
		return ((radius * radius * Math.PI) * high);
	}

	public double volumeOfCylinderInMilli() {
		double h = convertToMilli(high);
		double r = convertToMilli(radius);
		return ((r * r * Math.PI) * h);
	}

	public double volumeOfCylinderInCenti() {
		double r = convertToCenti(radius);
		double h = convertToCenti(high);
		return ((r * r * Math.PI) * h);
	}

}
