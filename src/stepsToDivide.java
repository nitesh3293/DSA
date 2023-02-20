import java.util.*;
public class stepsToDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n =sc.nextInt();
        System.out.print("Enter the no.to divide n:");
        int b = sc.nextInt();
        int count =0;
        while(n>0)
        {
            n = n/b;
            if(n>0)
            count++;
        }
        System.out.print(count);
        sc.close();
    }
}
