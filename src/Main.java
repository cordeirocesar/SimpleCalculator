import java.util.Locale;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number ");
        double number1 = scanner.nextDouble();

        System.out.println("Choose the operation (+, -, *, /) ");
        char operation = scanner.next().charAt(0);

        System.out.println("Enter the second number ");
        double number2 = scanner.nextDouble();

        double result;

    }
}
