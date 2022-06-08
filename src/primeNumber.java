import java.util.*;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter the number to be checked:");
        int num= sc.nextInt();
        int count=0;
        for(int i=2; i<(num/2)+1;i++)
        {
            if(num%i==0)
                count++;
                
        }
        if(count==0)
        System.out.println("Prime number!!!!!");
        else
        System.out.println("Not a Prime Number!!!!!!");
        sc.close();
    }
}
