import java.util.Scanner;

public class sumDiv {
    public static void main(String[] args) {
        int n,b,c;
        c=0;
        System.out.println("Enter the no.of elements in array:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the sum:");
        b = sc.nextInt();
        System.out.println("Enter the elements of array:");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((a[i]+a[j])%b==0)
                    c++;
            }
        }
        System.out.println("No.of such pair sum divisible by "+b+" : "+c);
        sc.close();
    }
}
