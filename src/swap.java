import java.util.*;

public class swap{
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the 1st no. to be swapped: ");
            int firstNo = sc.nextInt();
             System.out.println("Enter the 2nd no. to be swapped: ");
            int secondNo = sc.nextInt();
            firstNo=firstNo^secondNo;
            secondNo=firstNo^secondNo;
            firstNo=firstNo^secondNo;
            System.out.println("The swapped values are: "+firstNo+" "+secondNo);
            sc.close();
        }
}