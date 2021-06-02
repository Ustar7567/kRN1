package a_SimpleJavaExp;

public class Cb_StaticOverloading {

	public static void main(String[] args) {
		System.out.println("This is bgng");
		Eight.add(10,20); //static overloaded method calling
		Eight.add(2, 30, "This is third static method "); //static overloaded method calling
		Eight.add(30,50,40); //static overloaded method calling
		Eight e1=new Eight(); //non-static non-overloaded method calling
		e1.bangalore();

	}

}
class Eight{ //this class has three static methods with same method name and with different arguments
	public static void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void add(int a, int b, int c) {
		int d= a+b+c;
		System.out.println(d);
	}
	public static void add(int a, int b, String str) {
		int e=a+b;
		System.out.println(str+e);
	}
	public void bangalore() {//non-static method, non-overloaded method
		System.out.println("this is Blr");
	}
}
