import java.util.Scanner;

public class aFunction {
    public static void main(String[] args) {
        int a,b,r;
        char c;
        try (Scanner ro = new Scanner(System.in)) {
            System.out.println("Enter the 1st no.:");
            a =ro.nextInt();
            System.out.println("Enter the 2nd no.:");
            b = ro.nextInt();
            System.out.println("Enter the operation +,-,*,/,%");
            c = ro.next().charAt(0);
        }
        switch(c)
        {
            case '+':
            r=sum(a,b);
            System.out.println(r);
            break;

            case '-':
            r=substract(a,b);
            System.out.println(r);
            break;

            case '*':
            r=multiply(a,b);
            System.out.println(r);
            break;

            case '/':
            r=divide(a,b);
            System.out.println(r);
            break;

            case '%':
            r=remainder(a,b);
            System.out.println(r);
            break;

            default:
            System.out.println("Wrong selection!!!!\n");
        }
        System.out.println("Thank you!\n");
    }
    public static int sum(int e, int f)
    {
        int g= e+f;
        return g;
    }
    public static int substract(int e, int f)
    {
        int g=e-f;
        return g;
    }
    public static int multiply( int e, int f)
    {
        int g=e*f;
        return g;
    }

     public static int divide(int e, int f)
    {
        int g=e/f;
        return g;
    }

     public static int remainder(int e, int f)
    {
        int g=e%f;
        return g;
    }
}
