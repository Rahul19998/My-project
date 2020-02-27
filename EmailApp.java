package Email;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first name:");
		String firstname = input.nextLine();
		System.out.println("Enter the last name:");
		String lastname = input.nextLine();
		email myEmail = new email(firstname, lastname);
		System.out.println("Enter the alternate email address: ");
		String alternateemail = input.nextLine();
		myEmail.setAlternateEmail(alternateemail);
		myEmail.setMailBoxCapacity(500);
		System.out.println("The alternate email is: " + myEmail.getAlternateEmail() + "\nThe mail box capacity is :" +myEmail.getMailBoxCapacity());

	}

}
