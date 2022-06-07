import java.util.Scanner;

public class selecSort {
    public static void main(String[] args) {
        int i,j,n,k,m;
        m=k=0;
        System.out.println("Enter the no.of elements of array:");
        try (Scanner sc = new Scanner(System.in)) {
            n= sc.nextInt();
            int[] a= new int[n];
            System.out.println("Enter the elements to be sorted:");
            for(i=0;i<n;i++)
                a[i]= sc.nextInt();
            for(i=0;i<n-1;i++)
            {
                m=i;
                for(j=i+1;j<n;j++)
                {
                    if(a[m]>a[j])
                        m=j;
                }
                if(i!=m)
                {
                    k=a[i];
                    a[i]= a[m];
                    a[m]=k;
                }
            }
            System.out.println("Sorted array is:");
            for(i=0;i<n;i++)
                System.out.println(a[i]);
            sc.close();
        }
    }
}
