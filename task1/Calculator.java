import java.util.Scanner;

public class Calculator {

    
    public static double add(double a, double b) {
        return a + b;
    }

    
    public static double subtract(double a, double b) {
        return a - b;
    }

    
    public static double multiply(double a, double b) {
        return a * b;
    }

  
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; 
        }
        return a / b;
    }

  
    public static double modulus(double a, double b) {
        return a % b;
    }

  
    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

   
    public static double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Error: Cannot find square root of a negative number.");
            return Double.NaN; 
        }
        return Math.sqrt(a);
    }

   
    public static double absoluteValue(double a) {
        return Math.abs(a);
    }

    
    public static double sine(double a) {
        return Math.sin(Math.toRadians(a)); 
    }

   
    public static double cosine(double a) {
        return Math.cos(Math.toRadians(a)); 
    }

 
    public static double tangent(double a) {
        return Math.tan(Math.toRadians(a)); 
    }

   
    public static double log(double a) {
        if (a <= 0) {
            System.out.println("Error: Logarithm of a non-positive number is undefined.");
            return Double.NaN;
        }
        return Math.log10(a);
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = true;

        System.out.println("=== Welcome to the Advanced Calculator ===");

        while (continueCalc) {
            System.out.println("\nSelect Operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Power (^)");
            System.out.println("7. Square Root (√)");
            System.out.println("8. Absolute Value (|a|)");
            System.out.println("9. Sine (sin)");
            System.out.println("10. Cosine (cos)");
            System.out.println("11. Tangent (tan)");
            System.out.println("12. Logarithm (log)");
            System.out.println("13. Exit");

            System.out.print("Enter your choice (1-13): ");
            int choice = scanner.nextInt();

            if (choice == 13) {
                System.out.println("Exiting calculator");
                break;
            }

            double num1 = 0, num2 = 0, result = 0;
            boolean valid = true;

            if (choice >= 1 && choice <= 6) {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            } else if (choice == 7 || choice == 8 || choice == 9 || choice == 10 || choice == 11 || choice == 12) {
                System.out.print("Enter number: ");
                num1 = scanner.nextDouble();
            } else {
                System.out.println("Invalid choice. Please try again.");
                valid = false;
            }

            if (valid) {
                switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        break;
                    case 4:
                        result = divide(num1, num2);
                        break;
                    case 5:
                        result = modulus(num1, num2);
                        break;
                    case 6:
                        result = power(num1, num2);
                        break;
                    case 7:
                        result = squareRoot(num1);
                        break;
                    case 8:
                        result = absoluteValue(num1);
                        break;
                    case 9:
                        result = sine(num1);
                        break;
                    case 10:
                        result = cosine(num1);
                        break;
                    case 11:
                        result = tangent(num1);
                        break;
                    case 12:
                        result = log(num1);
                        break;
                }

                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                }
            }

            System.out.println("----------------------------------");
        }

        scanner.close();
    }
}
