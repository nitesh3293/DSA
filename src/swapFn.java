import java.util.*;
public class swapFn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two numbers to be swapped: ");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        System.out.println("Numbers before swap are :"+firstNum +" & "+secondNum);
        swp(firstNum,secondNum);
        sc.close();
    }
    public static void swp(int a, int b)
    {
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Numbers after swap are "+a+" & "+b);
    }
}
