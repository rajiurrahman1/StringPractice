package StringPractice;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rajiur
 */
public class Panagram {
    public static void main(String[] args){
        String s = "abc";
        int s0 = (int)s.charAt(2);
//        System.out.println(s0-97);
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().trim().toLowerCase();
        int[] panArray = new int[26];
        Arrays.fill(panArray, 0);
        if(str.length() <= 1000){
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) !=' '){
                    int temp = (int)str.charAt(i);
                    panArray[temp-97] = 1;
                }
            }
        }
        int res = 1;
        for(int i=0; i<panArray.length; i++){
            if(panArray[i]==0){
                res = 0;
                break;
            }
        }
        if(res == 1){System.out.println("pangram");}
        else{System.out.println("not pangram");}
    }
}
