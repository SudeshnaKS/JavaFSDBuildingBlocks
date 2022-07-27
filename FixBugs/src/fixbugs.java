import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class fixbugs {

    public static void main(String[] args) {
        /*System.out.println("Hello World!");*/
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        optionsSelection();

    }
    private static void optionsSelection() {
        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
    };
        
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
        expenses.addAll(arrlist);
       
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
                switch (options){
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        optionsSelection();
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        expenses.addAll(arrlist);
                        System.out.println(expenses+"\n");
                        optionsSelection();

                        break;
                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice==options){
                               expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        optionsSelection();
                        break;
                    case 4:
                        sortExpenses(expenses);
                        optionsSelection();
                        break;
                    case 5:
                    	System.out.println("Enter the expense you need to search:\t");
                    	Scanner ab= new Scanner(System.in);
                    	int a= sc.nextInt();
                    	searchExpenses(expenses,a);
                        int result = searchExpenses(expenses,a);
                        if (result == -1) 
                            System.out.println("Expenditure not present.\n"); 
                      
                        else
                            System.out.println("Expenditure found!\n"); 
					    optionsSelection();
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                    	System.out.println("You have made an invalid choice!\n");
                    	break;
                }
                
            }
     
private static int searchExpenses(ArrayList<Integer> arrlist, int x) {
	Collections.sort(arrlist);
    int left = 0, right = arrlist.size() - 1;
        while (left <= right)
        { 
            int mid = left + (right - left) / 2; 
            if (arrlist.get(mid) == x) 
            return mid +1; 
            if (arrlist.get(mid) < x) 
            left = mid + 1; 
            
     else
            right = mid - 1; 
        } 
          return -1;      
    } 

private static void sortExpenses(ArrayList<Integer> expenses) {
	Integer[] array= expenses.toArray(new Integer[0]);
	for(Integer n : array) {
		int temp;
		for(int i=0;i<array.length;i++) {
			for(int j=i;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp= array[i];
					array[i]=array[j];
					array[j]=temp;		
				}
				
			}
		}
		
	}for(int a : array) {
		System.out.println(a);
	}
	System.out.println("\nExpenditure list sorted in ascending order.\n");
}
private static void closeApp() {
    System.out.println("Closing your application... \nThank you!");
        }
} 
