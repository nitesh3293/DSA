import java.util.*;
public class intersect{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> a= new ArrayList<>();
        ArrayList<Integer> b= new ArrayList<>();
        System.out.println("Enter the size of first arrayList :");
        int m = sc.nextInt();
        System.out.println("Enter the size of second arrayList :");
        int n = sc.nextInt();
        System.out.println("Enter the elements of first arrayList :");
        for(int i=0;i<m;i++)
        {
            a.add(sc.nextInt());
        }
        System.out.println("Enter the elements of second arrayList :");
        for(int i=0;i<n;i++)
        {
            b.add(sc.nextInt());
        }
        ArrayList<Integer> c= solve(a,b);
        System.out.println("The common elements are :"+c);
        sc.close();
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        Set<Integer> x=new HashSet<Integer>();
        Set<Integer> y=new HashSet<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (Integer ele : a) {
            x.add(ele);
        }
        for (Integer ele : b) {
            boolean l=x.add(ele);
            if(l== false)
            y.add(ele);
        }
        for (Integer ele : y) {
            ans.add(ele);
        }
        return ans;
    }
}