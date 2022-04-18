package addressbookday22;

import java.util.Scanner;

public class AdressBook {
	public void Contact() {

		ContactInfo ci = new ContactInfo();
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter First Name  : ");
		String firstName = sc.nextLine();
		ci.setFirstName(firstName);

		System.out.print("\nEnter Last Name  : ");
		String lastName = sc.nextLine();
		ci.setLastName(lastName);

		System.out.print("\nEnter E-mail  : ");
		String email = sc.nextLine();
		ci.setEmail(email);

		System.out.print("\nEnter Address  : ");
		String address = sc.nextLine();
		ci.setAddress(address);

		System.out.print("\nEnter City  : ");
		String city = sc.nextLine();
		ci.setCity(city);

		System.out.print("\nEnter State  : ");
		String state = sc.nextLine();
		ci.setState(state);

		System.out.print("\nEnter Phone Number  : ");
		long phoneNo = sc.nextLong();
		ci.setPhoneNo(phoneNo);

		System.out.print("\nEnter Zip  : ");
		int zip = sc.nextInt();
		ci.setZip(zip);
		showContact(ci);
		sc.close();

	}

	public void showContact(ContactInfo contact) {

		System.out.print("\n-----------------");
		System.out.print("\nFirst Name  : " + contact.getFirstName());
		System.out.print("\nLast Name   : " + contact.getLastName());
		System.out.print("\nAddress     : " + contact.getAddress());
		System.out.print("\nCity        : " + contact.getCity());
		System.out.print("\nState       : " + contact.getState());
		System.out.print("\nPhone Number : " + contact.getPhoneNo());
		System.out.print("\nE-mail      : " + contact.getEmail());
		System.out.print("\nZip         : " + contact.getZip());

	}

	public static void main(String[] args) {

		AdressBook book = new AdressBook();
		book.Contact();
	}
}

