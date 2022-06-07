import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        int n,c;
        c=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of array");
        n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the values:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {   
                if(a[i]==a[j])
                c++;
            }
        }
        if(c>=1)
        System.out.println("True");
        else
        System.out.println("False");
        sc.close();
    }
}
