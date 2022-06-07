import java.util.*;
public class zeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,d;
        n=m=d=0;
        String a = new String();
        System.out.println("Enter the 0's and 1's :");
        a=sc.nextLine();
        char c='\0';
        for(int i=0;i<a.length();i++)
        {
            c=a.charAt(i);
            if(c=='0')
            n++;
            else
            m++;
            if(n==m)
            d++;
        }
        System.out.println(d);
        sc.close();
    }
}
