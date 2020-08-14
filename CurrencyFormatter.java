package practice;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner; 


public class CurrencyFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double payment = scanner.nextDouble();
        scanner.close();
        
		
		// Get the currency instance /Object
        NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US); 
        
        Locale indialocale=new Locale("en","IN");/* India does not have a built-in Locale,
         so you must construct one where the language is en (i.e., English).
        locale for India Rupees is not present so we make our Locale for Indian Currency
        */
        NumberFormat india=NumberFormat.getCurrencyInstance(indialocale);
        
        NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

	}

}
