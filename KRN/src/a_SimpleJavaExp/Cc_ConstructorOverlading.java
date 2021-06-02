package a_SimpleJavaExp;

public class Cc_ConstructorOverlading {

	public static void main(String[] args) {
		System.out.println("this is bgng"); 
		Nine n1=new Nine(); //Calling over-loaded constructors by creating different objects for each and by passing different arguments
		Nine n2=new Nine(10, 20);
		Nine n3=new Nine(20,30,"Sum is ");
		n3.bangalore();//Using any object created for the constructors to call non-overloaded method within the same class
		//In line 10, we can use n1/n2/n3...any object
	}
//We can create objects for constructors. But, we can't call the constructors using objects
}
class Nine{
	Nine(){//Three over-loaded constructors with different arguments
		System.out.println("This is Nine");
	}
	Nine(int a, int b){
		int c=a+b;
		System.out.println(c);
	}
	Nine(int a, int b, String str){
		int d=a+b;
		System.out.println(str+d);
	}
	public void bangalore() {//non-overloaded method
		System.out.println("This is Blr");
	}
}