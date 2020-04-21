package problems;
import java.io.*;
import java.util.*;


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
	
	public static final String[] DIAS = new String[400000];
	
	static {
		int i = 0;
		String sab = "SABADO";
		String dom = "DOMINGO";
		String lun = "LUNES";
		String mar = "MARTES";
		String mie = "MIERCOLES";
		String jue = "JUEVES";
		String vie = "VIERNES";
		while (i <= 399900) {
			DIAS[i] = sab;
			DIAS[i+1] = dom;
			DIAS[i+2] = lun;
			DIAS[i+3] = mar;
			DIAS[i+4] = mie;
			DIAS[i+5] = jue; 
			DIAS[i+6] = vie;
			i = i + 7;				
		}
	}
	

    public static String findDay(int month, int day, int year) {
        
    	int daysMonth = 0;
        int numDays = 0;
        int i = 1;
        
        while (i < month) {
        	 switch (i) {
             case 1:
             case 3:
             case 5:
             case 7:
             case 8:
             case 10:
             case 12:
             	daysMonth = 31;
             	break;
             case 4:
             case 6:
             case 9:	
             case 11:
             	daysMonth = 30;
             	break;
             case 2:
             	if (year % 4 == 0) {
             		daysMonth = 29;
             	}else {
            	 daysMonth = 28;
             	}
             	break;
             default:
            	System.err.println("Te month numer is invalid");
        	 }
        	 
        	 numDays = numDays + daysMonth;
        	 i++;
        }
        
        int bis = -1;
        if (year > 2000) {
        	bis = (((year - 1) - 2000) / 4);
        }
        
        int año = year - 2000;
    	int dayNumber = ((año * 365) + bis) + numDays + day;
        
        return DIAS[dayNumber];

    }
}

public class JavaDateAndTime {
	public static final Scanner in = new Scanner(System.in);
	
    public static void main(String[] args) throws IOException {
    	int day = 0;
    	int month = 0;
    	int year = 0;
    	do {
    		System.out.print("Ingrese mes: ");
        	month = in.nextInt();
        	System.out.println();
        	if (month < 1 || month > 12) {
        		System.err.println("El mes es inválido");
        		in.nextLine();
        	}else {
        		System.out.print("Ingrese día: ");
            	day = in.nextInt();
            	System.out.println();
            	if (month == 1 ||month == 3 ||month == 5 ||month == 7|| month == 8|| month == 10||month == 12 ) {
            		if (day > 31 ) {
            			System.out.println("Ese día no es válido para el mes " + month);
            			day = 0;
            		}
            	}
            	if (month == 4 ||month == 6 ||month == 9|| month == 11) {
            		if (day > 30 ) {
            			System.out.println("Ese día no es válido para el mes " + month);
            			day = 0;
            		}
            	}
            	if (month == 2) {
            		if (day > 29 ) {
            			System.out.println("Ese día no es válido para el mes " + month);
            			day = 0;
            		}
            	}
            	if (day != 0) {
            		System.out.print("Ingrese año: (Entre 2000 y 3000) ");
                	year = in.nextInt();
                	System.out.println();
                	if (year >= 2000 || year <= 3000) {
                		if ((year != 2000) && (year % 4 != 0 && month == 2)) {
                    		if (day > 28 ) {
                    			System.out.println("Ese día no es válido para el mes " + month + ", recuerde que ese año no es bisiesto");
                    			day = 0;
                    		}
                    	}
                	}else {
                		System.out.println("El año no es válido");
                		day = 0;
                	}
            	}
        	}
        	
    	}while (day == 0);
    	
    	System.out.println(String.format("El día de la fecha %d/%d/%d es %s", day, month, year, Result.findDay(month, day, year)));
    }
}


