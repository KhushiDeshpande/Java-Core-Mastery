import java.util.Scanner;

public class ShoppingTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Shopping Tracker ");

        System.out.print("What are you buying? ");  // taking input
        String item = scanner.nextLine();

        System.out.print("Enter the price of " + item + ": "); // taking input
        double price = scanner.nextDouble();

        System.out.print("How many are you getting? "); // taking input
        int quantity = scanner.nextInt();

        System.out.println("Enter bank balance: "); // asking bankbalance from user
        double bankBalance = scanner.nextDouble(); 

        double totalCost = price * quantity; //calculating cost

        System.out.println("\n Total Bill ");
        System.out.println("Item: " + item);
        System.out.println("Total: $" + totalCost);

        if (bankBalance<totalCost){
            System.out.println("TRANSACTION REJECTED: You're too broke for this " + item);
        }
        else if (bankBalance==totalCost){
            System.out.println("Living on the edge, aren't we? Transaction successful.");
        }
        else{
            System.out.println("Purchase successful. Remaining balance: " + (bankBalance - totalCost));
        }

        scanner.close();
    }
}
