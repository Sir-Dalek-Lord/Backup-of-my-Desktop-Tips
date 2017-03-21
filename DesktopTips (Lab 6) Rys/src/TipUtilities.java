import java.text.DecimalFormat;
/**
 * Method that takes a bill and finds the tip and round the tip to the nearest integer.
 * @author Isaac M Rys
 * @version 02/21/17
 *
 */
public class TipUtilities {	
	public static double calcTip(double basis, double percentage)
	  {
	    double decimal = percentage / 100.00;
	    return basis * decimal;
	  }
	  public static double round(double subTip, double quantum)
	  {
	    int total = 0;
	    total = (int)(total + subTip * 100.00);
	    int r = (int)(quantum * 100.00);
	    total += r / 2;
	    total /= r;
	    total *= r;
	    
	    double end = total / 100.00;
	    return end;
	  }
	  
	  public static String toString(double num, int decimalPlaces)
	  {
	    String place = "0.";
	    for (int x = 0; x < decimalPlaces; x++) {
	      place = place + "0";
	    }
	    DecimalFormat decimal = new DecimalFormat(place);
	    return decimal.format(num);
	  }
	}
