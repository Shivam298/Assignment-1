import java.io.*;
import java.util.*;
public class Question_2
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number1,number2;
		System.out.println("Enter first number");
		number1=input.nextInt();//taking input
		System.out.println("Enter second number");
		number2=input.nextInt();//taking input
		//performing calculation
		System.out.println("Addition "+(number1+number2));
        System.out.println("Subtraction "+(number1-number2));
        System.out.println("Division "+(number1/number2));
        System.out.println("Multiplication "+(number1*number2));
	}
}