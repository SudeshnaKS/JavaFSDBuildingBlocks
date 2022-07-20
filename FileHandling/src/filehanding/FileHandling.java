package filehanding;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class FileHandling
//Write, Append or Read your file.
{
    public static void main(String args[]) throws FileNotFoundException, IOException {
    	System.out.println("What operation would you like to perform on the file?");
        System.out.println("Write W if you want to WRITE");
        System.out.println("Write R if you want to READ");
        System.out.println("Write A if you want to APPEND");
        Scanner op =new Scanner(System.in);
        String a=op.nextLine();
        if(a.equalsIgnoreCase("R"))
        {
            fileread();
        }
        else if(a.equalsIgnoreCase("W")||a.equalsIgnoreCase("A"))
        {
            filewrite(a);
            
            
        }
        else
        {
            System.out.println("Sorry! Invalid operation.");
        }
       
    }
// Read content in your file.  
    
    public static void fileread() 
    {
    	String b="";
        try{
            File d=new File("Test.txt");
            if(! d.exists())
            d.createNewFile();
            FileReader e=new FileReader(d);
            BufferedReader c=new BufferedReader(e);
            //For reading till end
            while((b=c.readLine())!=null){
                System.out.println(b);
            }
            e.close();
            }catch(Exception e){
            System.out.println("Error : " );
            e.printStackTrace();
    }
    
    	
        }
    public static void filewrite(String a)
    {
        Scanner v=null;
        try
        {
            String text = "";
            File f=new File("Test.txt");
            
            BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
            
            FileWriter q =null;
// Write content in your file. 
            if(a.equalsIgnoreCase("W"))
            {
                q = new FileWriter(f,false);
                System.out.println("You are about to overwrite the file. Do you want to proceed?");
                System.out.println("Yes or No?");
                
                v=new Scanner(System.in);
                String s1=v.nextLine();
                if(s1.equals("no"))
                System.exit(0);
                System.out.println("Type 'CONFIRM' to finish the process.");
                f.delete();
                f.createNewFile();
                while(!(text=b.readLine()).equalsIgnoreCase("confirm")){
                    q.write(text + System.getProperty("line.separator"));
                    
                }
             
            }
// Append content in your file. 
            else
            {  q = new FileWriter(f,true);
                System.out.println("Type 'CONFIRM' to finish the process.");
                while(!(text=b.readLine()).equalsIgnoreCase("confirm")){
                    q.append(text+ System.getProperty("line.separator"));
                }
            }
            q.close();
            
        }
        catch(Exception e){
            System.out.println("Error : " );
            e.printStackTrace();
        }
        
        
    }


    }
    
