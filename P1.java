import java.util.*;
public class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int o=n;
        int s=0;
        int r=0;
        while(o>0)
        {
             r=o%10;
            s+=s*10+r;
            o/=10;
        }
        o=n;
        if(s==o){
            System.out.println("palindrome");
        }
        else System.out.println("not");
        
    }
}