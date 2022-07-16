package typeCasting;
public class implicitAndExplicit {

	public static void main(String[] args) {
		// To perform Implicit Conversion 
		System.out.println("Implicit Type Casting also known as Widening takes place " +"\n" +"when two data types are automatically converted."+"\n"+ "This happens when two data types are compatible.");
		char a='A';
		System.out.println("Value of a:" +a);
		
		int b=a;
		System.out.println("Value of b:" +b);
		
		float c=a;
		System.out.println("Value of c:" +c);
		
		double d=a;
		System.out.println("Value of d:" +d);
		
		long e=a;
		System.out.println("Value of e:" +e);
		
		System.out.println("\n");
		
		//To perform Explicit Conversion
		System.out.println("Explicit Tpe Casting also known as Narrowing is performed" +"\n" +"when two data types are not compatible. " +"\n"+"The value of the larger data type is assigned to a smaller data type.");
		double u=99.98;
		int v= (int)u;
		System.out.println("Value in double:" +u);
		System.out.println("Value in integer:" +v);
	
	}
}