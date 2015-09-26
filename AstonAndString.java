package StringPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rajiur
 */
public class AstonAndString {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String testCases = in.nextLine();
        int numTestCases = Integer.parseInt(testCases);
        for(int i=0; i<numTestCases; i++){
            if(i == 5){break;}
            String s = in.nextLine().trim();
            String kStr = in.nextLine().trim();
            int k = Integer.parseInt(kStr);
            String sub;
            List<String> subStrings = new ArrayList<String>();
            int length = s.length();
            if(length  >= 1 && length  <= 100000){
                for( int c = 0 ; c < length ; c++ ){
                    for( i = 1 ; i <= length - c ; i++ ){
                        sub = s.substring(c, c+i);
                        subStrings.add(sub);
                    }
                }
            }
//            dumpArrayList(subStrings);
            List<String> sortedSubStrings = sortStringsLexicographicaly(subStrings);
//            dumpArrayList(sortedSubStrings);
            String concatSting = concatStringsFromList(sortedSubStrings);
            System.out.println(concatSting.charAt(k-1));
        }
    }
        
    private static String concatStringsFromList(List<String> sL) {
        String s = "";
        for(int i=0; i<sL.size(); i++){
            s = s+sL.get(i);
        }
        return s;
    }

    private static List<String> sortStringsLexicographicaly(List<String> s) {
        for(int i=0; i<s.size(); i++){
            for(int j=i; j<s.size(); j++){
                int compValue = s.get(i).compareTo(s.get(j));
                
                if( compValue > 0 ){ //if it's greater than 0, then s(i) is lexi greater than s(j)
                    //swap s(i) and s(j)
                    String temp = s.get(i);
                    s.set(i, s.get(j));
                    s.set(j, temp);
                }
            }
        }
        return s;
    }
    
    private static void dumpArrayList(List<String> subStrings) {
        for(int i=0; i<subStrings.size(); i++){
            System.out.print(subStrings.get(i)+ " ");
        }System.out.println("");
    }


}
