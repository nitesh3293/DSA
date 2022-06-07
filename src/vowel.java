import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        String s=new String();
        String g = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        s=sc.nextLine();
        g=vow(s);
        System.out.println("Vowels are:"+g);
        sc.close();;
    }
    public static String vow(String a)
    {
        String str="";
        char c='\0';
        for(int i=0;i<a.length();i++)
        {
            c=a.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            str+=c;
        }
        return str;
    }
}
