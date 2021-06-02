package a_SimpleJavaExp;

public class Ca_MethodOverloading {

	public static void main(String[] args) {
		System.out.println("This is bgng");
		Seven s1=new Seven();
		s1.add(10,20);//calling same method with same object but with different arguments each time
		s1.add(10,20,30);
		s1.add(10,30,"this is msg ");
        s1.bangalore();
        s1.add(20,30);//we can call the same method multiple times, here calling add(int a, int b) method twice
	}
//Class name should be unique in a package, but we can have multiple methods with the same name but different arguments
}
class Seven{
	public void add(int a, int b) {//same method add with two int arguments
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a, int b, int c) {//same method add with three int arguments
		int d= a+b+c;
		System.out.println(d);
	}
	public void add(int a, int b, String str) {//same method add with two int, one string argument
		int e=a+b;
		System.out.println(str+e);
	}
	public void bangalore() {//non-overloaded method
		System.out.println("This is Blr");
	}
}