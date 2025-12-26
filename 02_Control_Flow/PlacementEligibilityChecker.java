import java.util.Scanner;

public class PlacementEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Campus Placement Validator");

        System.out.print("Enter your GPA (0.0 - 10.0): "); //asking GPA
        double gpa = scanner.nextDouble();

        System.out.print("Enter number of backlogs: "); //asking user their no. of backlogs
        int backlogs = scanner.nextInt();

        System.out.print("Do you have a Dream Company referral? (true/false): "); //asking user if they have referralewzz
        boolean hasReferral = scanner.nextBoolean();

        // Requirement: GPA > 7.5 AND 0 backlogs OR you have a direct referral.
        if ((gpa >= 7.5 && backlogs == 0) || hasReferral) {
            System.out.println("STATUS: Eligible for Interview.");

            if (hasReferral && gpa < 7.5) {
                System.out.println("NOTE: Referral bypass activated. Focus on technical rounds.");
            }
        } else {
            System.out.println("STATUS: Not Eligible. Requirements: 7.5+ GPA & 0 Backlogs.");
        }

        scanner.close();
    }
}
