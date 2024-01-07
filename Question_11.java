import java.io.*;
import java.util.*;
public class Question_11
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String inputString;
		System.out.println("Enter string");//taking input
		inputString=input.nextLine();
	    char[] characterArray = inputString.toCharArray();
        // Initialize counters for letters, spaces, numbers, and other characters
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        // iterate through the character array
        for (int i = 0; i < characterArray.length; i++) {
            // check if the character is a letter
            if (Character.isLetter(characterArray[i])) {
                letter++;
            }
            // check if the character is a digit
            else if (Character.isDigit(characterArray[i])) {
                num++;
            }
            // check if the character is a space
            else if (Character.isSpaceChar(characterArray[i])) {
                space++;
            }
            // check for other character
            else {
                other++;
            }
        }
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
	}
}