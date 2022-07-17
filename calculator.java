
import java.util.*;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args)
    {

        Scanner inp= new Scanner(System.in);
        int num1,num2;
        while(true)
        {
        	System.out.println("Enter your selection:\n 1 For Addition\n 2 For substraction\n 3 For Multiplication\n 4 For division\n 5 For stop");
	        int choose;
	        choose = inp.nextInt();
	        if(choose>=6)
	        {
	        	System.out.println("Choose from above options\n");
	        	
	        }
	        if(choose==5)
	        {
	        	break;
	        }
	        if(choose>0&& choose<=4)
	        {
	        System.out.println("Enter first and second number:");
	        num1 = inp.nextInt();
	        num2 = inp.nextInt();
	        
	        if(choose==1)
	        {
	        	System.out.println("Addition is :"+(num1+num2));
	        }
	        if(choose==2)
	        {
	        	System.out.println("Subtraction is :"+(num1-num2));
	        }
	        if(choose==3)
	        {
	        	System.out.println("Multiplication is :"+(num1*num2));
	        }
	        if(choose==4)
	        {
	        	float n1=num1;
	        	float n2=num2;
	        	System.out.println("Division is :"+(n1/n2));
	        }
	  
        }
    }
}
}