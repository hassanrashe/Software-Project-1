package package1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

//This class creates a circle  by extending the Comparable MyRectangle.
public class Circle extends Square{

	//Parameterized constructor to create a Circle.
	public Circle(int x,int y,int width,int height,Color color){
		super(x,y,width,height,color);
	}
	
	public void setRadius(int rad) {
		super.setWidth(rad*2);
		super.setHeight(rad*2);
	}
	
	public int getRadius() {
		return (int)(super.getWidth()/2);
	}
	//This method draws the component.
	public void paintComponent(Graphics g) {
		//super.paintComponent(g);
		Graphics2D g2d=(Graphics2D)g;
		g2d.setColor(super.getColor());
		g2d.fillOval(0, 0, super.getWidth(), super.getHeight());
		this.validate();
	}
	
	//Getter to surface.
	public double getSurface() {
		double radius=super.getWidth()/2.0;
		return Math.PI * radius * radius ;
	}
}
