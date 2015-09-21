package StringPractice;

import java.util.Scanner;

/**
 *
 * @author Rajiur
 */
public class Palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().trim().toLowerCase();
        int res = 1;
        int len = str.length();
        if(len >=1 && len <= 100000){ //constraint, 1≤ length of string ≤10^5
            for(int i=0; i<len/2; i++){
                if(str.charAt(i) != str.charAt(len-i-1)){
                    res =0;
                    break;
                }
            }
        }
        if(res == 1){System.out.println("YES");}
        else {System.out.println("NO");}
        
    }
}
