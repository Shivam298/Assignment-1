import java.io.*;
import java.util.*;
public class Question_5
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number1=4,number2=3,temporaryNumber;//declaring and initalizing variables
		System.out.println("Before Swapping "+number1+" "+number2);//before swapping
		temporaryNumber=number1;//performing swap operation
		number1=number2;
		number2=temporaryNumber;
		System.out.println("After Swapping "+number1+" "+number2);//after swapping
	}
}