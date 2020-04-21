package problems;
import java.util.*;

public class JavaSubstringComparisons {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int k = in.nextInt();
		
		String smallest = "";
        String largest = "";
        int div = s.length() - (k - 1);
        String[] grp = new String[div];
        char[] subdiv = new char[k]; 
        char[] car = s.toCharArray();
        int t = 0;

        for(int i = 0; i < div; i++) {
           for(int r = 0; r < k; r++) {
               subdiv[r] = car[t];
               t++;
           }
           grp[i] = String.valueOf(subdiv);
           t = t - (k-1);
        }
        smallest = grp[0];
        largest = grp[0];

        for(String p: grp) {
            if (smallest.compareTo(p) > 0) {
                smallest = p;
            }
            if (largest.compareTo(p) < 0) {
                largest = p;
            }

        }
        System.out.println(smallest);
        System.out.println(largest);

	}

}
