import java.util.*;

public class qu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> n = new LinkedList<>();
        System.out.println("Enter min size of Queue:");
        int a = sc.nextInt();
        System.out.println("Enter the elements of Queue: ");
        for(int i=0;i<a;i++)
        n.offer(sc.nextInt());       // to add elemebts in Queue
        System.out.println("Next element to exit:"+n.peek());
        System.out.println("Element leaving the Queue: "+n.poll());
        System.out.println("Remaining elements: "+n);
        sc.close();
    }
}
