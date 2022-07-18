package emailID;
import java.util.ArrayList;
import java.util.Scanner;
public class emailID{

static String ID;
	
public static void main(String[] args){
	   
		// Getting the input from User
		System.out.println("Welcome! Let us help you.");
		System.out.println("\n");
		System.out.println("Enter the emailID you're searching for.");
		String ID;
		Scanner sc= new Scanner(System.in);
		ID = sc.next();
		System.out.println("Searching for " +ID+"...");
		
		
      ArrayList <String> list = new ArrayList<String>();
      //Instantiating an ArrayList object
      list.add("johanssonjamess652@abc.com");
      list.add("stefan08morris@abc.com");
      list.add("damonpsalvatore@abc.com");
      list.add("caroline73forbes8@abc.com");
      list.add("elena4gilbert@abc.com");
      list.add("bonniexbennet67@abc.com");
      list.add("edwardcullen22@abc.com");
      list.add("alyssaharrington@abc.com");
      list.add("louisasullen90@abc.com");
      list.add("sherleydavissk@abc.com");
      list.add("alexlee7824xxx@abc.com");
      list.add("sofiamariejohnkk3@abc.com");
      list.add("harrystyless782@abc.com");
      list.add("zayntomlinsonnxoxo@abc.com");
      list.add("iansommerhalder1844@abc.com");
      list.add("angelacurieegreogor@abc.com");
  	  list.add("isabellanorrah@abc.com");
  	  list.add("timotheeparkerson@abc.com");
      list.add("fionaasyvliamichaelson@abc.com");
  	  
     
      for (String element : list){
               if(element.equals(ID)){
                   System.out.println("Employee Email-ID is VALID!"); 
                   break;
            	} else {
            		System.out.println("..");
            }
         }
    }
}
