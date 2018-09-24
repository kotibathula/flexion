package flexion.com.flexion.kote.tempconversion.common;

/**
 * 
 * @author Kote Bathula
 * Converts the temperature value from Rankine to Celsius, Fahrenheit and Kelvin
 *
 */

public class Rankine {
	
	public static double fromRankine(double value, String targetUnit)
	{
		switch (targetUnit.charAt(targetUnit.length()-1)) {
		case 'c' : return (value - 491.67)* 5/9;
		case 'f' : return (value - 459.67);
		case 'k' : return (value * 5/9 );
		}
		return 0;
	}

		
}
