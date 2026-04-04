package basic_math.fibonacci;
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner akil=new Scanner(System.in);
        int n=akil.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int temp=a+b;
            a=b;
            b=temp;
        }
    }
}
