package mylearnings;

public class Methodimpl {
	private static String s;

	public void MethodA() {
		System.out.println("I am from method without return type"); 
	}
	public void MethodA(String s) {
	    System.out.println("I am from method without return type and an input argument");
	}
	public String MethodB() {
		System.out.println("I am from method with return type and an input argument");
		return s; 
	}
	public String MethodB(String s) {
	    System.out.println("I am from method with return type and an input argument");
	    return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Methodimpl obj = new Methodimpl();
    obj.MethodA();
	obj.MethodA(s);
	obj.MethodB();
	obj.MethodB(s);
	System.out.println("We used method overloading in this program.");
	}

}
