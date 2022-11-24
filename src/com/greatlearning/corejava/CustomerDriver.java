package com.greatlearning.corejava;


public class CustomerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Customer customer = new Customer();
	Pen pen = new Pen();
    // this is a default constructor method where there is no return type and no arguments.
        System.out.println("Name is "+customer.firstName+" "+customer.lastName);
		System.out.println(customer.Age);
		System.out.println(customer.City);
		System.out.println(customer.Password);
		System.out.print(customer.firstName);
		System.out.print(" "+customer.lastName);
		System.out.print(" has purchased a"+" "+pen.brand+" pen of color "+pen.color+" costing Rs. "+pen.cost);
	}

}
