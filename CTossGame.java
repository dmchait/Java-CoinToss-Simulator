import java.util.Scanner;

public class CTossGame{

public static void main(String[] args){
	CoinToss test = new CoinToss();
	
	System.out.println("Welcome to the Coin Toss Game!");
	Scanner input = new Scanner(System.in);
	
	System.out.println("How many times do you want to flip the coin?");
	int flips = input.nextInt();
	if (flips < 1) {
		System.out.println("Invalid input. Try Again.");
	} else {
	test.flipCoin(flips);
	}
	test.calculateStats();
	
	input.close();
}
}