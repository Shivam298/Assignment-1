import java.io.*;
import java.util.*;
public class Question_71
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String x = "011011", y = "1010111";
		int num1 = Integer.parseInt(x, 2);// converting binary string into integer
        int num2 = Integer.parseInt(y, 2);// converting binary string into integer
        int sum = num1 + num2;/* Adding those two decimal numbers and storing in 
        sum*/
        String result = Integer.toBinaryString(sum);//converting sum to binary string
        System.out.println(x+" + "+y+" = "+result);
	}
}