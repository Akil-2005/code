import java.util.*;
/*public class palindrome {
    public static void main(String[] args) {
        Scanner akil=new Scanner(System.in);
        String n=akil.next();

        String rev=new StringBuilder(n).reverse().toString();
        if(rev.equals(n)){
            System.out.print("palindrome");
        }
        else {
            System.out.print("not palindrome");
        }
        }
}
// another method

class palindrome{
    public static void main(String[] args) {
        Scanner akil=new Scanner(System.in);
        String n=akil.next();
        boolean is_palindrome=true;
        int left=0;
        int right=n.length()-1;
        while(left<right){
            if(n.charAt(left)!=n.charAt(right)){
                is_palindrome=false;
                break;
            }
            left++;
            right--;
        }
        if (is_palindrome){
            System.out.print("palindrome");
        }
        else{
            System.out.print("not palinfrome");
        }
    }
}*/

// another method
public class palindrome {

    public static void main(String[] args) {
        Scanner akil=new Scanner(System.in);
        String n=akil.next();
        String rev="";
        for(int i=0;i<n.length();i++){
            rev=n.charAt(i)+rev;
        }
        if(n.equals(rev)) System.out.print("palindrome");
        else System.out.print("not palindrome");
    }
}

