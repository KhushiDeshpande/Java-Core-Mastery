import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Welcome to the Mad Libs Game ");

        System.out.print("Enter an Adjective: ");
        String adj = scanner.nextLine();

        System.out.print("Enter a Noun (Place): ");
        String place = scanner.nextLine();

        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
        scanner.nextLine(); //  Clearing the buffer

        System.out.print("Enter a Name: ");
        String name = scanner.nextLine();

        System.out.println("\n YOUR STORY ");
        System.out.println(name + " went to " + place + " and found " + num + " " + adj + " apples.");
    }
}
