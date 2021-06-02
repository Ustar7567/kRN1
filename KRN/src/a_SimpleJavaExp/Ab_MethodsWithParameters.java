package a_SimpleJavaExp;

public class Ab_MethodsWithParameters {

	public static void main(String[] args) {
		System.out.println("This is bgng");
		Three t1=new Three();
		t1.add(30,40);//calling methods with parameters by passing arguments
		t1.add(90, 30);
		t1.city("Mumbai");//calling method with parameter by passing string argument

	}

}
class Three{
	public void add(int a, int b) {//all methods in Three class are methods with parameters
		int c=a+b;
		System.out.println(c);
	}
	public void city(String cityName) {
		System.out.println(cityName);
	}
}