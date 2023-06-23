package emailApp;
import java.util.*;

public class Email {
	
	//made them private so no one can access them
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private int mailboxCapacity = 600;
	private String email;
	private String alternateEmail;
	private String companyName = "vw.com";
	
	//Constructor to receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for a department which return the department
		this.department = setdepartment();
		System.out.println("The department is " + this.department);
		
		//Call a method that can generate random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companyName;
		System.out.println("Your email is " + email);
	}
	
	//Ask for the department
	private String setdepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code  ");
		Scanner input = new Scanner(System.in);
		int userChoice = input.nextInt();
		if( userChoice == 1 ) {
			return "Sales";
		}
		else if ( userChoice == 2 ) {
			return "Development";
		}
		else if( userChoice == 3 ) {
			return "Accounting";
		}
		else {
			return " ";
		}
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTVXYZ1234567890!@#$%^&*";
		char[] password = new char[length];
		for( int i = 0; i < length; i++ ) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set and get method for the mailbox capacity
	public void setMailboxCapacity( int capacity ) {
		this.mailboxCapacity = capacity;	
	}
	
	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}
	
	//set and get method for alternate email
	public void setAlternateEmail( String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	//set and get method for changing the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public String getchangePassoword() {
		return password;
	}
	

}
