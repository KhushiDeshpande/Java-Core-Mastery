import java.util.Scanner;

public class FinanceEngine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double p = scanner.nextDouble();

        System.out.print("Enter annual interest rate): ");
        double r = scanner.nextDouble();

        System.out.print("Enter time in yrs: ");
        double t = scanner.nextDouble();

        // calculating amount
        double amount = p * Math.pow((1 + (r / 100)), t);

        long finalBalance = Math.round(amount); //rounding off

        System.out.println("Initial Investment: " + p);
        System.out.println("Final Balance: " + finalBalance);
        System.out.println("Total Profit: " + (finalBalance - p));

        scanner.close();
    }
}
