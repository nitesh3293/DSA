import java.util.Scanner;

public class na {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the value of a:");
    int a=sc.nextInt();
    System.out.println("Enter the value of b:");
    int b= sc.nextInt();
    System.out.println("Enter the value of m:");
    int m = sc.nextInt();
    int r =solve(a,b,m);
    System.out.println("Result is:"+r);
    sc.close();
    }

    public static int solve( int p, int q, int s)
    {
        if(q==0)
        return 1;
        else if(q%2==0)
        return solve(p*p%s,q/2,s);
        else
        return (p*solve(p*p%s,(q-1)/2,s)%s);
    }
}
