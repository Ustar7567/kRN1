package a_SimpleJavaExp;

public class Bc_Constructors {

	public static void main(String[] args) {
		System.out.println("This is Bgng");
		Six s1=new Six();//Constructor is auto-called when object for Six class is created. Hence, printed "this is six"           
		s1.bangalore();//method calling through object
	}
/*Six() is a constructor
 * Constructor name and class name should be same
 * Constructors are called automatically when objects for the class are created
 * Constructors don't return anything 
 * Constructors will not hv access specifiers/return types/type like static or non-static
 * Constructors CAN hv arguments*/
}
class Six{
	Six(){//Constructor
		System.out.println("this is six");	
		}
	public void bangalore() {//method
		System.out.println("This is Blr");
	}
}
