import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter principle amount:");
        int p= sc.nextInt();
        System.out.println("Enter the time period:");
        int t= sc.nextInt();
        System.out.println("Enter the rate of interest:");
        Double r= sc.nextDouble();
        Double s=(p*r*t)/100;
        System.out.println("The Simple Interest is: "+s);
        Double a =s+p;
        System.out.println("The total amount after interest is: "+a);
        sc.close();
    }
}
