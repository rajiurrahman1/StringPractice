package StringPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * Problem Statement: Jack and Daniel are friends. Both of them like letters, especially upper-case ones. 
They are cutting upper-case letters from newspapers, and each one of them has their collection of letters stored in separate stacks. 
One beautiful day, Morgan visited Jack and Daniel. He saw their collections. Morgan wondered what is the lexicographically minimal string, made of that two collections. He can take a letter from a collection when it is on the top of the stack. 
Also, Morgan wants to use all the letters in the boys' collections.
 * 
 * 
 * @author Rajiur
 */
public class MorganAndAString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String testCases = in.nextLine();
        int numTestCases = Integer.parseInt(testCases);
        for(int i=0; i<numTestCases; i++){
            if(i == 5){break;}
            String s1 = in.nextLine().trim().toUpperCase();
            String s2 = in.nextLine().trim().toUpperCase();
            if( (s1.length()>=1 && s1.length()<=100000) && (s2.length()>=1 && s2.length()<=100000) ){
                List<Character> aS1 = buildArrayListFromString(s1);
                List<Character> aS2 = buildArrayListFromString(s2);
                
                while( !aS1.isEmpty() && !aS2.isEmpty()){
                    char c1 = aS1.get(0);
                    char c2 = aS2.get(0);
                    int i1 = (int)c1;
                    int i2 = (int)c2;
                    if(i1 < i2){
                        System.out.print(c1);
                        aS1.remove(0);
                    }
                    else{
                        System.out.print(c2);
                        aS2.remove(0);
                    }
                }
                if(aS1.isEmpty()){ //print the rest from String 2, ArrayList 2
                    while( !aS2.isEmpty() ){
                        System.out.print(aS2.get(0));
                        aS2.remove(0);
                    }
                }
                else{
                    while( !aS1.isEmpty() ){
                        System.out.print(aS1.get(0));
                        aS1.remove(0);
                    }
                }
            }
            System.out.println("");
        }
    } 
    private static List<Character> buildArrayListFromString(String s1) {
        List<Character> al = new ArrayList<Character>();
        for(int i=0; i<s1.length(); i++){
            al.add(s1.charAt(i));
        }
        return al;
    }
    
}
