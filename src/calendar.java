import java.util.*;
public class calendar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //System.out.println(" Enter the year :");
        //int year = sc.nextInt();
        System.out.println(" Enter the number of month :");
        int month = sc.nextInt();
        System.out.println("Enter the date :");
        int date = sc.nextInt();
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
        {
            for(int k=1;k<=date;++k)
                {
                    if(k%7==0)
                    {
                        if(k<10)
                        System.out.print(" 0"+k);
                        else
                        System.out.print(" "+k);
                        System.out.println();
                    }
                    else
                    {
                        if(k<10)
                        System.out.print(" 0"+k);
                        else
                        System.out.print(" "+k);
                    }
                }
        }
        else if(month==2)
        {
            for(int k=1;k<=date;++k)
                {
                    if(k%7==0)
                    {
                        if(k<10)
                        System.out.print(" 0"+k);
                        else
                        System.out.print(" "+k);
                        System.out.println();
                    }
                    else
                    {
                        if(k<10)
                        System.out.print(" 0"+k);
                        else
                        System.out.print(" "+k);
                    }
                }
        }
        else 
        {
            for(int k=1;k<=date;++k)
                {
                    if(k%7==0)
                    {
                        if(k<10)
                        System.out.print(" 0"+k);
                        else
                        System.out.print(" "+k);
                        System.out.println();
                    }
                    else
                    {
                        if(k<10)
                        System.out.print(" 0"+k);
                        else
                        System.out.print(" "+k);
                    }
                }
        }
        sc.close();
    }
}
