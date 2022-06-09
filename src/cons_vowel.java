import java.util.*;

public class cons_vowel {
    public static void main(String[] args) {
        String s= null;
        char ch='\0';
        Set<Character> vow = null;
        Set<Character> cons =null;
        Set<Character> sp = new HashSet<Character>();
        System.out.println("Enter the string:");
        Scanner sc =new Scanner(System.in);
        s =sc.nextLine();
        vow = new HashSet<Character>();
        cons = new HashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
            ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            vow.add(ch);
            else if(ch==' ')
            sp.add(ch);
            else
            cons.add(ch);
        }
        System.out.println("The separated vowels are: "+vow);
        System.out.println("The separated consonantsare: "+cons);
        sc.close();
    }
}
