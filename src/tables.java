import java.util.*;
public class tables {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. whose table is to be written: ");
        int num = sc.nextInt();
        System.out.println("The table is:");
        for( int i=1; i<=10;++i)
        {
            System.out.println(num + " * "+i+" = "+num*i);
        }
        sc.close();
    }
}
