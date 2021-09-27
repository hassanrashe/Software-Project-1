package package1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

//This class creates a Comparable Rectangle shape
public class Rectangle extends Shape{
	//Parameterized constructor to create a rectangle.
	public Rectangle(int x,int y,int width,int height,Color color){
		super(x,y,width,height,color);
	}

	//This method draws the component.
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d=(Graphics2D)g;
		g2d.setColor(super.getColor());
		g2d.fillRect(0, 0, super.getWidth(), super.getHeight());
		this.validate();
	}
	
	//Getter to surface.
	public double getSurface() {
		return super.getWidth() * super.getHeight();
	}
	
}
