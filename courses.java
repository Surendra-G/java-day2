package tutorialweek2;
import java.util.Scanner;
public class courses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the course: ");
		String key = input.nextLine();
		switch(key) {
		case "BIT":
			System.out.println("3 Years course.");
			break;
		case "BIBM":
			System.out.println("4 Years course.");
			break;
		case "BSCIT":
			System.out.println("No course Available.");
			break;
		default:
			System.out.println("Lovely Courses Avialble xa haii feri.");
		}
		
		input.close();
	}

}
