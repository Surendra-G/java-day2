package tutorialweek2;
import java.util.Scanner;
public class garde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your score: ");
		int grade = input.nextInt();
		if (100>=grade && grade>70) {
			System.out.println("Your garde is A.");
		} else if(70>grade && grade>=60) {
			System.out.println("B-grade.");
		} else if(60>grade && grade>=50) {
			System.out.println("C-grade.");
		}else if(50>grade && grade>=40) {
			System.out.println("D-grade.");
		}else if(grade<40) {
			System.out.println("Failed");
		}else {
			System.out.println("Invalid input");
		}
		input.close();
	}

}
