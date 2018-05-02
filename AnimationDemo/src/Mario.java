

import java.awt.*;
import java.util.*;

import processing.core.PImage;

public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;

	public Mario(PImage img, int x, int y) {
		super(img, x, y, MARIO_WIDTH, MARIO_HEIGHT);
	}

	// METHODS
	public void walk(int dir) {
		// WALK!
	}

	public void jump() {
		// JUMP!
	}

	public void act(ArrayList<Shape> obstacles) {
		System.out.println("act called");
		y += 10;
//		moveByAmount(0, -10);
//		boolean touching = false;
//		for (Shape s : obstacles) {
//			if (s.intersects(this)) touching = true;
//		}
//		while (!touching) {
//			moveByAmount(10, -10);
//		}
		// FALL (and stop when a platform is hit)
	}


}
