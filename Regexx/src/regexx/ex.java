package regexx;

import java.util.regex.*;

public class ex {

public static void main(String[] args) {

	String pattern = "[a-z]{2,8}+";
	String check = "Checking for result";
	Pattern p = Pattern.compile(pattern);
	Matcher c = p.matcher(check);
	
	while (c.find())
      	System.out.println( check.substring( c.start(), c.end() ) );
	}
}
