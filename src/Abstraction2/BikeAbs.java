package Abstraction2;

abstract class BikeAbs {
BikeAbs(){System.out.println("Bike is created");

}
abstract void run();
void changeGear() {
	System.out.println("Gear changed");
}
}
