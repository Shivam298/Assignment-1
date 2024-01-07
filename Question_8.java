import java.io.*;
import java.util.*;
public class Question_8
{
	public static void main(String[] args) {
	long binaryNumber = 101001,tempBinaryNumber;
	tempBinaryNumber=binaryNumber;
	int octalNumber = 0, decimalNumber = 0, i = 0;

    while (binaryNumber != 0) { // converting binary number to decimal
      decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
      ++i;
      binaryNumber /= 10;
    }

    i = 1;

    while (decimalNumber != 0) { //converting decimal number to octal number
      octalNumber += (decimalNumber % 8) * i;
      decimalNumber /= 8;
      i *= 10;
    }
    System.out.println(tempBinaryNumber + " in binary = " + octalNumber + " in octal");
}
}