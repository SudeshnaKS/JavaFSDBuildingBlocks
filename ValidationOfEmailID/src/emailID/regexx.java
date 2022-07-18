package emailID;
/*E-mail ID Verification for employees of abc company.
All E-mail ID should contain @abc.com
- 5 to 12 lowercase/uppercase letters,numbers
- An @ symbol
- An . character
- abc.com should be present.
*/


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexx {


	public static boolean ValidEmailID (String ID) {
 
			String regex ="^[\\w-]{5,12}@(abc.com?)$";
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(ID);
			return match.matches();
			}
	 

	public static void main(String[] args) {
		   
		    String ID1 = "abcdEFGHI684@abc.com";
		    String ID2 = "abcdEFGHI684@ask.com";
		    boolean valid = ValidEmailID(ID1);
		    boolean valid1 = ValidEmailID(ID2);
		    if (valid)
		    	System.out.println(ID1 + " is valid");
		    else
		    	System.out.println(ID1 + " is not valid");
		    if (valid1)
		    	System.out.println(ID2 + " is valid");
		    else
		    	System.out.println(ID2+ " is not valid");
		    
	}

}
