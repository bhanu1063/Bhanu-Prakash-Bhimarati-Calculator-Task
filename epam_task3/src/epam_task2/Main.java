package epam_task2;
import epam_task.Calculate;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	Calculate c=new Calculate();
    	System.out.println("Enter 1 to add\nEnter 2 to Subtract\nEnter 4 to Multiply\nEnter 3 to Divide\nEnter 5 to Modulus");
    	int k=sc.nextInt();
    	switch(k) {
    	case 1:System.out.print("The addition of "+a+" and "+b+" is : ");
    			System.out.println(c.add(a,b));
    			break;
    	case 2:System.out.print("The Subtraction of "+a+" and "+b+" is : ");
    			System.out.println(c.subtract(a,b));
    		    break;
    	case 3:System.out.print("The Multiplication of "+a+" and "+b+" is : ");
    			System.out.println(c.multiply(a,b));
    			break;
    	case 4:System.out.print("The Division of "+a+" and "+b+" is : ");
    			System.out.println(c.divide(a,b));
    			break;
    	case 5:System.out.print("The Modulus of "+a+" and "+b+" is : ");
				System.out.println(c.divide(a,b));
				break;
    	default:System.out.println("Enter correct values");
    	
    	}
    	
	}

}
