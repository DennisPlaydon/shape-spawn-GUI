import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class MovingRectangle extends MovingShape {
		
	public MovingRectangle() {
		super();
	}
	
	public MovingRectangle(int x, int y, int w, int h, int mw, int mh, Color c, Color fc, int pathType) {
		/** constuctor to create a shape
     * @param x         the x-coordinate of the new shape
     * @param y        the y-coordinate of the new shape
     * @param w         the width of the new shape
     * @param h         the height of the new shape
     * @param mw         the margin width of the animation panel
     * @param mh        the margin height of the animation panel
     * @param c        the colour of the new shape
     * @param typeOfPath         the path of the new shape
     */
		super(x, y, w, h, mw, mh, c, fc, pathType);
	}
		
	public void draw(Graphics g) {
		g.setColor(super.borderColor);
		g.fillRect(super.getX(), super.getY(), super.width, super.height);
		g.setColor(super.fillColor);
		g.drawRect(super.getX(), super.getY(), super.width, super.height);
	}
	
	
	public boolean contains(Point p) {
		if ((p.y < super.getY()) && (p.x > super.getX()) && (p.y > (super.getY() - super.height)) && (p.x < (super.getX() + super.width))) {
			return true;
		}
		return false;
	}
}
