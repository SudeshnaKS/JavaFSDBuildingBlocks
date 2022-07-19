package Employee;

public class details {
	
	int empId;
	String empName;
	String department;
	float salary;
	
	//default constructor
	public details() {
		empId=21635126;
		empName="XYZABC";
		department="Audit";
		salary=2131200;
	}
	
	//parametrized constructor
	public details(int empId,String empName,String department,float salary) {
		this.empId=empId;
		this.empName=empName;
		this.department=department;
		this.salary=salary;
	}
	
	public void display() {
		System.out.println("Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Department: "+department);
		System.out.println("Salary: "+salary);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		details e= new details();
		details e1= new details(592, "Anna", "XYZ", 123008); 

		//calling default constructor
		e.display();
		//parametrized constructor
		e1.display();
		
		 
	
	}

	
}