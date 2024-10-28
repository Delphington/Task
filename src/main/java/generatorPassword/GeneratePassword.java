package generatorPassword;

import lombok.experimental.UtilityClass;

import java.io.PrintStream;
import java.security.SecureRandom;
import java.util.Scanner;

@UtilityClass
public class GeneratePassword {

    private static Scanner scanner;
    private static PrintStream printStream = System.out;
    private static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        printStream.println("Введите длину пароля (от 8 до 12 символов): ");
        int length = scanner.nextInt();

        if (length < 8 || length > 12) {
            printStream.println("Длина пароля должна быть от 8 до 12 символов.");
            return;
        }

        String password = generatePassword(length);
        printStream.println("Сгенерированный пароль: " + password);
    }

    private static String generatePassword(int length) {
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            password.append(ConstantsPassword.ALL_CHARACTERS.charAt(random.nextInt(ConstantsPassword.ALL_CHARACTERS.length())));
        }
        return shuffleString(password.toString());
    }

    private static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        for (int i = characters.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
        }
        return new String(characters);
    }
}
