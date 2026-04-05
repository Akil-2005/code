package String_manipulation.largest_word;
import java.util.*;
public class largest_word {
    public static void main(String[] args){
        Scanner akil=new Scanner(System.in);
        String s=akil.nextLine();
        int n=s.length();

        String word="";
        String max_word="";
        int max_len=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)!=' '){
                word=word+s.charAt(i);
            }
            else{
                if(word.length()>max_len){
                    max_len=word.length();
                    max_word=word;
                }
                word="";
            }
        }
        if(word.length()>max_len){
            max_word=word;
        }
        System.out.print(max_word);
    }
    
}