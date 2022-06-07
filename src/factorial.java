import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n, factorial;
        factorial=1;
        System.out.println("Enter the no.:");
        try (Scanner f = new Scanner(System.in)) {
            n = f.nextInt();
        }
        while(n>1)
        {
            factorial = factorial*n;
            n--;
        }
        System.out.println("Factorial is: "+factorial);
    }
}
