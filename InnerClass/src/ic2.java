//anonymous inner class
abstract class AnonymousInnerClass {
	   public abstract void display();
	}


	public class ic2 {

	public static void main(String[] args) {
	AnonymousInnerClass i = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("congratulations!!");
	         }
	      };
	      i.display();
	   }
	}

