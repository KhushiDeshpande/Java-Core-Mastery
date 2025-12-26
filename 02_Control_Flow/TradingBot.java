import java.util.Random;
import java.util.Scanner;

public class TradingBot {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("HFT Logic Simulator");
      
        System.out.print("Enter your starting capital: "); //asking capital
        double capital = scanner.nextDouble();

        //standard Java Range Logic: (max - min + 1) + min
       // we can directly use random.nextInt(100, 201) in newer versions of JAVA
        double marketPrice = random.nextInt(101) + 100;
        
        System.out.println("MARKETPRICE: " + marketPrice);

        if (marketPrice < 120 && capital >= 100) {
            System.out.println("SIGNAL: Strong Buy (Underpriced Asset)");
        }
        else if (marketPrice >= 140 && marketPrice <= 160) {
            System.out.println("SIGNAL: Hold (Market Stability)");
        }
        else if (marketPrice > 180) {
            System.out.println("SIGNAL: Sell (Take Profit)");
        }
        else {
            System.out.println("SIGNAL: No Action (Insufficient Capital or Neutral Trend)");
        }

        scanner.close(); 
    }
}
