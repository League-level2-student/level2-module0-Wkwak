package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] robArray = new Robot[9];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robArray.length; i++) {
			robArray[i] = new Robot(60 + (100 * i), 500);
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			robArray[i].setSpeed(30);
		}

		// 5. use another for loop to iterate through the array and make each robot move
		int counter = 0;
		while (counter < 1) {
			for (int i = 0; i < robArray.length; i++) {
				// a random amount less than 50.
				Random rand = new Random();
				int totallyRandom = rand.nextInt(40);
				robArray[i].move(totallyRandom);

				if (robArray[i].getY() < 0) {
					counter++;
					robArray[i].sparkle();
					System.out.println("party");
				}
			}
		}
		// }
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
		// I did that
	}
}
