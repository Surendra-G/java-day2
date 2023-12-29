package tutorialweek2;
import java.util.Scanner;
public class greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = input.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = input.nextInt();
		if (a>b) {
			System.out.println(a+" is greater than "+b);
		}else {
			System.out.println(b+" is greater than "+a);
		}
		input.close();
	}

}
