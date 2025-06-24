import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String R="";
        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            
            if(c >= 'a' && c <= 'z')
                R+=(char)(c-32);
            else if(c>='A' && c<='Z')
                R+=(char)(c+32);
        }
        
            
        System.out.print(R);
    }
}