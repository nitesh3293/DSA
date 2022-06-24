import java.util.*;
public class armStrong {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=  new Scanner(System.in);
        int a=sc.nextInt();
        int c,b,d;
        for(int i=1;i<=a;i++)
        {
            double sum=0;
            b=i;
            while(b>0)
            {
                c=b%10;
                sum=sum+Math.pow(c,3);
                b=b/10;
            }
            d=(int)sum;        
            if(d==i)
            System.out.println(d);
        }
        sc.close();
    }
}
