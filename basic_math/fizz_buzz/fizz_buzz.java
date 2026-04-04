import java.util.*;
class fizz_buzz{
    public static void main(String[] args){
        Scanner akil=new Scanner(System.in);
        int n=akil.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.print("fizzbuzz");
            }
            else if(i%3==0){
                System.out.print("fizz");

            }
            else if(i%5==0){
                System.out.print("buzz");
            }
            else{
                System.out.print(i);
            }

        }
    }
}