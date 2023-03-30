package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	public static void main(String[] args) {
		Rectangle Rectangle1 = new Rectangle(4,5);
		double x1 = Rectangle1.Area();
		System.out.print(x1);
	}


	public Rectangle (double inilength, double iniwidth) {
		length = inilength;
		width = iniwidth;
	}
	
/***
 * I multiply the length and width of the rectangle to get its area.
 * @return
 * Area
 */
	public double Area() {
		return length * width;
	}
	
/***
 * I double the sum of length and width of the rectangle to get its perimeter.
 * @return
 * the perimeter of the rectangle
 */
	public double calculatePerimeter() {
		return 2 * (length + width);
	}
/***
 * I creat a boolean variable isSmallerThan and it returns true if the area of is smaller than the area of new rectangle.
 * @return
 * True/False
 */
	public boolean isSmallerThan(Rectangle other) {
		return Area() < other.Area();
	}
/***
 * I creat a boolean variable isSquare and it returns true if the length is equal to the width
 * @return
 * if the rectangle is a square.
 */
	public boolean isSquare() {
		return length == width;
	}

/***
 * The method draws a rectangle of the length and width that we give.
 */
	public void draw() {
		StdDraw.rectangle(0.5, 0.5, length/2, width/2);
	}


}
