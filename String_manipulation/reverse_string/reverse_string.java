package String_manipulation.reverse_string;
import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
        Scanner akil=new Scanner(System.in);
        System.out.print("enter:");
        String str=akil.next();
        int n=str.length();
        String rev="";
        for(int i=n-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.print(rev);
    }
}
