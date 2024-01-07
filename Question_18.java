import java.io.*;
import java.util.*;
public class Question_18
{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int number1,number2;
	System.out.println("Enter first number");
	number1=input.nextInt();//taking input
	System.out.println("Enter second number");
	number2=input.nextInt();//taking input
	if(number1<number2){ //comparing numbers
	    System.out.println("number 2 is greater than number 1");
	}
	else if(number1==number2){
	    System.out.println("number 1 is equal to number 2");
	}
	else if(number1%6 == number2%6){
	    if(number1<number2){
	    System.out.println("number 2 is greater than number 1");
	}
	    else if(number1==number2){
	    System.out.println("number 1 is equal to number 2");
	}
	}
	}
}