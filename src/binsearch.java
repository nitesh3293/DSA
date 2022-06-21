import java.util.*;
public class binsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int[] A= new int[size];
        System.out.println("Enter the elements in sorted increasing order in the array: ");
        for(int i=0;i<size;i++)
            A[i]=sc.nextInt();
        System.out.println("Enter the element to be found: ");
        int element =sc.nextInt();    
        int res= binarySearch(A, element);
        System.out.println("The index of element is: "+res);
        sc.close();
    }
    public static int binarySearch (int[] A, int element)
    {
        int n=A.length;
        int low=0;
        int high = n-1;
        while(low<=high)
        {
            int mid =low +  (high-low)/2;
            if(A[mid]<element)
                low=mid+1;
            else if(A[mid]>element)
                high=mid-1;
            else
                return mid;
        }
        return -1;
    }
}
