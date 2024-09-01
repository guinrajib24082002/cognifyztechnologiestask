// public class palindromechecker {

    // public static boolean checkPalindrome(String str){
    //     for(int i=0;i<str.length()/2;i++){
    //         int n=str.length();
    //         if(str.charAt(i)!=str.charAt(n-1-i)){
    //             return false;
                
    //         }


    //     }
    //     return true;
    // }
//     public static void main(String[] args) {
//         String str="palindrome";
//         System.out.println(checkPalindrome(str));

        
//     }
    
// }


import java.util.Scanner;

public class palindromechecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word or phrase
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        // Clean the input by removing spaces and punctuation, and converting to lowercase
        String cleanedInput = cleanString(input);

        // Check if the cleaned string is a palindrome
        if (isPalindrome(cleanedInput)) {
            System.out.println("The given word/phrase is a palindrome.");
        } else {
            System.out.println("The given word/phrase is not a palindrome.");
        }
    }

    // Method to clean the input string by removing spaces and punctuation, and converting to lowercase
    public static String cleanString(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
       

        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}

