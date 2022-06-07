import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        double a,b,r;
        char c;
        a=b=r=0;
        System.out.println("Select the operation to perform: +,-,/*./");
        try (Scanner in = new Scanner(System.in)) {
            c=in.next().charAt(0);
            System.out.println("Enter 1st value:");
            a=in.nextDouble();
            System.out.println("Enter 2nd value:");
            b=in.nextDouble();
        }
        if(c=='+')
        r=a+b;
        else if(c=='-')
        r=a-b;
        else if(c=='*')
        r=a*b;
        else if(c=='/')
        r=a/b;
        else
        System.out.println("Wrong selection\n");

        System.out.print(r);
    }
}
