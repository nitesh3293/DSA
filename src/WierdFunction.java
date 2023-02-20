import java.util.*;
public class WierdFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Array elements : ");
        for(int i = 0 ;i<n;i++)
        a[i] = sc.nextInt();

        System.out.println("**** Function Starts ****");

        int sum=0;
         
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((a[j]-a[i])>1)
                sum+=(a[j]-a[i]);
                else if((a[i]-a[j])>1)
                sum+=(a[i]-a[j]);
            }
        }
        
        /*for(int i=0; i<n;i++)
        {
            int sum1=0,sum2=0;
            sum1= (a[i])*(n-1-i);
            sum2=(a[i]*i);
            sum+= sum2 - sum1;
        }
        */
        System.out.println(" Result is : "+sum/2);
        sc.close();
    }
}
