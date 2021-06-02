package a_SimpleJavaExp;

public class Ba_ReturnKeywordAndCodeDebugging {

	public static void main(String[] args) {
		System.out.println("this is bgng");
		Five f1=new Five(); //calling non-static method by creating object
		int c0=f1.add(3,9); //add method returns c value
		System.out.println(c0);
		int c1=f1.add(40, 30);
		System.out.println(c1);
		int d=f1.add(50, 10);
		System.out.println(d+19);
		int e= f1.multiply(5,6);//multiply method returns c value
		System.out.println(e);
		System.out.println(e+30);
		Five.bangalore();//calling static method without creating object
	}
/*We can debug the code by following the below steps:
 *Keep debug pointers by double clicking on the line no.of the code
 *Click on Debug option(bug symbol on the left side of run button
 *Click on Yes, it will switch to debug mode
 *Then click on F6 and it runs line by line*/
}
class Five{
	public int add(int a, int b) {//non-static method with return type int
		int c=a+b;
		return c;
	}
	public int multiply(int a, int b) {//non-static method with return type int
		int c= a*b;
		return c;
	}
	public static void bangalore() {
		System.out.println("this is Blr");//static method with no/void return type
	}
}