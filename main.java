/*Create an interface named `Shape` consisting of two abstract methods named
`calculateArea()` and `calculatePerimeter()`.

1. Create a class named `Rectangle` which implements the `Shape` interface.
2. Create a class named `Circle` which implements the `Shape` interface.
3. Create an object of the `Rectangle` class and assign it to a reference variable of the `Shape` interface.
4. Create an object of the `Circle` class and assign it to a reference variable of the `Shape` interface.

The overridden methods should calculate and print the following output:

For the `Rectangle` class:
- `calculateArea()` should calculate the area of the rectangle.
- `calculatePerimeter()` should calculate the perimeter of the rectangle.

For the `Circle` class:
- `calculateArea()` should calculate the area of the circle.
- `calculatePerimeter()` should calculate the circumference of the circle.

Implement the classes and interface with appropriate method implementations.
*/
import java.util.Scanner;
interface shape
{
	double calculateArea();
	double calculatePerimeter();

}
class Rectangles implements shape 
{
	private double length;
	private double breadth;

	public Rectangles(double l , double b){
		this.length = l;
		this.breadth = b;
	}

	public double calculateArea()
	{
		return length * breadth;
	}
	public  double calculatePerimeter()
	{

		return 2 * (length + breadth);
	}

}
class Circle implements shape
{
	private double radius;

	public Circle(double r){
		this.radius = r;
	}
	public double calculateArea()
	{

		return 2*Math.PI*Math.pow(radius, 2);
	}
	public  double calculatePerimeter()
	{
		return 2*Math.PI*radius;
	}
}

class main
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		shape rectangle = new Rectangles(5.0, 3.0);
		System.out.println("Rectangle Area: " + rectangle.calculateArea());
		System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

		shape circle = new Circle(4.0);
		System.out.println("Circle Area: " + circle.calculateArea());
		System.out.println("Circle Perimeter (Circumference): " + circle.calculatePerimeter());

	}
}
