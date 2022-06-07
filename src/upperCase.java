import java.util.*;

public class upperCase {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = new String();
        System.out.println("Enter the string:");
        s=sc.nextLine();
        s = s.toUpperCase();
        System.out.println("The Upper Case: "+s);
        s=s.toLowerCase();
        System.out.println("The Lower Case: "+s);
        sc.close();
    }
}
