import java.util.Scanner;
public class BankCharges {

	public static void main(String[] args) {
		
		final double BANK_FEE = 10;
		int userInput;
		double bankServiceFee;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the number of checks written this month:");
		userInput = keyboard.nextInt();
		
		if( userInput < 20 ) {
			bankServiceFee = BANK_FEE + ( userInput * 0.10 );
			System.out.println("This month's service fees are $ " + bankServiceFee);
		} else if ( userInput < 40 ) {
			bankServiceFee = BANK_FEE + ( userInput * 0.08 );
			System.out.println("This month's service fees are $ " + bankServiceFee);
		} else if ( userInput < 60 ) {
			bankServiceFee = BANK_FEE + ( userInput * 0.06 );
			System.out.println("This month's service fees are $ " + bankServiceFee);
		} else {
			bankServiceFee = BANK_FEE + ( userInput * 0.04 );
			System.out.println("This month's service fees are $ " + bankServiceFee);
		} 

	}

}
