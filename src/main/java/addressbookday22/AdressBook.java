package addressbookday22;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AdressBook {
	public void Contact() { 

		static Scanner sc = new Scanner(System.in);
	    static List<ContactInfo> list = new LinkedList<ContactInfo>();

	
	    public static void addingContact()
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
	        System.out.println("Enter your pin : ");
	        String pin = sc.nextLine();
	        System.out.println("Enter your MobileNo : ");
	        String MobileNo = sc.nextLine();
	        System.out.println("Enter your email : ");
	        String email = sc.nextLine();
	        ContactInfo obj = new ContactInfo(firstName, lastName, city, state, pin, MobileNo, email);
	        list.add(obj);
	    }


	    public static void editContact()
	    {
	        
	        System.out.println("Enter first name for confirmation : ");
	        String firstName = sc.nextLine();
	        for (int i = 0; i < list.size(); i++) {
	            if (list.get(i).getFirstName().equalsIgnoreCase(firstName))
	            {
	                list.remove(i);
	                addingContact();
	                System.out.println("Successfully Edit data");
	            }
	            else {
	                System.out.println("No data found in Address Book");
	            }
	        }
	    }


	    public static void main(String[] args) {

	    	AdressBook Book = new AdressBook();
	        
	        System.out.println("WELCOME TO ADDRESS BOOK PROBLEM");
	        
	        System.out.println("Enter details of new contact");
	        addingContact();
	        
	        editContact();

	        System.out.println(list); 
	    }
	}

