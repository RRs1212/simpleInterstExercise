
import java.util.Scanner;
interface simpleInterstCalc {
    float calculatesi();
    void setPrinciple(float principle);
    void setTime(float time);
    void setRate(float rate);

}
public class Main {
    public static void main(String[] args) {
        float principle=0;
        float time=0;
        float Rate=0;

        Scanner in=new Scanner(System.in);
        System.out.println("<<<<<<welcome to simple interst calculator>>>>>>");
        try{
            System.out.println("Enter Principle Ammount:");
            principle =in.nextFloat();
            if(principle<0)throw new IllegalArgumentException("negative number not allowed");
            System.out.println("Enter Time in months");
             time=in.nextInt();
            if(time<0)throw new IllegalArgumentException("negative number not allowed");


            System.out.println("Enter Rate");
             Rate=in.nextFloat();
            if(Rate<0)throw new IllegalArgumentException("negative number not allowed");

        }
        catch (IllegalArgumentException e){
//            if(principle<0){
//                System.out.println("principle can't be negative");
//
//            }
//            if(time<0){
//                System.out.println("Time can't be negative ");
//
//            }
//            if(Rate<0){
//                System.out.println("Rate can't be negative ");
//
//            }
            System.out.println("Arguments can't be negative");

        }
        finally {
            if(Rate<0||principle<0||time<0) System.out.println("not able to calculate SIMPLE INTERST");
            else{

                simpleInterstCalc calc=new SimpleInterstCalculator(principle,time/12,Rate);
                System.out.println("Simple Interst:");
                System.out.println(calc.calculatesi());

            }

        }











    }
}