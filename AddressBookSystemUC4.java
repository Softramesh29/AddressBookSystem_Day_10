package com.bridgelabz.AdressBookSystem_Day_9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class AddressBookSystemUC4 {
	private String personName;
	private String address;
	private String state;
	private int zip;
	private long phoneNumber;
	private String eMail;
	
	AddressBookSystemUC4(String personName, String address, String state, int zip, long phoneNumber, String eMail ){
		this.personName = personName;
		this.address = address;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
	}
	public String getPersonName() {
		return personName;
	}
	public String getAddress() {
		return address;
	}
	public String getState() {
		return state;
	}
	public int getZip() {
		return zip;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public String getEMail() {
		return eMail;
	}
	public String toString() {
		return personName+ " "+address+" "+state+" "+zip+" "+phoneNumber+" "+eMail;
	}
class Addressbook {
	public static void main(String[] args) {
		List<AddressBookSystemUC4> c = new ArrayList<AddressBookSystemUC4>();
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		int choise;
		do {
			System.out.println("1.CREATE CONTACT");
			System.out.println("2.DISPLAY THE CONTACT");
			System.out.println("3.DELETE THE CONTACT");
			System.out.println("4.EDIT THE CONTACT");
			System.out.println("Enter Your choise : ");
			choise = scan1.nextInt();
			
			switch(choise) {
				case 1:
					System.out.print("Enter Person Name : ");
					String personName = scan.nextLine();
					System.out.print("Enter the Address : ");
					String address = scan.nextLine();
					System.out.print("Enter the State : ");
					String state = scan.nextLine();
					System.out.print("Enter the Zip Code : ");
					int zip = scan1.nextInt();
					System.out.print("Enter the Phone Number : ");
					long phoneNumber = scan1.nextLong();
					System.out.print("Enter the Email Address : ");
					String eMail = scan.nextLine();
	
					
					c.add(new AddressBookSystemUC4(personName, address, state, zip, phoneNumber, eMail));
				break;
				case 2:
					System.out.println("-------------------------------------------------------------------------");
					Iterator<AddressBookSystemUC4> i = c.iterator();
					while(i.hasNext()) {
						AddressBookSystemUC4 e = i.next();
						System.out.println(e);
					}
					System.out.println("--------------------------------------------------------------------------");
					break;
				case 3:
					boolean found = false;
					System.out.print("Enter the Person Name to Delete : ");
					String person_name = scan1.nextLine();
					System.out.println("--------------------------------------------------------------------------");
					i = c.iterator();
					while(i.hasNext()) {
						AddressBookSystemUC4 e = i.next();
						if(e.getPersonName() == person_name) {
							i.remove();
							found = true;
						}
					}
					if(!found) {
						System.out.println("Record not found");	
					}else {
						System.out.println("Record is deleted successfuly");	
					}
					System.out.println("--------------------------------------------------------------------------");
				break;
				case 4:
				  found = false;
					System.out.print("Enter the Person Name to Update : ");
					person_name = scan.nextLine();
					System.out.println("--------------------------------------------------------------------------");
					ListIterator<AddressBookSystemUC4> li = c.listIterator();
					while(li.hasNext()) {
						AddressBookSystemUC4 e = li.next();
						if(e.getPersonName() == person_name) {
							System.out.print("Enter new Person Name : ");
							personName = scan.nextLine();
							System.out.print("Enter the new Address : ");
							address = scan.nextLine();
							System.out.print("Enter the new State : ");
							state = scan.nextLine();
							System.out.print("Enter the Zip new Code : ");
							zip = scan1.nextInt();
							System.out.print("Enter the new Phone Number : ");
							phoneNumber = scan1.nextLong();
							System.out.print("Enter the new Email Address : ");
							eMail = scan.nextLine();
							li.set(new AddressBookSystemUC4(personName, address, state, zip, phoneNumber, eMail));
							found = true;
						}
					}
					if(!found) {
						System.out.println("Record not found");	
					}else {
						System.out.println("Record is Updated successfuly");	
					}
					System.out.println("--------------------------------------------------------------------------");
				break;
			}
		 }while(choise != 0);
	
	}
}
}
