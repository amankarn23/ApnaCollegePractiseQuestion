import java.util.Scanner;
public class costofitems {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter cost of three items");
        float a=in.nextFloat();
        float b=in.nextFloat();
        float c=in.nextFloat();
        float d= a+b+c;
        System.out.println("Total cost:"+d);
        float gst= (d*18)/100 ;
        float cost=d+gst;
        System.out.println("Total cost including gst="+cost);
    }  
}
