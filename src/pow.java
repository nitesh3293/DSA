import java.util.Scanner;

public class pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double r=0.0;
        System.out.println("Enter the no.:");
        Double a =sc.nextDouble();
        System.out.println("Enter power of no.:");
        Double p= sc.nextDouble();;
        r=power(a,p);
        System.out.println("Result is : "+r);
        sc.close();
    }

    public static Double power(Double n,Double b)
    {
        if(b==0)
        return 1.0;
        else
        return n*power(n,b-1);
    }
}
