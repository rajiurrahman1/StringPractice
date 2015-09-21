package StringPractice;

import java.util.Scanner;

/**
 *
 * @author Rajiur
 */
public class AlternatingCharacters {
        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String testCases = in.nextLine();
        int numTestCases = Integer.parseInt(testCases);
        for(int i=0; i<numTestCases; i++){
            if(i == 10){break;}
            int delCount = 0;
            String str = in.nextLine();
            if( str.length()>=1 && str.length()<=10000 ){
                for(int j=0; j<str.length()-1; j++){
                    if( str.charAt(j) == str.charAt(j+1) ){
                        delCount++;
                    }
                }
                System.out.println(delCount);
            }
        }
    }
}
