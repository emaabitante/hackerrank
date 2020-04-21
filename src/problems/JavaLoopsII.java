package problems;
import java.util.Scanner;

public class JavaLoopsII {
	public static void main(String []argh){
        
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int e = 0;
            int total = a;
            while (e < n) {
            	int result = (int)Math.pow(2, e) * b;
            	total = total + result;
            	System.out.print(total + " ");
                e++;
            }
            System.out.println();
        }
        in.close();
    }
	

}
