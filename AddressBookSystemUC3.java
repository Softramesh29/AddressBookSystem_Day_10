package com.bridgelabz.AdressBookSystem_Day_9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookSystemUC3 {
	private String personName;
	private String address;
	private String state;
	private int zip;
	private long phoneNumber;
	private String eMail;
	
	AddressBookSystemUC3(String personName, String address, String state, int zip, long phoneNumber, String eMail ){
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
		Collection<AddressBookSystemUC3> c = new ArrayList<AddressBookSystemUC3>();
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		int choise;
		do {
			System.out.println("1.CREATE CONTACT");
			System.out.println("2.DISPLAY THE CONTACT");
			System.out.println("3.DELETE THE CONTACT");
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
	
					
					c.add(new AddressBookSystemUC3(personName, address, state, zip, phoneNumber, eMail));
				break;
				case 2:
					System.out.println("-------------------------------------------------------------------------");
					Iterator<AddressBookSystemUC3> i = c.iterator();
					while(i.hasNext()) {
						AddressBookSystemUC3 e = i.next();
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
						AddressBookSystemUC3 e = i.next();
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
			}
		 }while(choise != 0);
	
	}
}
}
