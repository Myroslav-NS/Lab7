package lab7;

import java.util.Scanner;
import java.lang.Math;     // Note: Needed for math functions in part (3)

public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		//public class PaintEstimator {
		   //public static void main(String[] args) {
		      Scanner scnr = new Scanner(System.in);
		      double wallHeight;
		      double wallWidth;
		      double wallArea;
		      
		      System.out.println("Enter wall height (feet):");
		      wallHeight = scnr.nextDouble();
		      
		      System.out.println("Enter wall width (feet):");
		      wallWidth = scnr.nextDouble();
		      
		      //wallWidth = 10.0;                      // FIXME (1): Prompt user to input wall's width
		      
		      // Calculate and output wall area
		      wallArea = wallWidth * wallHeight;                        // FIXME (1): Calculate the wall's area
		      System.out.println("Wall area: " + wallArea + " square feet");     // FIXME (1): Finish the output statement
		      
		      // FIXME (2): Calculate and output the amount of paint in gallons needed to paint the wall
		      double paintGal = wallArea/350.0;
		      
		  
		      System.out.printf("Paint needed: %f gallons\n", paintGal);
		      
		      
		      
		      // FIXME (3): Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
		      double cans = Math.ceil(paintGal);
		      System.out.printf("Cans needed: %.0f can(s)\n", cans);
		   }
		}
		
		
		

	//}

//}
