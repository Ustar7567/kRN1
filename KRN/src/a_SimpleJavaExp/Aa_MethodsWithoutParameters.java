package a_SimpleJavaExp;

public class Aa_MethodsWithoutParameters {

	public static void main(String[] args) {
		System.out.println("This is bgng");
		One o1= new One();
		o1.bangalore();//calling methods without parameters(no arguments passed)
		o1.chennai();
		Two t1=new Two();
		t1.mumbai();
	}

}
class One{
	public void bangalore() {//all methods inside class One are without parameters
		System.out.println("This is Bangalore");
	}
	public void chennai() {
		System.out.println("This is Chennai");
	}
}
class Two{
	public void mumbai() {
		System.out.println("This is Mumbai");
	}
}