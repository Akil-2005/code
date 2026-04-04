package basic_math.sumofnumber;
import java.util.*;
public class sumofnumber {
    public static void main(String[] args) {
        Scanner akil=new Scanner((System.in));
        int n=akil.nextInt();
        int sum=0;
        while (n>0) {
            int last=n%10;
            sum=sum+last;
            n=n/10;
        }
        System.out.print(sum);
    }
}
