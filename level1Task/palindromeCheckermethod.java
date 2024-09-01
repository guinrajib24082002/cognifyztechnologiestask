import java.util.*;
public class palindromeCheckermethod {

    public static void main(String[] args) {
        System.out.println("Enter your word/Phrase for Palindrome Check:");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        //for removing clean string
        String cleanedInput = cleanstring(input);

        if (isPalindrome(cleanedInput)) {
            System.out.println("The given word/phrase is a palindrome.");
        } else {
            System.out.println("The given word/phrase is not a palindrome.");
        }

        
        
    }

    //method for cleaning string
    public static String cleanstring(String str){
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    //method for checkpalindrome or not
    public static boolean isPalindrome(String  str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }

        }
        return true;
    }
    
}
