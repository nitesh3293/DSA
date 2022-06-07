import java.util.*;

public class arrayGame {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int c=0;
        System.out.println("Enter the length of array:");
        int n= sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter the target sum to check:");
        int t=sc.nextInt();
        System.out.println("The possible combination of elements are: ");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(t-a[j]==a[i])
                    {
                        System.out.println(a[i]+","+a[j]);
                        c++;
                    }
            }
        }
        System.out.println("Total combination are: "+c);
        sc.close();
    }
}
