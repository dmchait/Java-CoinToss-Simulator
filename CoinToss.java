import java.util.Random;
/**
 * @author Danielle Chaitkin
 *
 */
public class CoinToss {

private enum Coin{Heads, Tails};
	Random random = new Random();
	private int result;
	private int hCount = 0;
	private int tCount = 0;
	Coin flipCoin;
	
public void flipCoin(int flips) {
	int x = 0;
	while(x < flips) {
		result = random.nextInt(2);
		if (result == 0) {
			flipCoin = Coin.Heads;
			System.out.println("Heads has been flipped");
			hCount++;
			x++;
		} else {
			flipCoin = Coin.Tails;
			System.out.println("Tails has been flipped");
			tCount++;
			x++;
		}
	}
}
public void calculateStats() {
	System.out.println();
	System.out.println("Total Times Heads Flipped:" + hCount);
	System.out.println("Total Times Tails Flipped:" + tCount);
}
}
