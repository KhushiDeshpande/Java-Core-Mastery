import java.util.Scanner;

/* to calculate BMI and categorize health metrics. */
public class HealthAnalyticsTool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter height in feet (e.g., 5.3): ");
        double heightInFeet = scanner.nextDouble();

        double heightInMeters = heightInFeet * 0.3048; // Convert feet to meters 

        double bmiResult = calculateBmi(weight, heightInMeters);

        System.out.printf("Final BMI Calculation: %.2f%n", bmiResult);
    }

    
    public static double calculateBmi(double weight, double meters) {
       
        if (meters <= 0) {
            System.out.println("Error: Height must be greater than zero."); //handling error
            return 0;
        }

        double bmi = weight / (meters * meters);

            System.out.println("Category: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Category: Normal weight");
        } else if (bmi <= 29.9) {
            System.out.println("Category: Overweight");
        } else if (bmi <= 34.9) {
            System.out.println("Category: Obesity (Class I)");
        } else {
            System.out.println("Category: Obesity (Class II/III)");
        }

        return bmi; // Handing the value back to the main 
    }
}
