package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
	//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
		//4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i].setY(450);
			robots[i].setX(i*100);
		}
	//5. use another for loop to iterate through the array and make each robot move 
		Random random = new Random();
		
		int winner;
		boolean moving = false;
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		while(moving == false) {
			for (int i = 0; i < robots.length; i++) {
				if (robots[i].getY() < 0) {
					moving = true;
				}
			//   a random amount less than 50.
				robots[i].move(random.nextInt(50));
				winner = i;
			}
		}
		System.out.println("The winner is Robot");
	//7. declare that robot the winner and throw it a party!
	
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
