package flexion.com.flexion.kote.tempconversion.common;

/**
 * 
 * @author Kote Bathula
 * Converts the temperature values from Kelvin to Centigrade, Fahrenheit and Rankine
 *
 */

public class Kelvin {
	
	public static double fromKelvin(double value, String targetUnit)
	{
		switch (targetUnit.charAt(targetUnit.length()-1)) {
		case 'c' : return (value - 273.15);
		case 'f' : return (value* 9/5 - 459.67);
		case 'r' : return (value * 9/5);
		}
		return 0;
	}

}	