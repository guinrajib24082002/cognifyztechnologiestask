import java.util.*;
public class tempConverter {
    public static void main(String[] args) {

        System.out.println("Enter The Temperature:");
        Scanner sc=new Scanner(System.in);
        double Temperature=sc.nextDouble();
        System.out.println("enter the Temperature unit (C for Celcius and F for Fahrenhite):");
        char unit=sc.next().toUpperCase().charAt(0);

        double convertedtemperature;
        String convertedUnit;

        if(unit=='C'){
            convertedtemperature=(Temperature*9/5)+32;
            convertedUnit="Fahrenhite";
        }else if(unit=='F'){
            convertedtemperature=(Temperature-32)+5/9;
            convertedUnit="Celcius";

        }else{
            System.out.println("invalid unit of mesurement .please enter correct unit");
            return;
        }
        System.out.printf("the converted temperature is:%.2f %s%n",convertedtemperature,convertedUnit);
    
    }
    
}
