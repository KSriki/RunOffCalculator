import java.util.Scanner;

/* Run Off Calculator
 * Srikant Kumar Kalaputapu
 * 6/19/2017
 */
public class RunOff {

	public static void main(String[] args){
		
		double roofLength, roofWidth;
		double result = 1;
		double volume = 1;
		double inches = 1;
		Scanner keyboard = new Scanner(System.in);
		
		//Input roof dimensions
		
		System.out.println("Enter the roof's length: ");
		roofLength = keyboard.nextDouble();
		System.out.println("Enter the roof's width: ");
		roofWidth = keyboard.nextDouble();
		
		//Input inches of rain
		
		System.out.println("Enter inches of rainfall: ");
		inches = keyboard.nextDouble();
		
		//calculate and output runoff
		
		System.out.printf("Gallons of run off for your roof is: %.3f",runOff(roofLength, roofWidth,inches));
	
	}
	
	
	/**
	 * Calculate the volume (number of gallons/cubic inches) of runoff for a specific roof during a rain storm.
	 * @param roofLength: length of the roof in inches
	 * @param roofWidth: width of the roof in inches
	 * @param inches: inches of rainfall during the rainstorm
	 * @returns Volume (number of gallons/cubic inches) of runoff during a rainstorm for a specific roof
	 */
	public static double runOff(double roofLength, double roofWidth, double inches){
		
		//convert to inches
		roofLength = roofLength * 12;
		roofWidth = roofWidth * 12;
		//volume
		double volume = roofLength * roofWidth * inches;
		//formula for runoff
		volume = volume / 231;
		return volume;
		
	}
	
	
	
	
}
