import java.util.Scanner;
public class leapyear {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a year");
        int n=in.nextInt();
        if(n%4==0 && n%100==0 && n%400==0)
        System.out.println("Leap Year");
        else
        System.out.println("Not a Leap Year");
    }
}
