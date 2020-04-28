import java.util.Scanner;

public class pyramidUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//user input value run the first for loop until the user input value
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many rows do yo want :- ");
		int number = sc.nextInt();
		sc.close();
		for (int i = 0; i<number; i++) {
			for(int j =0; j < number - i; j++) {
				System.out.print(j+ " ");
			}
			for(int k=0; k <= i; k++) {
				System.out.print("");
			}
			System.out.println();
		}

	}

}
