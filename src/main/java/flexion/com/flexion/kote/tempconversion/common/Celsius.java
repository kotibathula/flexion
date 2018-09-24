package flexion.com.flexion.kote.tempconversion.common;

/**
 * 
 * @author Kote Bathula
 * Converts the temperature values from Celsius to Fahrenheit, Rankine and Kelvin
 *
 */
public class Celsius {
	
	public static double fromCelsius(double value, String targetUnit)
	{
		switch (targetUnit.charAt(targetUnit.length()-1)) {
		case 'f' : return (value * 9/5 + 32);
		case 'r' : return (value + 273.15) * 9/5;
		case 'k' : return value + 273.15;
		}
		return 0;
	}

}
