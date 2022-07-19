//In Java, when you pass a primitive type to a method,
//it is passed by value. Thus, what occurs to the parameter 
//that receives the argument has no effect outside the method. 
public class callByValue {
	
	public static void data(int a ,int b){
		a+=20;
		b+=30;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		int c=10,d=10;
		System.out.println(c);
		System.out.println(d);
		
		callByValue e =new callByValue();
		e.data(c,d);
		System.out.println(c);
		System.out.println(d);		
	}

}


