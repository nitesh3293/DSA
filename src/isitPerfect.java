import java.util.*;
public class isitPerfect {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int[] b = new int[a];
        for(int i=0;i<a;i++)
        b[i]=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int sum=0;
            for(int j=1;j<=b[i]/2;j++)
            {
                if(b[i]%j==0)
                    sum+=j;
            }
            //System.out.print(sum);
            if(b[i]==sum)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        sc.close();
    }
}

