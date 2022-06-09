import java.util.*;

public class bitOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        int fnum= sc.nextInt();
        int snum =sc.nextInt();
        int res=0;
        System.out.println("Enter the operation i.e. &, ~,|,^");
        char c= sc.next().charAt(0);
        switch(c)
        {
            case '&':
            res = fnum & snum;
            break;

             case '~':
            res = ~fnum;
            break;

             case '^':
            res = fnum ^ snum;
            break;

             case '|':
            res = fnum | snum;
            break;

            default:
            System.out.println("Wrong selection!!!!\n");
        }
        System.out.println("Result is : "+res);
        sc.close();
    }
}