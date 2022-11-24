package mylearnings;

import java.util.Scanner;

public class floydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter num 1 ");
	int b = scan.nextInt();
	for(int i=0;i<b;i++){
    	for(int j=0;j<i;j++) 
		System.out.print(j);
    	System.out.println(i);
     }
 
	}

}
