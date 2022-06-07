import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a =new ArrayList<>();
        System.out.println("Enter min size of list:");
        int n= sc.nextInt();
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        System.out.println("List is: "+a);
        a.add(52);
        System.out.println("List after adding new element is: "+a);
        System.out.println(a.get(3));
        a.remove(3);
        System.out.println(a);
        System.out.println(a.contains(2));
        for (Integer b : a) {
            System.out.println("elements :"+b);            
        }
        sc.close();
    }
}
