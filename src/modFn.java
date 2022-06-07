import java.util.Scanner;

public class modFn {
    public static void main(String[] args) {
        int a,b,m,s;
        s=0;
        System.out.println("Enter the 1st no.:");
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        System.out.println("Enter the 2nd no.:");
        b=sc.nextInt();
        System.out.println("Enter the no.with whom you need to check:");
        m=sc.nextInt();
        if(a>b)
        {
            s=a-b;
            if((s%m)==0)
                System.out.println(a+" % "+m+" = "+b+" % "+m);
            else
                System.out.println("Not applicable");
        }
        else
        {
            s=b-a; 
            if((s%m)==0)
                System.out.println(a+" % "+m+" = "+b+" % "+m);
            else
                System.out.println("Not applicable");
        }
            sc.close();
    }
}
