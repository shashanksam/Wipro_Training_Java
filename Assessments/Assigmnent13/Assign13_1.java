// Java 8
//TAKE THREE NUMBERS FROM THE USER AND PRINT THE GREATEST NUMBER
import java.util.Scanner;

public class Assign13_1 {
	public static void main (String[] args) {
		System.out.print("\nEnter first number: ");
    Scanner inp = new Scanner(System.in);
		int n1,n2,n3, max;
		n1=inp.nextInt();
		max=n1;
		System.out.print("\nEnter second number: ");
    n2=inp.nextInt();
		if(max<n2) max=n2;
		System.out.print("\nEnter third number: ");
    n3=inp.nextInt();
		if(max<n3) max=n3;
		System.out.println("\nLargest number is "+max+".");
	}
}            
                       
/*
inputs
126
5489
654
Output:

Enter first number: 
Enter second number: 
Enter third number: 
Largest number is 5489.
*/
