import java.util.*;
public class squareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose square root to be found:");
        int num =sc.nextInt();
        int count =0;
        for(int i=2;i<num/2;++i)
        {
            if(num==i*i)
            {
            System.out.println("Sqaure Root is : "+i);
            count++;
            }
        }
        if(count==0)
        System.out.println("Not a Perfect Sqaure!!!");
        sc.close();
    }
}
