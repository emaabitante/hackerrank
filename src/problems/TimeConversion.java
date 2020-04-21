package problems;
import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.nextLine();
        String[] parts = time.split(":");
        String h = parts[0]; // 004
        String minute = parts[1];
        String seconds = parts[2];

        int mil = Integer.parseInt(parts[0]);
        if (seconds.contains("PM") && mil < 12) {
            mil = mil + 12;
            h = String.valueOf(mil);
        }else if (seconds.contains("AM") && mil == 12) {
        	h = "00";
        }
        if (mil < 10) {
        	h = "0" + String.valueOf(mil);
        }
        
        seconds = seconds.substring(0, seconds.length() - 2);
       
        
        String result = h + ":" + minute + ":" + seconds;
        
        System.out.println(result);
        }
}


