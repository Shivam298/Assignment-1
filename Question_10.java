import java.io.*;
import java.util.*;
public class Question_10
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number1,number2;
		System.out.println("Enter first number");
		number1=input.nextInt();//taking input
		System.out.println("Enter second number");
		number2=input.nextInt();//taking input
		//comparing both numbers and displaying appropriate message
		if(number1<number2){
		    System.out.println("Second number is larger than first number");
		}
		else {
		    System.out.println("First number is larger than second number");
		}
	}
}