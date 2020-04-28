import java.util.Scanner;

public class greaterThan200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number:- ");
		int number1 = sc.nextInt();
		System.out.println("Please enter second number:- ");
		int number2 = sc.nextInt();
		//bug - if the fist number is less than 200 then the it is not checking for the second number
		if (number1 < 200 || number1%2 == 0) {
			System.out.println("First number is less than 200 and even number");
		}
		else if (number2 < 200 || number2 % 2 ==0) {
			System.out.println("Second number is less than 200 and even number ");
		}
		else {
			System.out.println("Number entered is not less than two hundered and even number");
		}
	}

}
