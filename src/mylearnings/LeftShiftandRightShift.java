package mylearnings;

public class LeftShiftandRightShift {
	public int num = 10, output;
    public int performLeftShift() {
    	output = num << 1;
    	return output;
 }
    public void performRightShift(int val, int digitstoshift){
    	num = val;
    	output = num >> digitstoshift;
    	System.out.println("Right shift of the number "+ num + " is: " +output);
  }
    public static void main(String[] args) {
    	LeftShiftandRightShift obj= new LeftShiftandRightShift();
        System.out.println("Left shift of the number " + obj.num + " is: " 
    	+obj.performLeftShift());
        obj.performRightShift(45, 2);
   }
}
