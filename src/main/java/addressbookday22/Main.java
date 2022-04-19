package addressbookday22;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Welcome to Address Book System");
        Map<String, AdressBook> map = new HashMap<>();
        System.out.println("Enter Number of address book you want to add");
        Integer count = scan.nextInt();
        Integer i = 0;
        while (i < count) {
            System.out.println("Enter  book name");
            String bookName = scan.next();
            AdressBook ad = new AdressBook();
            ad.operation();
            map.put(bookName, ad);
            i++;
        }
        System.out.println(map);
      
	    }

}
		
	

	
		
	


