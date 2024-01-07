import java.io.*;
import java.util.*;
public class Question_19
{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int number;
	System.out.println("Enter number");
	number=input.nextInt();//taking input
	if(number%2==0){ //checking if number is even or not
	    System.out.println("1");
	}
	else{
	    System.out.println("0");
	}
}
}