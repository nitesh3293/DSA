//import java.lang.*;
import java.util.Scanner;
public class report_card {
    public static void main(String[] args) {
        int marks, sum = 0;
        double average;
        int students;
        char name;
        try (Scanner rc = new Scanner(System.in)) {
            System.out.println("Enter the required details");
            System.out.println("Enter the no. of students:");
            students = rc.nextInt();
            for(int i=1;i<=students;i++)
            {
                System.out.println("\nEnter the details of "+i+" roll no.:");
                /*System.out.println("Enter the Roll Number:");
                rollNo = rc.nextInt();*/
                System.out.println("Enter the Name of the student:");
                name =rc.next().charAt(0);
                System.out.println("Enter the marks of 5 subjects:");
                for(int j=0; j<5; j++)
                {
                    marks= rc.nextInt();
                    sum = sum + marks;
                }
                System.out.print("\n"+sum);
                average = sum/5;
                System.out.print("\n"+average);
                System.out.print("\n"+name);
                sum=0;
            }
        }
    }
}
