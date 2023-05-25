package lb5;
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
    	try (Scanner scanner = new Scanner(System.in)) {

        System.out.print("Введите делимое: ");
        int dividend = scanner.nextInt();

        System.out.print("Введите делитель: ");
        int divisor = scanner.nextInt();

        try {
            int result = dividend / divisor;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Ошибка! Деление на ноль.");
        }
    }
}
}