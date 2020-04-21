package problems;
import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        String B = sc.next();
        
        boolean s = true;
        int length = A.length() + B.length();
        char[] a1 = A.toCharArray();
        char[] b1 = B.toCharArray();
        int [] positionsA = new int[A.length()];
        int [] positionsB = new int[B.length()];
        int r = 0, i = 0;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] alphabetUp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
     
        
        for (char ch: alphabet) {
            if (a1[i] == ch) {
                positionsA[i] = r;
                i++;
            }
            r++;
        }
        r = 0;
        i = 0;

        for (char ch: alphabet) {
            if (b1[i] == ch) {
                positionsB[i] = r;
                i++;
            }
            r++;
        }
        i = 0;
        System.out.println(length);
        
        if (A.equals(B)) {
        	System.out.println("No");
        }else {
        	while(s) {
                if (positionsA[i] > positionsB[i]) {
                    System.out.println("Yes");
                    s = false;
                } else if (positionsA[i] < positionsB[i]) {
                   System.out.println("No");
                   s = false; 
                } else if (positionsA.length < positionsB.length && (i + 1) == positionsA.length){
                	System.out.println("No");
                	s = false; 
                } else if (positionsA.length > positionsB.length && (i + 1) == positionsB.length){
                	System.out.println("Yes");
                	s = false; 
                } else {
                	i++;
                }               
        	}       	
        }

        
        a1[0] = alphabetUp[positionsA[0]];
        b1[0] = alphabetUp[positionsB[0]];
         
        
        System.out.print(a1);
        System.out.print(" ");
        System.out.print(b1);

         
    }
}
