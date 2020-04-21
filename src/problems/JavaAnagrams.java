package problems;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        
        
         if(ch1.length != ch2.length) {
            return false;
        }else{
            boolean result = true;
            char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            char[] alphabetUp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
            int[] frequency1 = new int[alphabet.length];
            int[] frequency2 = new int[alphabet.length];
            
            for (char q: ch1){
                for(int i = 0; i < alphabet.length; i++) {         
                    if (q == alphabet[i] || q == alphabetUp[i]) {
                        frequency1[i]++; 
                    }
                }
            }
            for (char q: ch2){
                for(int i = 0; i < alphabet.length; i++) {         
                    if (q == alphabet[i] || q == alphabetUp[i]) {
                        frequency2[i]++; 
                    }
                }
            }
            for (int i = 0; i < frequency1.length; i++) {
                if(frequency1[i] != frequency2[i]) {
                    result = false;
                }
            }
            return result;
            
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        System.out.println( (isAnagram(a, b)) ? "Anagrams" : "Not Anagrams" );
    }
}

