import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Get the desired length of the password from the user
        System.out.print("Enter the desired length of the password: ");
        int passwordLength = scanner.nextInt();

        // Ask the user if the password should include numbers
        System.out.print("Include numbers? (yes/no): ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("yes");

        // Ask the user if the password should include lowercase letters
        System.out.print("Include lowercase letters? (yes/no): ");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("yes");

        // Ask the user if the password should include uppercase letters
        System.out.print("Include uppercase letters? (yes/no): ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("yes");

        // Ask the user if the password should include special characters
        System.out.print("Include special characters? (yes/no): ");
        boolean includeSpecial = scanner.next().equalsIgnoreCase("yes");

        // Build the character pool based on the user's choices
        String numbers = "0123456789";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacters = "!@#$%^&*()_+-=[]{}|;:'\",.<>?/~`";

        StringBuilder characterPool = new StringBuilder();

        if (includeNumbers) {
            characterPool.append(numbers);
        }
        if (includeLowercase) {
            characterPool.append(lowercaseLetters);
        }
        if (includeUppercase) {
            characterPool.append(uppercaseLetters);
        }
        if (includeSpecial) {
            characterPool.append(specialCharacters);
        }

        // Check if the character pool is not empty
        if (characterPool.length() == 0) {
            System.out.println("You must select at least one type of character for the password.");
            return;
        }

        // Generate the password
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(randomIndex));
        }

        // Display the generated password
        System.out.println("Generated Password: " + password);

        // Close the scanner
        scanner.close();
    }
}

