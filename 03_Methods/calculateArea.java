import java.util.Scanner;

public class calculateArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter what u want to calculate: 1.Circle\n2.Rectangle\n3.Square");
        int input = scanner.nextInt();

        if (input == 1) {
            System.out.println("Enter radius:");
            double radius = scanner.nextDouble();
            double areaOfCircle = calculateArea(radius);
          
            System.out.printf("Area of circle is %.2f%n", areaOfCircle); 
        } else if (input == 2) {
            System.out.println("Enter length:");
            double length = scanner.nextDouble();
            System.out.println("Enter breadth:");
            double breadth = scanner.nextDouble();
            double areaOfRectangle = calculateArea(length, breadth);
            
            System.out.printf("Area of rectangle is %.2f%n", areaOfRectangle);
        } else if (input == 3) {
            System.out.println("Enter side:");
            int side = scanner.nextInt();
            int areaOfSquare = calculateArea(side);
            
            System.out.printf("Area of square is %d%n", areaOfSquare);
        } else {
            System.out.println("Wrong input");
        }
    }

    
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    public static int calculateArea(int side) {
        return side * side;
    }
}
