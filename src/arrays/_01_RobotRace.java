package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[8];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i].setY(450);
			robots[i].setX(i * 200 + 50);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		Random random = new Random();

//		int winner = 0;
//		boolean moving = true;
//		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
//		while(moving) {
//			for (int i = 0; i < robots.length; i++) {
//				if (robots[i].getY() < 0) {
//					moving = false;
//					break;
//				}
//			//   a random amount less than 50.
//				
//				else {
//					winner = i;
//				}
//				robots[i].move(random.nextInt(50));
//			}
//		}
//		System.out.println("The winner is Robot");
		// 7. declare that robot the winner and throw it a party!
		// JOptionPane.showMessageDialog(null, "Robot #" + winner + " is the winner!");
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
		int winner = 0;
		boolean moving = true;
		int[] degrees = new int[8];
		while (moving) {
			for (int i = 0; i < robots.length; i++) {
				for (int j = 0; j < random.nextInt(100); j++) {
					robots[i].move(1);
					robots[i].turn(1);
					degrees[i] += 1;
					
					if(degrees[i] == 360) {
						winner = i;
						moving = false;
						break;
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Robot #" + winner + " is the winner!");
	}
}
