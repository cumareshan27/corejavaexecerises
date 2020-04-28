import java.util.Scanner;

public class greaterThan100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number the you want:   ");
		int number = sc.nextInt();
		
		if (number < 100) {
			System.out.println("Number Entered id more than 100");
		}
		else {
			System.out.println("Number entered is less than 100");
		}
	}

}
