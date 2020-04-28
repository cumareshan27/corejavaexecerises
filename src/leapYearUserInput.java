import java.util.Scanner;

public class leapYearUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take a number for year to calculate between 1 to year
		int year;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter any Year: ");
    	year = scan.nextInt();
    	scan.close();
        boolean isLeap = false;
		//loop through until the length of the year
        for (int i = 1; i <= year; i++) {
        	 if(i % 4 == 0)
             {
                 if( i % 100 == 0)
                 {
                     if ( i % 400 == 0)
                         isLeap = true;
                     else
                         isLeap = false;
                 }
                 else
                     isLeap = true;
             }
             else {
                 isLeap = false;
             }

             if(isLeap==true) {
                 //System.out.println(year + " is a Leap Year.");
             	 System.out.println(i + " is a Leap Year");
             }
             else {
                 //System.out.println(year + " is not a Leap Year.");
                 System.out.println(i + " is not a Leap Year");
             }
        }//end for loop

	}

}
