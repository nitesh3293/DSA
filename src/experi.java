import java.util.Scanner;

public class experi {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of array:");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        //System.out.println("Enter the value of target:");
        //b=sc.nextInt();
        print(a);
        sc.close();
    }
    public static void print( int[] x)
    {
        int c=0;
        for(int i=0;i<x.length;i++)
        {
            for(int j=i+1;j<x.length-1;j++)
            {
                if((x[i]==x[j]))
                c++;
            }
        }
        if(c>=1)
        System.out.println("Duplicate detected!!!");
        else
        System.out.println("NO DUPLICATES!!!!");
    }
}
