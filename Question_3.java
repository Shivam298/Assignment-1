import java.io.*;
import java.util.*;
public class Question_3
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number;
		System.out.println("Enter number");
		number=input.nextInt();//taking input
		for(int i=1;i<=10;i++){//peforming calculation using for loop
		    System.out.println(number+"x"+i+"="+(number*i));
		}
	}
}