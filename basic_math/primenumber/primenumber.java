package basic_math.primenumber;
import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        Scanner akil= new Scanner(System.in);
        int n=akil.nextInt();
        boolean isprime=true;
        while(n<=1){
            isprime=false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        
        }
        if(isprime) System.out.print("prime");
        else  System.out.print("not prime");
        
        
    }
}
