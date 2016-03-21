public class phonenum {
public static void main(String[] args) {
	//String[] args=new String[1];
	//Enter the phone number as the first argument
	if (args.length!=1 || args[0]==null || args[0].length()<10)
	{
		System.err.print("Usage: java phonenum <phonenumber>: Not a phonenumber");
		return;
	}
	String phoneno=args[0];
	phoneno.replaceAll(" ", "");
	phoneno.replaceAll("-", "");
	
	System.out.println (phoneno.matches("(\\+[1-9][0-9]{10,12})|([1-9][0-9]{9})"));
}
}
