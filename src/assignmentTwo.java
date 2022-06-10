import java.util.Scanner;

public class assignmentTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string which contains 'x','o','.':");
        String a= sc.next();
        int b= solve(a);
        System.out.println("Length is :"+b);
        sc.close();
    }
    public static int solve (String D)
    {
        char c='\0';
        char f='\0';
        int k =0;
        int y=0;
        int m=0;
        int l=0;
        for(int i=0; i<D.length();i++)
        {
            c=D.charAt(i);
            if(c=='x')
            {
                for(int j=i+1;j<D.length();j++)
                    {
                        f=D.charAt(j);
                        if(f=='o')
                        k=j-i;
                        if(l==0||l>k)
                        l=k;
                       //i=j-1;
                    }
            }
            else if(c=='o')
            {
                for(int j=i+1;j<D.length();j++)
                    {
                        f=D.charAt(j);
                        if(f=='x')
                        y=j-i;
                        if(m==0||m>y)
                        m=y;
                        //i=j-1;
                    }
            }
            else 
                continue;
        }
        if(l<m)
        return l;
        else if(l==0 && m==0)
        return -1;
        else
        return m;
        }    
}
int Solution::solve(string A) {
    int n = A.size();
    int prex[n], sufx[n];
    for(int i = 0; i < n; i++){
        if(A[i] == 'x'){
            prex[i] = i;
        }
        else{
            if(i == 0){
                prex[i] = -1;
            }
            else{
              prex[i] = prex[i-1];
            }
        }
    }
    for(int i = n-1; i >= 0; i--){
        if(A[i] == 'x'){
            sufx[i] = i;
        }
        else{
            if(i == n-1){
                sufx[i] = -1;
            }
            else{
                sufx[i] = sufx[i+1];
            }
        }
    }
    int ans = 0;
    for(int i = 0; i < n; i++){
        if(A[i] == 'o'){
            if(prex[i] != -1)
                ans = min(ans, i - prex[i]);
            if(sufx[i] != -1)
                ans = min(ans, sufx[i] - i);
        }
    }
    if(ans == 0){
        return -1;
    }
    return ans;
}