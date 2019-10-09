/*
 * @author Rachel DeCouto
 * @Date 9/25/18
 * @Lab 014
 * Description: A 5 option program where a user can calculate a test score
 * guess if a dice roll is odd or even
 * calculate the area of a circle
 * compute the distance between two points
 * or quit the program
 * Psuedocode:
 * print the home menu and ask user what game they want to play
 * save user input as variable choice
 * write if statement based on choice
 * if choice is 1 play lab test average calculator
 * if choice is 2 play dice roll
 *  if choice is 3 play circle area calculator
 *  if choice is 4 play compute distance
 *  if choice is 0 display quit message
 *   
 */
import java.util.*;

public class assignment1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// display menu to choose which game to play
		//also have option to quit
		
		System.out.println("1. Lab Test Average Calculator");
		System.out.println("2. Dice roll");
		System.out.println("3. Circle Area Calculator");
		System.out.println("4. Compute Distance");
		System.out.println("0. Quit");
		System.out.println("Enter the number that corresponds to the game you want to play, or press 0 to quit.");
		int choice = input.nextInt();
		
		
		
		//lab test average calculator
		//input 3 test grades to get the average test grade
		if (choice == 1) {
			System.out.println("Enter in your grade for test 1:");
		double Test1 = input.nextDouble();
		System.out.println("Enter in your grade for test 2:");
		double Test2 = input.nextDouble();
		System.out.println("Enter in your grade for test 3:");
		double Test3 = input.nextDouble();
		//get average of the tests and display result
		double average = ((Test1 + Test2 + Test3)/3);
		
		System.out.println("Your test average is: " + average);
		}
		
		
		
		//Dice roll
		//generate a random dice roll and user guesses if its even or odd
		else if (choice == 2) {
			
			System.out.println("A dice is rolling and will land on a side, 1-6. Guess if the side this dice lands on is even(1) or odd(2).");
			int dice = input.nextInt();
			//generate random roll
			int roll = (int)(Math.random()*6 + 1);
		//checks if their guess was even and if the roll was even
			if (dice == 1) {
				if (roll==2 || roll == 4 || roll == 6) {
					System.out.println("You Win!");
				}else {
					System.out.println("Loss");
				}	}
			
			//checks if their guess was odd and checks if the roll was odd
				else if (dice == 2) {
				if (roll == 1 || roll == 3 || roll == 5) {
					System.out.println("You Win!");
				}else {
					System.out.println("Loss");}
				
				}
				}
		
		//Circle area calculator
		//calculate the area of a circle by taking user input and calculating
		//then output the area of the user's circle.
		
		else if (choice == 3) {
			
			System.out.println("Please enter your circle's radius: ");	
			double radius = input.nextDouble();
			double finalradius = radius * radius * 3.1415;
						
			System.out.println("The area of your circle is : " + finalradius );			
		}
		
		//Compute Distance
		//ask user for two points
		//use distance equation to compute distance
		//output the users distance.
		
		else if (choice == 4) {
			
			System.out.println("We will calculate the distance of two points!");
			System.out.println("Please input your value for x1: ");
			int x1 = input.nextInt();
			
			System.out.println("Please input your value for y1: ");
			int y1 = input.nextInt();
			
			System.out.println("Please input your value for x2: ");
			int x2 = input.nextInt();
			
			System.out.println("Please input your value for y2: ");
			int y2 = input.nextInt();
			
			System.out.println("Your 2 sets of coordinates are  " + x1 + "," + y1 + " and " + x2 + "," + y2);
		
			int distance = (2 * (x2 - x1) + 2 * (y2 - y1));
			System.out.println("The distance between your points is " + distance);
			
		}
		// Quit
		//Last option is a quit option
		
		else if (choice == 0) {
			
			System.out.println("Thanks for playing! Come back soon.");
		}
		
		
		
		
		}


	}


