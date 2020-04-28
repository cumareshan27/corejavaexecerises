import java.util.Scanner;

public class movieShowings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number selection for the movies");
		
		System.out.println("Enter 1 for kids movies");		
		System.out.println("Enter 2 for adult movies");
		
		int number = sc.nextInt();
		System.out.println("Enter 3 for adult horror");
		System.out.println("Enter 4 for adult romance");
		System.out.println("Enter 5 for adult comedy ");
		String chose = sc.next();
		//String chose1 = "hello ";
		
		switch(number){
			case 1 :
				System.out.println("1. Dolittle, 2. Sonic the Hedgehog, 3. The Call of the Wild sre playing in Fairfax Regal Cinemas");
			break;
			case 2:
				System.out.println("Adult movie selection");
				switch(chose) {
				case "3":
					System.out.println("Adult horror movies are not playing due to COVID-19");
				case "4":
					System.out.println("Adult romance movies are being streamed through Roku streamer");
				case "5" :
					System.out.println("Adult comedy are playing Richmond Regal please follow social distancing");
				}
				
	}

}
}
