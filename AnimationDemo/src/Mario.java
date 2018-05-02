

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
	x += dir;
		// WALK!
	}

	public void jump() {
	y -= 10;	
		// JUMP!
	}

	public void act(ArrayList<Shape> obstacles) {

		boolean touching = false;
		for (Shape s : obstacles) {
			touching = ((s.intersects(this)));
		}
		System.out.println(touching);
		if (!touching) {
			y += 1;
		}
		// FALL (and stop when a platform is hit)
	}


}
