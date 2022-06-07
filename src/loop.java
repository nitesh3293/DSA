public class loop {
    public static void main(String[] args) {
        //int l = 0;
        for(int i=1; i<=5; i++)
        {
            int p=0;
           /* l=i;
            if (i>4)
            {
                l=8-i;
            }*/
            for(int j=1; j<=5-i;j++)
            {
                System.out.print(" ");
                //System.out.print(" *");
            }
            p=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(p++);
            }
            p=p-2;
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(p--);
            }
            System.out.println();
        }
        
    }
    
}
