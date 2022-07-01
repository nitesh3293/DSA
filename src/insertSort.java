import java.util.*;

public class insertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size= sc.nextInt();
        int[] arr =new int[size];
        int[] sArr =new int[size];
        System.out.println("Enter the array to be sorted: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        sArr=swap(arr);
        System.out.println("Sorted array is: "+sArr);
        sc.close();
    }
    public static int[] swap(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                int temp=arr[i];
                if(arr[j]>temp)
                {
                    arr[j+1]=arr[j];
                }
                arr[j]=temp;
            }
        }
        return arr;
    }
}
