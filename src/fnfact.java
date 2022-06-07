import java.util.Scanner;

public class fnfact {
    public static void main(String[] args) {
        int a, r;
        System.out.println("Enetr the no.to find factorial:");
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
        }
        r=fact(a);
        System.out.print("The Factorial is: "+ r);
    }

    public static int fact(int e)
    {
        if(e==0)
        return 1;
        else
        return (e*fact(e-1));
    }
}
