import java.util.Scanner;
public class insertion {
    public static void main(String[] args) {
        int i,j,n,k=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no.of elements in array:");
            n = sc.nextInt();
            int [] ar = new int [n];
            System.out.println("Enter the elements of array:");
            for(i=0;i<n;i++)
                ar[i]= sc.nextInt();
            for(i=1;i<n;i++)
            {
                k=ar[i];
                for(j=i-1;j>=0 && k<ar[j]; j--)
                    ar[j+1]=ar[j];
                ar[j+1]=k;
            }
            System.out.println("Sorted array is :");
            for(i=0;i<n;i++)
                System.out.println(ar[i]);
            sc.close();
        }
    }
}
