// File Name: CalculatorMain.java
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int choice;
        double num1, num2;

        do {
            System.out.println("=== Simple Calculator ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if(choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();

                switch(choice) {
                    case 1: System.out.println("Result: " + calc.add(num1, num2)); break;
                    case 2: System.out.println("Result: " + calc.subtract(num1, num2)); break;
                    case 3: System.out.println("Result: " + calc.multiply(num1, num2)); break;
                    case 4: System.out.println("Result: " + calc.divide(num1, num2)); break;
                }
            } else if(choice == 5) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice!");
            }

        } while(choice != 5);
        sc.close();
    }
}
