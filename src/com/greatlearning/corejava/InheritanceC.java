package com.greatlearning.corejava;


public class InheritanceC extends InheritanceB {
public void triangleArea() {
	System.out.println("Triangle Area is "+(n1*n2)/2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	InheritanceC obj = new InheritanceC();
	
	obj.circleArea();
    obj.rectangleArea();
    obj.triangleArea();
    
	}

}
