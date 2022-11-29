package Tester;

public class B extends Arithmetic {

int a = 53, b = 28;

public void add() {

System.out.println(a + b);

}

public static void main(String[] args) {

Arithmetic obj = (Arithmetic) new B();

obj.add();

}
}