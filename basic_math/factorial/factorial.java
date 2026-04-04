package basic_math.factorial;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner akil=new Scanner(System.in);
        int n=akil.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
       System.out.print(fact) ;
    }
}
