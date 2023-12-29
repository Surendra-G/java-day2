package tutorialweek2;
import java.util.Scanner;
public class sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a number: ");
		num = scanner.nextInt();
		if(num>0) {
			System.out.println("The given number is positive.");
		}else if(num==0) {
			System.out.println("The given number is Zero.");
		}else {
			System.out.println("The given number is negative.");
		}
		scanner.close();
	}

}
