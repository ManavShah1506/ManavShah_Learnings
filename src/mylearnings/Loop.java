package mylearnings;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {		 
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num 1 ");
    float number1 = sc.nextInt();
    System.out.print("Enter num 2 ");
    float number2 = sc.nextInt();
    System.out.println("enter an option from the following:");
    System.out.println("1. Addition");
    System.out.println("2. Substraction");
    System.out.println("3. Multiplication");
    System.out.println("4. division");
    int option = sc.nextInt();
    switch (option) {
    case 1:
    	System.out.println(number1 + number2);
    break;
    case 2:
    	System.out.println(number1 - number2);
    break;
    case 3:
    	System.out.println(number1 * number2);
    break;
    case 4:
    if (number2 == 0) 
    	{System.out.println("Cannot be divided");
      } 
    else {
    	System.out.println(number1 / number2);
      }
    break;
    }
  }
}		
