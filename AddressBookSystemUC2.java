package com.bridgelabz.AdressBookSystem_Day_9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class AddressBookSystemUC2 {
	private String personName;
	private String address;
	private String state;
	private int zip;
	private long phoneNumber;
	private String eMail;
	
	AddressBookSystemUC2(String personName, String address, String state, int zip, long phoneNumber, String eMail ){
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
		return "Name : "+personName+ ", Address : "+address+", State : "+state+", Zip Code : "+zip+", Phone No : "+phoneNumber+", Email Address : "+eMail;
	}
class Addressbook {
	public static void main(String[] args) {
		Collection<AddressBookSystemUC2> c = new ArrayList<AddressBookSystemUC2>();
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		int choise;
		do {
			System.out.println("1.CREATE CONTACT");
			System.out.println("1.DISPLAY THE CONTACT");
			System.out.println("Enter Your choise : ");
			choise = scan1.nextInt();
			
			switch(choise) {
				case 1:
					System.out.println("Enter Person Name : ");
					String personName = scan.nextLine();
					System.out.println("Enter the Address : ");
					String address = scan.nextLine();
					System.out.println("Enter the State : ");
					String state = scan.nextLine();
					System.out.println("Enter the Zip Code : ");
					int zip = scan1.nextInt();
					System.out.println("Enter the Phone Number : ");
					long phoneNumber = scan1.nextLong();
					System.out.println("Enter the Email Address : ");
					String eMail = scan.nextLine();
	
					
					c.add(new AddressBookSystemUC2(personName, address, state, zip, phoneNumber, eMail));
				break;
				case 2:
					System.out.println(c);
				break;
			}
		}while(choise != 0);
	
	}
}
}
