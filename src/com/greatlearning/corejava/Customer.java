package com.greatlearning.corejava;

import java.util.Scanner;

public class Customer {
  Scanner sc = new Scanner(System.in);
  
  String firstName;{
  System.out.println("enter First Name ");
  firstName = sc.next();
  }
  //this is a usual method as it has a return type value and has a defined object (String)
  String lastName;{
	  System.out.println("enter Last Name ");
	  lastName = sc.next();
	  }
  int Age;{
	  System.out.println("enter your age ");
	  Age = sc.nextInt();
	  }
  String City;{
	  System.out.println("enter your city");
	  City = sc.next();
	  }
  protected String Password = "Password = Black123";
  
}
