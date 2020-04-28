import java.util.Scanner;

public class charCheckVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an Alaphabet : ");
		char ch = sc.next().charAt(0);
		
		if(ch == 'a' || ch == 'A' || ch == 'e' || ch =='E' || ch == 'i' || ch == 'I' || ch =='o' || ch == 'O' || ch =='u' || ch == 'U') {
			System.out.println("Chracter is a vowel");
		} else {
			System.out.println("Chracter is not a vowel");
		}

	}

}
