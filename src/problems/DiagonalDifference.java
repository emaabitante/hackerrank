package problems;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class DiagonalDifference {
	
	
	public static int diagonalDifference(List<List<Integer>> arr) {
        
        int diagonal1 = 0;
        int diagonal2 = 0;
        int e = 0;
       
        
        for (List<Integer> arreglo: arr) {
            diagonal1 = diagonal1 + arreglo.get(e);    
            e++;
        }
        
        e = (arr.size() - 1); 
        for (List<Integer> arreglo: arr) {    
              diagonal2 = diagonal2 + arreglo.get(e);    
            e--;
        }
        
        int diferencia = diagonal1 - diagonal2;
        if (diferencia < 0) {
            diferencia = diferencia * -1;
        }
        
        return diferencia;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner (System.in);
      
        int n = in.nextInt();

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            List<Integer> arrRowItems = new ArrayList<>();
            
     

            for (int j = 0; j < n; j++) {
                int arrItem = in.nextInt();
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        } 
        
        for (List<Integer> arreglo: arr) {
            for (int r: arreglo) {
            	System.out.print(r + " ");
            }
            System.out.println();
        }

        int result = diagonalDifference(arr);
        System.out.println(result);

    }
}
