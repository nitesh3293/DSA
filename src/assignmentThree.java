import java.util.*;
public class assignmentThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the square root(approx) : ");
        int n=sc.nextInt();
        int res= sqrt(n);
        System.out.println("Square root is : "+res);
        sc.close();
    }
public static int sqrt(int n)
{
    if (n == 0)
        return 0;
    int left = 1, right = n;
    while (true) {
        int mid = left + (right - left)/2;
        if (mid > n/mid) {
            right = mid - 1;
        } else {
            if (mid + 1 > n/(mid + 1))
                return mid;
            left = mid + 1;
        }
    }
}
}
