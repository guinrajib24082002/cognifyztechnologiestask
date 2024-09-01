import java .util.*;

public class studentGradecalculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of student grades:");
        int grade=sc.nextInt();

        double grades[]=new double[grade];
        double sum=0;
        //input each grade
        for(int i=0;i<grade;i++){
            System.out.println("enter grades:"+ (i + 1) + ": ");
            grades[i]=sc.nextDouble();
            sum+=grades[i];
        }

        //calculate the average
        double average=sum/grade;
        System.out.printf("The average grade is: %.2f", average);
        sc.close();

        
    }
    
}
