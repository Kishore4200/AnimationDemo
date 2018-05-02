

import java.awt.*;
import java.util.*;

import processing.core.PImage;

public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;
	private double velocity = 0, acceleration = -9.81;

	public Mario(PImage img, int x, int y) {
		super(img, x, y, MARIO_WIDTH, MARIO_HEIGHT);
	}

	// METHODS
	public void walk(int dir) {
	x += dir*5;
		// WALK!
	}

	public void jump() {
		for (double i = 0; i < 1; i+=0.01) {
			y += (velocity*i + 0.5*acceleration*i*i);
		}
		// JUMP!
	}

	public void act(ArrayList<Shape> obstacles) {
		boolean touching = false;
		for (Shape s : obstacles) {
			touching = ((s.intersects(this)));
		}
		if (!touching) {
			y += 2;
		}
		// FALL (and stop when a platform is hit)
	}


}
