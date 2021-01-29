package project1;
//Simple Calculator
import java.util.Scanner;

public class ArithmeticCalc {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		double input1  = sc.nextInt();
		double ans = 0;
		System.out.println(input1);
		System.out.println("Enter another number");
		double input2  = sc.nextInt();
		System.out.println(input2);
	  
		System.out.println("Enter any operation to do +,-,*,/ ");
		char opr = sc.next().charAt(0);
		do {
		switch(opr) {
		case '+'  :  System.out.println("Addition :");
					 ans = input1 + input2;	
		            // System.out.println(add);
		             break;
		             
		case '-'   : System.out.println("subtraction :"); 
		             ans = input1 - input2;
					// System.out.println(sub);
					 break;
				
		case '*'   : System.out.println("Multiplication : ");
		             ans = input1 * input2;
		            // System.out.println(mul);
		             break;
		             
		case '/' : System.out.println("Division");
		           if(input2!=0) {
		             ans = input1/input2;
		          //  System.out.println(div);
		           }
		           else {
		        	   System.out.println("denominator is zero!");
		           }
		           break;
	   default  : System.out.println("Incorrect operation!");	
	              opr = sc.next().charAt(0);
	   }
		System.out.println(input1+" "+opr+" "+input2+ " = " +ans);
		
		System.out.println("Enter any operation to do +,-,*,/ ");
		opr = sc.next().charAt(0);
		//sc.close();
	   }while(opr =='+'||opr == '-'||opr == '*'|| opr =='/');
		sc.close();
	}

	
}


