import java.util.Scanner;

public class resum {
    public static void main(String[] args) {
        int n,r;
        System.out.println("Enter the number upto which no.s are to be added:");
        try (Scanner sc = new Scanner(System.in)) {
            n=sc.nextInt();
        }
        r= sum(n);
        System.out.println("The sum is: "+r);
    }
    
    public static int sum(int e)
    {
        if(e==0)
        return 0;
        else
        return (e+sum(e-1));
    }
}
