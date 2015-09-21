package StringPractice;
import java.util.Scanner;

/**
 * Problem Statement:
 * Suppose you have a string S which has length N and is indexed from 0 to N−1. 
 * String R is the reverse of the string S. 
 * The string S is funny if the condition | S_i−S_(i−1)|=|R_i−R_(i−1) | is true for every i from 1 to N−1.
 *
 * Input Format: First line of the input will contain an integer T. T testcases follow. Each of the next T lines contains one string S.
 * Constraint 1: 1<=T<=10
 * Constraint 2: 2<=length of S<=10000
 * 
 * 
 * @author Rajiur
 */
public class FunnyString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String testCases = in.nextLine();
        int numTestCases = Integer.parseInt(testCases);
        for(int i=0; i<numTestCases; i++){
            if(i == 10){break;}
            String S = in.nextLine();
            if( S.length()>=2 && S.length()<=10000 ){
                int[] diff = new int[S.length()-1];
                diff = calculateASCIIDifferenceBetweenConsecutiveCharacters(diff, S);
                boolean res = checkFunnyConsistency(diff);
                if(res == true){System.out.println("Funny");}
                else{System.out.println("Not Funny");}
            }
        }
    }
    
    private static boolean checkFunnyConsistency(int[] diff) {
        int len = (diff.length);
        boolean res = true;
        for(int i=0; i<len/2; i++){
            if(diff[i] != diff[len-i-1]){
                res = false;
                break;
            }
            else{continue;}
        }
        return res;
    }
    private static int[] calculateASCIIDifferenceBetweenConsecutiveCharacters(int[] diff, String S) {
        for(int i=0; i<S.length()-1; i++){
            diff[i] = ModulousOfASCIIDifferences(S.charAt(i), S.charAt(i+1));
        }
        return diff;
    }
    private static int ModulousOfASCIIDifferences(char charI, char charI1) {
        int intI = (int)charI;
        int intI1 = (int)charI1;
        if( (intI - intI1) > 0){return (intI - intI1);}
        else {return (intI1 - intI);}
    }
    private static void dumpArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
