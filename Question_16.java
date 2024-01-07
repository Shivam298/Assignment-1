import java.io.*;
import java.util.*;
public class Question_16
{
	public static void main(String[] args) {
	int size=5;
	int i, j;
    // outer loop to handle rows
    for (i = 0; i < size; i++) {
        // inner loop to print spaces.
        for (j = size - i; j > 1; j--) {
            System.out.print(" ");
        }
        // inner loop to print stars.
        for (j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        // printing new line for each row
        System.out.println();
        }
	}
}