import java.util.*;
public class subarraysumzero {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int ans;
        System.out.println("Enter the target sum: ");
        int target=sc.nextInt();
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        //ArrayList<Integer> a = new ArrayList<>();
        int[] a= new int[n];
        System.out.println(("Enter the elements of the array: "));
        /*for(int i=0; i<n;i++)
        {
            a.add(sc.nextInt());
        }*/
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        ans = solve(a,target);
        System.out.println(ans);
        sc.close();
    }
    public static int solve( int[] a, int target)
    {
        //int c=0;
        int res=0;
        int sum=0;
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>(); 
        map.put(0,1);
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            if(sum==target)
            res++;
            if(map.containsKey(sum-target))
            {
                res+=map.get(sum-target);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }
        return res;
    }
}
