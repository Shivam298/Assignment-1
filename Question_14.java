import java.io.*;
import java.util.*;
public class Question_14
{
	public static void main(String[] args) {
	for(int i=1;i<=100;i++){//initalizing loop to run from 1 to 100{
	    if(i%3==0 && i%5==0){//checking is divible by 3 and 5{
	        System.out.println(i+" is divisible by both 3 and 5");
	    }
	    else if(i%3==0){//checking if divisible by 3{
	        System.out.println(i+" is divisible by 3");
	    }
	    else if(i%5==0){//checking if divisible by 5{
	        System.out.println(i+" is divisible by 5");
	    }
	}
	}
}