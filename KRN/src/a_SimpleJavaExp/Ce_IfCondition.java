package a_SimpleJavaExp;

public class Ce_IfCondition {

	public static void main(String[] args) {
		String actual="ABCD";
		String expected="ABCD123";
		boolean status=actual.equals(expected);
		if(status) {
			System.out.println("this is success");
		}
		else {
			System.out.println("This is failure");
		}

	}

}
/*status holds boolean values - true or false
 * If actual string equals expected string, then status is True
 * If actual string not equals expected string, then status is False
 * if(status) means if(True)
 * if(!status) means if(False)
 */