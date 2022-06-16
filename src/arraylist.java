import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a =new ArrayList<>();
        System.out.println("Enter min size of list:");
        int n= sc.nextInt();
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        //System.out.println("List is: "+a);
        //a.add(52);
        //System.out.println("List after adding new element is: "+a);
        //System.out.println(a.get(3));
        //a.remove(3);
        //System.out.println(a);
        //System.out.println(a.contains(2));
        //for (Integer b : a) {
        //    System.out.println("elements :"+b);            
        //}
        int res = solve(a);
        System.out.println(res);
        sc.close();
    }
    public static int solve(ArrayList<Integer> b)
    {
        int count=0;
        int c=0;
        int d=0;
        for(int i=1;i<b.size();i++)
        {
            d=b.get(i-1);
            c=b.get(i);
            if((c+d)%2!=0 && ((d%2!=0 && c%2==0)||(d%2==0 && c%2!=0)))
            {
                count++;
                i++;
            }
        }
        return count;
    }
}
