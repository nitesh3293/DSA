import java.util.*;
public class Bsort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int[] a= new int [n];
        System.out.println("Enter the elements of the array to be sorted: ");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();

        System.out.println("Array before sorting :");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        System.out.println(" ");

        for(int i=0;i<n-1;i++)
        {
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j+1] < a[j])
                {
                    swapped = true;
                    swap(a, j+1 , j);
                }
            }
            if(!swapped)
            break;
        }

        System.out.println("Array after sorting is: ");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        System.out.println(" ");
        sc.close();
    }

    public static void swap( int[] nums, int big, int small)
    {
        int temp=0;
        temp = nums[big];
        nums[big] = nums[small];
        nums[small] = temp;
    }
}
