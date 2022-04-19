package addressbookday22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AdressBook {
	 static Scanner sc = new Scanner(System.in);
	    static List<ContactInfo> list = new ArrayList<ContactInfo>();

	    
	    public static void contactAdd()
	    {
	        System.out.println("Enter your firstName : ");
	        String firstName = sc.nextLine();
	        System.out.println("Enter your lastName : ");
	        String lastName = sc.nextLine();
	        System.out.println("Enter your address : ");
	        String address = sc.nextLine();
	        System.out.println("Enter your city : ");
	        String city = sc.nextLine();
	        System.out.println("Enter your state : ");
	        String state = sc.nextLine();
	        System.out.println("Enter your zipCode : ");
	        String zip = sc.nextLine();
	        System.out.println("Enter your phoneNo : ");
	        long phoneNo = sc.nextLong();
	        System.out.println("Enter your emailId : ");
	        String email = sc.nextLine();
	        ContactInfo obj = new ContactInfo(firstName, lastName, address, city, state, zip, phoneNo, email);
	        list.add(obj);
	    }
	    public static void addPersons() {
	        System.out.println("Enter number of persons added to be in address book : ");
	        int noOfPersons = sc.nextInt();
	        int count  = 1;
	        while (count <= noOfPersons) {
	            contactAdd();
	            count++;
	        }
	    }

	    public static void main(String[] args) {

	    	AdressBook ad = new AdressBook();
	       
	        System.out.println("WELCOME TO ADDRESS BOOK PROBLEM");
	        
	        addPersons();
	        System.out.println(list); 
	    }
	 
}

