package PackA;

import PackB.protectedAccess;

public class main {

	public static void main(String[] args) {
		defaultAccess Animal= new defaultAccess();
		System.out.println(Animal.pet1);
		System.out.println(Animal.pet2);
		
		publicAccess Name= new publicAccess();
		System.out.println(Name.student1);
		System.out.println(Name.student2);
		
		
	}

}

class protectedAcc
{  
	protectedAccess City= new protectedAccess();
	System.out.println(City.city1);
	System.out.println(City.city2);
}

class privateAcc
{  
	privateAccess Color= new privateAccess();
	System.out.println(Color.color1);
	System.out.println(Color.color2);
}