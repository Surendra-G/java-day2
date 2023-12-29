package tutorialweek2;
import java.util.Scanner;

public class gradingsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Score: ");
		int marks = input.nextInt();
		if(marks<50) {
			System.out.println("Fail!");
		}else if(marks>=50 && marks<60) {
			System.out.println("C-Grade");
		}else if(marks>=60 && marks<70) {
			System.out.println("B-Grade");
		}else {
			System.out.println("A-Grade");
		}
		input.close();
	}

}
