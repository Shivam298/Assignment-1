import java.io.*;
import java.util.*;
public class Mini_Project
{
	public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
       char choice;
       System.out.println("Enter V for Veg Menu");
       System.out.println("Enter N for Veg Menu");
       System.out.println("Enter B for Beverages");
       System.out.println("Enter . for No order");
       choice=input.next().charAt(0);
       switch(choice){
           case 'V':{
               int choice2;
               System.out.println("Enter 1 for Noodels,2 for Dosa,3 for Pav Bhaji,4 for no order");
               choice2=input.nextInt();
               if(choice2==4){
                   System.out.println("Thank You");
               }
               else{
                   System.out.println("Your Order is Confirmed!! ");
               }
               break;
           }
           case 'N':{
               int choice2;
               System.out.println("Enter 1 for Chicken Curry,2 for Fish Fry,3 for Mutton Curry,4 for no order");
               choice2=input.nextInt();
               if(choice2==4){
                   System.out.println("Thank You");
               }
               else{
                   System.out.println("Your Order is Confirmed!! ");
               }
               break;
           }
           case 'B':{
               int choice2;
               System.out.println("Enter 1 for Cold Drink,2 for Lassi,3 for Milk Shake,4 for no order");
               choice2=input.nextInt();
               if(choice2==4){
                   System.out.println("Thank You");
               }
               else{
                   System.out.println("Your Order is Confirmed!! ");
               }
               break;
           }
           default:{
               System.out.println("No order . Thank You");
           }
       }
}
}