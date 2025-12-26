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

        double totalCost = price * quantity; //calculating cost

        System.out.println("\n Total Bill ");
        System.out.println("Item: " + item);
        System.out.println("Total: $" + totalCost);

        if (totalCost > 500) {
            System.out.println("Status: That's a bit expensive, maybe wait for a sale?");
        } 
        else {
            System.out.println("Status: Price looks good. Go for it!");
        }

        scanner.close();
    }
}
