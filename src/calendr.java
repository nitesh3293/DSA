import java.util.*;
public class calendr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the year :");
        int year = sc.nextInt();
        System.out.println(" Enter the number of month :");
        int month = sc.nextInt();
        int days=0;
        //System.out.println("Enter the date :");
        //int date = sc.nextInt();
        String week[] ={"Sun","Mon","Tue","Wed","Thur","Fri","Sat"};
        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.print("The month is: "+months[month-1]);
        System.out.println();
        if(month<=6 && month%2==0 && month!=2 || month>7 && month%2==1)
        {
            days =30;
            for(int i=0;i<week.length;i++)
            {
                System.out.print(week[i]+" ");
            }
            System.out.println();
            for(int i=1;i<=days;i++)
            {
                 if(i%7==0)
                    {
                        if(i<10)
                        System.out.print("  0"+i);
                        else
                        System.out.print("  "+i);
                        System.out.println();
                    }
                    else
                    {
                        if(i<10)
                        System.out.print("  0"+i);
                        else
                        System.out.print("  "+i);
                    }
            }
        }
        else if(month ==2 && (year%4==0 && year%100!=0||year%100==0))
        {
            days=29;
            for(int i=0;i<week.length;i++)
            {
                System.out.print(week[i]+" ");
            }
            System.out.println();
            for(int i=1;i<=days;i++)
            {
                 if(i%7==0)
                    {
                        if(i<10)
                        System.out.print("  0"+i);
                        else
                        System.out.print("  "+i);
                        System.out.println();
                    }
                    else
                    {
                        if(i<10)
                        System.out.print("  0"+i);
                        else
                        System.out.print("  "+i);
                    }
            }
        }
        else if(month ==2)
        {
            days=28;
            for(int i=0;i<week.length;i++)
            {
                System.out.print(week[i]+" ");
            }
            System.out.println();
            for(int i=1;i<=days;i++)
            {
                 if(i%7==0)
                    {
                        if(i<10)
                        System.out.print("  0"+i);
                        else
                        System.out.print("  "+i);
                        System.out.println();
                    }
                    else
                    {
                        if(i<10)
                        System.out.print("  0"+i);
                        else
                        System.out.print("  "+i);
                    }
            }
        }
        else if(month>=7&& month%2==0 || month<6 && month%2!=0)
        {
            days =31;
            for(int i=0;i<week.length;i++)
            {
                System.out.print(week[i]+" ");
            }
            System.out.println();
            for(int i=1;i<=days;i++)
            {
                 if(i%7==0)
                    {
                        if(i<10)
                        System.out.print("  0"+i);
                        else
                        System.out.print("  "+i);
                        System.out.println();
                    }
                    else
                    {
                        if(i<10)
                        System.out.print("  0"+i);
                        else
                        System.out.print("  "+i);
                    }
            }
        }
        else
        System.out.println("Wrong Entry of Month!!!!!");
        sc.close();
    }
}
