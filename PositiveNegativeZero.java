
import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        String result = checkNumber(number);
        System.out.println(result);
        scanner.close();
    }

    public static String checkNumber(double number) {
        if (number > 0) {
            return number + " is a positive number.";
        } else if (number < 0) {
            return number + " is a negative number.";
        } else {
            return number + " is zero.";
        }
    }
}

    

