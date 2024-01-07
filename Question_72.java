import java.io.*;
import java.util.*;
public class Question_72
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String x = "10101", y = "11";
		int num1 = Integer.parseInt(x, 2);// converting binary string into integer
        int num2 = Integer.parseInt(y, 2);// converting binary string into integer
        int div = num1 / num2;/* dividing those two decimal numbers and storing in 
        div*/
        String result = Integer.toBinaryString(div);//converting sum to binary string
        System.out.println(x+" + "+y+" = "+result);
	}
}