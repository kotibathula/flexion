package flexion.com.flexion.kote.tempconversion.common;

/**
 * 
 * @author Kote Bathula
 * Converts the temperature values from Fahrenheit to Celsius, Rankine and Kelvin
 *
 */

public class Fahrenheit {
	
	public static double fromFahrenheit(double value, String targetUnit)
	{
		switch (targetUnit.charAt(targetUnit.length()-1)) {
		case 'c' : return (value - 32)* 5/9;
		case 'r' : return (value + 459.67);
		case 'k' : return (value + 459.67) * 5/9;
		}
		return 0;
	}
	
}
