public class sqaureRoot {
    public int solve(int A) {
        if (A == 0)
        return 0;
        int left = 1, right = A;
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(mid==A/mid)
            return mid;
            else if(mid>A/mid)
            right= mid-1;
            else 
            left =mid+1; 
        }
        return -1;
    }
}
