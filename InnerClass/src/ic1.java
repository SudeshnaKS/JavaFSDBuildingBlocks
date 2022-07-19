public class ic1 {

private String msg="Hello";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }   
 public static void main(String[] args) {
		ic1  ob=new ic1 ();  
		ob.display();  
		}
	}
