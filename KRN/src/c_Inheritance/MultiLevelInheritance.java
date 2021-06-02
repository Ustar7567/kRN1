package c_Inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		System.out.println("This is bgng\n");
		Three t1=new Three();//As three extends four, there are 5 classes inside three internally(one from five, two from four, two from three)
		t1.bangalore();
		t1.chennai();
		t1.mumbai();
		t1.pune();
		t1.kerala();
		Four f1=new Four();//As four extends five, there are 3 classes inside three internally(one from five,two from four)
		f1.mumbai();
		f1.pune();
		f1.kerala();
		Five f2=new Five();
		f2.kerala();

	}

}
class Three extends Four{ //We CAN'T write like => class Three extends Four,Five
	public void bangalore(){ // Three is the Child class of Four
		System.out.println("Blr");
	}
	public void chennai() {
		System.out.println("Chennai");
	}
}

class Four extends Five{ //Four is the child class of Five and parent class of Three
	public void mumbai() {
		System.out.println("Mumbai");
	}
	public void pune() {
		System.out.println("Pune");
	}
}
class Five{ //Five is the parent class
	public void kerala() {
		System.out.println("Kerala\n");
	}
}
