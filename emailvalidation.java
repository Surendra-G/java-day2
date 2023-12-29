package tutorialweek2;
import java.util.Scanner;

public class emailvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your email: ");
		String email = input.nextLine();
		String emailtolowercase = email.toLowerCase();
		if(emailtolowercase.endsWith("@gmail.com")) {
			System.out.println("The email "+ emailtolowercase+ " is in correct form.");
		}else {
			System.out.println("Something is incoorect in the given email.");
		}
		input.close();
	}

}
