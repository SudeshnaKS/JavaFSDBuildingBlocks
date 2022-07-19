public class innerClas {

	 private String msg="Hello!"; 
	 
	 class Inner{  
	  void hello(){
		  System.out.println(msg+", How are you?");}  
	 }  


	public static void main(String[] args) {

		innerClas a=new innerClas();
		innerClas.Inner in=a.new Inner();  
		in.hello();  
	}
}
	 





