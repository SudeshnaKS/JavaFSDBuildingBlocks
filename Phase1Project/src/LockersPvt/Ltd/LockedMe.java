package LockersPvt.Ltd;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe {

	public static void main(String[] args) throws IOException {
		welcome();
	    procedure();
		
	}

	private static void welcome() {
		System.out.println("\t|***X***X***X***X***X***X***X***X***X***X***X***|\n");
		System.out.println("\t|           Welcome to LOCKEDME.com !           |");
		System.out.println("\t|              Lockers Pvt Ltd.                 |\n");
		System.out.println("\t|***X***X***X***X***X***X***X***X***X***X***X***|");
		System.out.println("\n\t         Developer\t: Sudeshna K S \n");
		System.out.println("\t------------------------------------------------");
	    System.out.println("\t  Please choose one of the following options :");
	    System.out.println("\t------------------------------------------------");
	    
	    operation();
	}

	private static void operation() {
		System.out.println("\t             1. List Current Files");
		System.out.println("\t             2. Business Operations");
		System.out.println("\t             3. Close Application");
		
	}
	private static void action() {
		 System.out.println("\t------------------------------------------------");
			System.out.println("\t Choose the action you want to be performed :");
			System.out.println("\t             A. ADD a File");
			System.out.println("\t             B. DELETE a File");
			System.out.println("\t             C. SEARCH for a File");
			System.out.println("\t             D. Go Back");
			System.out.println("\t------------------------------------------------");
		
	}
	private static void procedure() {
		
		int option;
		Scanner sc =new Scanner(System.in);
		option = sc.nextInt();
		switch(option) {
		case 1:
			sort();
			break;
		case 2:
                action();
                Scanner ab = new Scanner(System.in);
                
                char[] input = ab.nextLine().toUpperCase().trim().toCharArray();
                char operation = input[0];
              switch(operation)
				{
				case 'A':
					System.out.println("Input the name of a file to be created: ");
					String name = sc.next();
				    add(name);
					break;
					
				case 'B':
					System.out.print("Input the name of a file to be deleted: ");
					String delete = sc.next();
					delete(delete);
					break;
				case 'C':
					System.out.println("Input the name of a file to be searched: ");
					String search = sc.next();
					search(search);
					break;
				case 'D':
					operation();
					procedure();
					break;
					
			default:
					System.out.println("\nTry Again! Action not supported.\n");
					break;
			}
		
				break;
		case 3:
// Exit application
			System.out.println("\nThank you for choosing our service. Good day!");
			System.exit(1);
			break;
		
		default:
         	System.out.println("\nPlease enter a value between 1-3. Choice out of range.\n");
			break;
		
	}
}
protected static void delete(String remove) {
		
		File file = new File( (System.getProperty("user.dir") ) + "\\" + remove );
		
		try{
		if(file.exists()) {
		file.delete();
		{
			System.out.println("File deleted successfully!");
			}
		} else {
			System.out.println("File could not be deleted. File does not exist!");
		}}
		 catch(Exception e) {
			 System.out.println("Error:");
			 e.printStackTrace();
		 }
	}
	
// Sorting Files
	protected static void sort() {
		int fileCount = 0;
	    ArrayList<String> names = new ArrayList<String>();
	
		File Path = new File(System.getProperty("user.dir"));
		File[] list = Path.listFiles();
		fileCount = list.length;
		
		
		System.out.println("Sorted Files: \n");
		for (int i = 0; i < fileCount; i++) {
		  if (list[i].isFile()) {
		    names.add(list[i].getName());
		  } 
		}
		
		String[] str = new String[names.size()];
		 
	    for (int i = 0; i < names.size(); i++) {
	        str[i] =names.get(i);
	    }
		
	    String[] sorted = sort(str, str.length);
		
		for(String File: sorted) {
			System.out.println(File);
		}
}

// Adding File
	protected static void add(String addfile) {
		File file = new File( (System.getProperty("user.dir") ) + "\\" + addfile);
		
		try {
			if (file.createNewFile() ) {
				System.out.println("File created successfully!");
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("Error:");
			e.printStackTrace();
		}
	}

// Searching File
	protected static void search(String find) {
	        
		File file = new File( (System.getProperty("user.dir") ) + "\\" + find);
		if(file.exists()) {
			System.out.println("File found!");
		} else {
			System.out.println("File cannot be found.");
		}	
	}

	protected static String[] sort(String array[], int size){
		String a = "";
		for(int i=0; i<size; i++){
			for(int j=1; j<(size-i); j++){
				if(array[j-1].compareToIgnoreCase(array[j])>0){
					a = array[j-1];
					array[j-1]=array[j];
					array[j]=a;
				}
			}
		}
		return array;
	}
	
}


