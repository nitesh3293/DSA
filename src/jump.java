import java.util.*;
public class jump {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the list :");
        int size= sc.nextInt();
        System.out.println("Enter the elements of the list: ");
        ArrayList<Integer> A= new ArrayList<>();
        for(int i=0;i<size;i++)
        A.add(sc.nextInt());
        int res= solve(A,size);
        System.out.println("Number of jumps :"+res);
        sc.close();
    }

    public static int solve(ArrayList<Integer> A, int size) 
    {
        int maxV= Integer.MAX_VALUE-size;
        int dp[] = new int[size];
        dp[size-1]=0;
        if(A.get(0)==0)
        return -1;
        for(int i=size-2; i>=0;i--){
            if(A.get(i)==0)
                dp[i] = maxV;
            else if(A.get(i)+i>=size-1){
                dp[i]=1;
            }
            else{
                int maxjump= A.get(i), ans=maxV;
                for(int j=maxjump; j>0;j-- )
                {
                    ans=Math.min(dp[j+i],ans);
                }
                dp[i] = ans+1;
            }
        }
        return dp[0];
    }
}