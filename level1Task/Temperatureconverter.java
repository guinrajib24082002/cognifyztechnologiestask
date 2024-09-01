import java.util.*;
public class Temperatureconverter{ 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter The tempratture:");
        int farenhite=sc.nextInt();
        int celcius=5*(farenhite-32)/9;
        System.out.println("temperature in celcius is:"+celcius);

        
    }
}