package CurrencyMoney;

import java.io.PrintStream;
import java.util.Scanner;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CurrencyExchange {

    private static PrintStream printStream = System.out;
    private static Scanner scanner;

    private static void printInfo(Double value) {
        printStream.printf("Сумма в (EUR): %.2f%n", value * ConstansMoney.USD_TO_EUR);
        printStream.printf("Сумма в (GBP): %.2f%n", value * ConstansMoney.USD_TO_GBP);
        printStream.printf("Сумма в (JPY): %.2f%n", value * ConstansMoney.USD_TO_JPY);
        printStream.printf("Сумма в (INR): %.2f%n", value * ConstansMoney.USD_TO_INR);
        printStream.printf("Сумма в (RUB): %.2f%n", value * ConstansMoney.USD_TO_RUB);
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        printStream.print("Введите сумму в (USD): ");
        printInfo(scanner.nextDouble());
        scanner.close();
    }
}
