package c_Inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		System.out.println("This is bgng");
		One o1=new One();//as class one extends class two, we can call class two methods using o1 obj
		o1.bangalore();
		o1.chennai();
		o1.mumbai();
		o1.pune();
		Two t1=new Two();
		t1.mumbai();
		t1.pune();

	}

}
class One extends Two{ //Child class
	public void bangalore(){
		System.out.println("Blr");
	}
	public void chennai() {
		System.out.println("chennai");
	}
}

class Two{ //Parent class
	public void mumbai() {
		System.out.println("mumbai");
	}
	public void pune() {
		System.out.println("Pune");
	}
}