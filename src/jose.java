import java.util.Scanner;

public class jose {
    public static void main(String[] args) {
        int n,k,s;
        s=1;
        System.out.println("Enter the total no.of person in circle:");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the value of k:");
        k=sc.nextInt();
        s=josua(n,k);
        s=s+1;
        System.out.println("Last man standing is: "+s);
        sc.close();
    }
    public static int josua(int a, int b)
    {
        if(a==1)
        return 0;
        else
        return (josua(a-1,b)+b)%a;
    }
    
}
