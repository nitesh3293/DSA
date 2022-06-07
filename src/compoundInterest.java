import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        Double p=sc.nextDouble();
        System.out.println("Enter the time period:");
        Double t= sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        Double r= sc.nextDouble();
        Double c=compInt(p,r,t);
        System.out.println("THe Compond Interest is: "+c);
        Double a = p+c;
        System.out.println("The Amount after time period "+t+" is: "+a);
        sc.close();
    }
    public static Double compInt(Double j, Double k, Double l)
    {
        double i = j*(Math.pow((1+k/100),l))-j;
        return i;
    }
}
