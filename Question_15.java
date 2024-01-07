import java.io.*;
import java.util.*;
public class Question_15
{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int person1Age,person2Age,person3Age;
	System.out.println("Enter age for person 1");
	person1Age=input.nextInt();//taking input
	System.out.println("Enter age for person 2");
	person2Age=input.nextInt();//taking input
	System.out.println("Enter age for person 3");
	person3Age=input.nextInt();//taking input
	if(person1Age<person2Age){ //comparing person1Age and person2Age
	    if(person2Age<person3Age){
	        System.out.println("Person 3 is oldest and person 1 is youngest");
	    }
	    else{
	        System.out.println("Person 2 is oldest and person 1 is youngest");
	    }
	}
	else{ 
	    if(person1Age<person3Age){ //comparing person1Age and person3Age
	        System.out.println("Person 3 is oldest and person 2 is youngest");
	    }
	    else{
	        System.out.println("Person 2 is oldest and person 2 is youngest");
	    }
	}
	}
}