package problems;

import java.util.*;

public class BetweenTwoSets {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		a.add(3);
		a.add(4);
//		b.add(100);
		b.add(24);
		b.add(48);

		int cant = 0;
		int e = 1;
		int bMa = b.get(0);
		int bMe = b.get(0);
		boolean s = false;

		for (int i : b) {
			if (bMa < i) {
				bMa = i;
			}
		}
		for (int i : b) {
			if (bMe > i) {
				bMe = i;
			}
		}
		while (e <= bMa) {		
			for (int i = 0; i < a.size(); i++) {
				if (e % a.get(i) == 0) {
					s = true;
				}else {
					s = false;
					i = a.size();
				}
		    }
			
			if (s) {
				for (int i = 0; i < b.size(); i++) {
					if (b.get(i) % e == 0) {
						s = true;
					}else {
						i = b.size();
						s = false;
					}
				}
				
			}
			if (s) {
				cant++;
			}
			e++;
		}
		System.out.println(cant);
	}

}

//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(firstMultipleInput[0]);
//
//        int m = Integer.parseInt(firstMultipleInput[1]);
//
//        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        List<Integer> arr = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrTemp[i]);
//            arr.add(arrItem);
//        }
//
//        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        List<Integer> brr = new ArrayList<>();
//
//        for (int i = 0; i < m; i++) {
//            int brrItem = Integer.parseInt(brrTemp[i]);
//            brr.add(brrItem);
//        }
//
//        int total = Result.getTotalX(arr, brr);
//
//        bufferedWriter.write(String.valueOf(total));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
