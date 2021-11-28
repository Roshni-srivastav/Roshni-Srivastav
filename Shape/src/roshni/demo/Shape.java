package roshni.demo;

public class Shape {
	double length;
    double width;
  
    public void area(int length,int breadth) {
		int area=length*breadth;
		System.out.println("Area of Rectangle : "+area);
	}
	
	public void area(int side) {
		int area=side*side;
		System.out.println("Area of Square : "+area);
	}
	
	public void perimeter(int length,int breadth) {
		double perimeter;
        perimeter = 2 * (length + width);
        System.out.println("Perimeter of rectangle is : "+ perimeter);
	}
	
	public void perimeter(int side) {
		double perimeter;
        perimeter = 4 * (side);
        System.out.println("Perimeter of Square is : "+ perimeter);
	}
	
}
