import java.util.*;
public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factors are to be found :");
        int num = sc.nextInt();
        System.out.println("The factors are: ");
        for(int i=2; i<(num/2)+1;++i)
        {
            if(num%i==0)
            System.out.println(i);
        }
        System.out.println(num);
        sc.close();
    }
}
