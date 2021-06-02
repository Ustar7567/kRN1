package a_SimpleJavaExp;

public class Bb_StaticKeyword {

	public static void main(String[] args) {
		System.out.println("This is bgng");
		Four.bangalore();//calling static method without creating object
		Four.chennai();//             "
		Four f1=new Four();//calling non-static method by creating object
		f1.mumbai();
		f1.bangalore();
		/*We can call static methods by creating objects also like f1.bangalore(); 
		 But, it's not preferred cz creating object consumes memory.
		 Refer to the warning symbol in line 11*/
	}
}

class Four{
	public static void bangalore() {//static method
		System.out.println("This is Blr");
	}
	public static void chennai() {//static method
		System.out.println("This is chni");
	}
	public void mumbai() {//non-static method
		System.out.println("This is Mumbai");
	}
}
