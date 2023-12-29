package tutorialweek2;
import java.util.Scanner;

public class voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		if (age>=18) {
			System.out.println("Congratulations!, You are eligible for vote.");
		}else {
			System.out.println("Sorry!,You are not eligible for vote.");
		}
		input.close();
	}

}
