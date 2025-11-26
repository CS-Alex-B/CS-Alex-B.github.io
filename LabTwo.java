import java.util.Scanner;
public class LabTwo {

	public static final double a = 9.8;
	
	public static void main(String[] args) {
		
		//Alex Blackwell
		
		Scanner key = new Scanner(System.in);
		
		
		/*
		 * u - initial velocity
		 * t - time
		 * a - acceleration
		 * V - Final Velocity
		 * S - Distance
		 */
		
		
		System.out.println("Enter the initial velocity of the ball (in meters per second) at point A:");
		
		double initialvelocity = key.nextDouble();
		
		System.out.println("How much time (in seconds) does the ball take to reach point B?");
		
		double time = key.nextDouble();
		
		//v = u + at
		//S = ut + ½ at²
		
		double finalvelocity = initialvelocity + a * time;
		
		System.out.println("Final Velocity of the ball = "+finalvelocity+" m/s");
		
		double distancetraveled = initialvelocity * time + 0.5 * a* Math.pow( time, 2);
		
		System.out.println("Distance traveled by the ball(s) = "+distancetraveled+" meters");
		
	}

}
