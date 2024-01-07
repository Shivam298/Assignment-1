import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int length,breadth;
		System.out.println("Enter length");
		length=input.nextInt();//taking input
		System.out.println("Enter breadth");
		breadth=input.nextInt();//taking input
		System.out.println("Area of rectangle "+(length*breadth));//Calculating and displaying area
		System.out.println("Perimeter of rectangle "+(2*(length+breadth)));//Calculating and displaying perimeter
	}
}