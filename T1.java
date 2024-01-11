
//square root using static variables
import java.util.Scanner;

public class T1 {

static int disc;
     static int a,b,c;
     static int sq(int a,int b,int c)
     {
         disc=b*b-4*a*c;
         return disc;
     }
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();           
            sq(a, b, c);
            System.out.println(disc);
    }
    
}
