import java.util.*;
public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter the number whose factors are to be found :");
        int num = sc.nextInt();
        System.out.println("The factors are: ");
        for(int i=2; i<(num/2)+1;i++)
        {
            if(num%i==0)
            System.out.println(i);
            else 
            count++;
        }
        System.out.println(num);
        if(count==(num/2)-1)
        System.out.println(num+" is a prime number!!!!");
        sc.close();
    }
}
