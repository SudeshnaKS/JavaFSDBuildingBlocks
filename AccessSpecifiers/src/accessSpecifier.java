//Default Access Specifier 
class defAccessSpecifier
{  
	void display() 
{
	System.out.println("Default Access Specifier scope lies within package.");   
}  
}
public class accessSpecifier{
	public static void main(String[]args)
	{
		System.out.println("Default Access Specifier");
		defAccessSpecifier A= new defAccessSpecifier();
		A.display();
		
	}
	
}
//Private Access Specifier 
class priAccessSpecifier
{ 
	private void display() 
{
		System.out.println("Private Access Specifier scope lies within class.");   	
}
}
    class accessSpecifierPrivate{
	public static void main(String[]args)
	{
		System.out.println("Private Access Specifier");
		defAccessSpecifier A= new defAccessSpecifier();
		A.display();
		
	}
	
}


