public class dia {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(i<5)
                {
                    if(j>5-i && j<5+i)
                    System.out.print(" *");
                    else 
                    System.out.print("  ");
                }
            
            else
            {
                if(j>i-5 && j<15-i)
                System.out.print(" *");
                else 
                System.out.print("  ");
            }
            }
            System.out.println();
        }
    }
}
