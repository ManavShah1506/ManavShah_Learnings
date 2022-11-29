package mylearnings;

public class Methodimpl2 {
	public String s = null;
	public void RedHouse() { // methods without returntype
		System.out.println("I am from method without returntype");
		}
	public void RedHouse(String s) { // method withoutreturn type and an input argument
		this.s = s;
		System.out.println(s);
		}
	public String RedHouse1() { // methods with returntype
		s = "I am from method with return type";
		return s;
		}
	public String RedHouse1(String s) { // method withreturn type and input argument
		this.s = s;
		return s;
		}
	public static void main(String[] args) {
		Methodimpl2 obj = new Methodimpl2 ();
		obj.RedHouse();
		obj.RedHouse("I am from method without return typeand an input argument");
		System.out.println(obj.RedHouse1());
		System.out.println(obj.RedHouse1("I am from methodwith return type and aninput argument"));
		System.out.println("We used method overloading inthis program.");
		}
	
	}
	
