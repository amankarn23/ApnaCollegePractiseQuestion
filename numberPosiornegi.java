import java.util.Scanner;
public class numberPosiornegi {
    public static void main (String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        if(n>=0)
        System.out.println("Positive");
        else if(n<=0)
        System.out.println("Negative");
        else
        System.out.println("Wrong Input");
    }
}
