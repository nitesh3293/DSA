import java.util.*;
public class lastThreedigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.:");
        int a=sc.nextInt();
        System.out.println("Enter the pwer: ");
        int b=sc.nextInt();
        int c=(dig(a,b));
        System.out.println("The Last three digits are: "+c);
        sc.close();
    }
    public static int dig(int x, int y)
    {
        if(y==0)
            return 1;
        else if(y%2==0)
            return dig(x*x%1000,y/2);
        else
            return (x*dig(x*x%1000,(y-1)/2)%1000);
    }
}
