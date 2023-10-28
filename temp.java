import java.util.Scanner;
public class temp {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        double temp =103.5;
        System.out.println("Enter the temprature");
        int n =in.nextInt();
        if(n>=100 && n<=temp)
        System.out.println(" You have Fever");
        else
        System.out.println("You dont have fever");
    }
}
