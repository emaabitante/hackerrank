package problems;
import java.util.Scanner;

import java.util.ArrayList;

public class ClimbingTheLeaderboard {
	
	private static final Scanner in = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		int[] alice = new int[in.nextInt()];
		for (int i = 0; i < alice.length; i++) {
			alice[i] = in.nextInt();
		}
		
		int[] scores = new int[in.nextInt()];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = in.nextInt();
		}
		
		in.close();
		
		ArrayList<Integer> clean = new ArrayList<>();
        int[] result = new int[alice.length];
        int aux = 0;
        int e = alice.length - 1;
        
        for(int i: result) {
        	System.out.print(i + " ");
        }
        System.out.println();

        for (int i: scores) {
            if (aux != i) {
                clean.add(i);
                aux = i;
            }
        }

        for (int i = 0; i < clean.size();) {
            if (e >= 0) {
            	if (alice[e] >= clean.get(i)) {
                    result[e] = i + 1;
                    e--;
                }else {
                	i++;
                }
            }else {
            	i = clean.size();
            }
        }
        for (int i = 0; i < result.length; i++) {
        	if (result[i] == 0) {
        		result [i] = clean.size() + 1;
        	}
        }
        
        for(int i = 0; i < result.length; i++) {
        	System.out.print(result[i] + " ");
        }
        
	}

}
