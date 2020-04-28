import java.util.Scanner;

public class fibonanci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get the fibonanci series");
		int number = sc.nextInt();
		int t1=0; 
		int t2=1;
		
		System.out.println("Upto " + number + ": ");
		//for (int i = 1; i <= number; i++) {
		while (t1 <= number) {
			System.out.print(t1+" + " );
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
			
		//}

	}

}
