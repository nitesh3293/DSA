//import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {
        int i,j;
        i=j=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5-i;j++)
            System.out.print("  ");
            for(j=1;j<=i;j++)
            System.out.print(" *");
            for(j=1;j<=i-1;j++)
            System.out.print(" *");
        System.out.println();
        }
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            System.out.print("  ");
            for(j=1;j<=5;j++)
            if(j>i)
            System.out.print(" *");
            for(j=1;j<5-i;j++)
            System.out.print(" *");
        System.out.println();
        }
    }
    
}
