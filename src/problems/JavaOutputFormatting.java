package problems;
import java.util.Scanner;

public class JavaOutputFormatting {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0 ; i < 3 ; i++){
            String s1 = in.next();
            int x = in.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

}

}
