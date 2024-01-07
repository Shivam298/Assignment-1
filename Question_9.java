import java.io.*;
import java.util.*;
public class Question_9
{
	public static void main(String[] args) {
	String octnum, hexnum;
    int decnum;
    Scanner scan = new Scanner(System.in);
    // Taking 5123 as an example of 
    // Octal Number.
    octnum = "5123";
    // Convert Octal to Decimal
    decnum = Integer.parseInt(octnum, 8);
    // Convert Decimal to Hexadecimal
    hexnum = Integer.toHexString(decnum);
    System.out.print("Equivalent Hexadecimal Value = "+ hexnum);
}
}