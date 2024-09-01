import java.util.*;
import java.util.Random;


//import javax.xml.transform.stream.StreamSource;

public class passwordgenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        System.out.println("enter the password length");
        int lenofPassword=sc.nextInt();

        //ask the user if the password should include uppercase,lowercase,special character,punctuation ,numbers
        System.out.print("Include numbers? (yes/no): ");
        boolean includeNumbers = sc.next().equalsIgnoreCase("yes");

        System.out.print("Include lowercase? (yes/no): ");
        boolean includeLowercase = sc.next().equalsIgnoreCase("yes");

        System.out.print("Include uppercase? (yes/no): ");
        boolean includeUppercase = sc.next().equalsIgnoreCase("yes");

        System.out.print("Include specialchracters? (yes/no): ");
        boolean includespecialcharacter = sc.next().equalsIgnoreCase("yes");

        String numbers = "0123456789";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacters = "!@#$%^&*()_+-=[]{}|;:'\",.<>?/~`";

        StringBuilder sb=new StringBuilder();

        if (includeNumbers) {
            sb.append(numbers);
        }
        if (includeLowercase) {
            sb.append(lowercaseLetters);
        }
        if (includeUppercase) {
            sb.append(uppercaseLetters);
        }
        if (includespecialcharacter) {
            sb.append(specialCharacters);
        }

        //check for length
        if(sb.length()==0){
            System.out.println("please select any valid special charcaters");
            return;
        }

        //for creating random password generator
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < lenofPassword; i++) {
            int randomIndex = random.nextInt(sb.length());
            password.append(sb.charAt(randomIndex));
        }

        //display the generated password
        System.out.println("generated password is:"+password);
        



    }
    
}
