import java.io.*;
import java.util.*;
public class Question_6
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number1,number2;//declaring and initalizing variables
		System.out.println("Enter first number");
		number1=input.nextInt();//taking input
		System.out.println("Enter second number");
		number2=input.nextInt();//taking input
		System.out.println("Before Swapping "+number1+" "+number2);//before swapping
		number1=number1+number2;//performing swap operation without third variable
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("After Swapping "+number1+" "+number2);//after swapping
	}
}