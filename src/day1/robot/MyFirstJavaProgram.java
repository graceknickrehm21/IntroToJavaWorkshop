package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

	
		Robot Grace= new Robot();
		Grace.sparkle();
		Grace.penDown();
		Grace.setRandomPenColor();
	
		for (int i = 0; i < 4; i++) {
		Grace.move(100);	
		Grace.turn(90);
		Grace.penUp();
		Grace.turn(180);
		Grace.move(50);
		Grace.penDown();
		for (int j = 0; j < 4; j++) {
		Grace.move(100);
		Grace.turn(90);
		}
		
		}
		
	}}
