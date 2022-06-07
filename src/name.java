import java.util.Scanner;
public class name {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter your initialName:");
            String initialName = in.next();
            System.out.println("Enter your lastName:");
            String lastName = in.next();
            System.out.println(" Your name is "+initialName +" " + lastName);
        }

    }
    
}
