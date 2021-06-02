package a_SimpleJavaExp;

public class Cd_ReversingAString {

	public static void main(String[] args) {
		String str="Selenium Training";
		int len=str.length();
		char arr[]=str.toCharArray();//separates each character in the string in a character array
		
		for(int i=len-1;i>=0;i--) {
			System.out.print(arr[i]);
			//"System.out.print" prints in the same line
			//"System.out.println" prints in next line
		}
	}

}