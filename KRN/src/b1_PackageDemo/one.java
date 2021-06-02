package b1_PackageDemo;
import b2_PackageDemo.*;
//We can import each class in b2_PackageDemo as follows
//b2_PackageDemo.one1;             b2_PackageDemo.two2;
//But by importing with *, all present and future classes will be imported so that we don't hv to import each time we create a class in another package.

public class one {

	public static void main(String[] args) {
		System.out.println("This is bgng");
		one_a obj1=new one_a();//calling methods from the same package(b1_PackageDemo), same program(one.java)
		obj1.blr();
		obj1.chni();
		two obj2= new two();//calling methods from same package(b1_PackageDemo), different program(two.java). No need to import. We can call as usual
		obj2.mumbai();
		obj2.pune();
		one1 obj3=new one1();//calling methods from different package(b2_PackageDemo) by importing => import b2_PackageDemo.*;
		obj3.agra();
		obj3.kerala();
		two2 obj4=new two2();//calling methods from different package(b2_PackageDemo) by importing => import b2_PackageDemo.*;
		obj4.noida();
	}

}

class one_a{
	public void blr() {
		System.out.println("This is Blr");
	}
	public void chni() {
		System.out.println("This is Chni");
	}
}
