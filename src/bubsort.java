import java.util.Scanner;

public class bubsort {
    public static void main(String[] args) {
        int i,k,j,n;
        k=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array:");
            n=sc.nextInt();
            int[] a= new int[n];
            System.out.println("Enter the array:");
            for(i=0;i<n;i++)
            {
                a[i]= sc.nextInt();
            }
            for(i=0;i<n-1;i++)
            {
                for(j=0;j<(n-i-1);j++)
                {
                    if(a[j]>a[j+1])
                    {
                        k=a[j];
                        a[j]=a[j+1];
                        a[j+1]=k;
                    }
                }
            }
            System.out.println("The sorted array is:");
            for(i=0;i<n;i++)
            {
                System.out.println(a[i]+" ");
            }
      sc.close();
        }
    }
}
