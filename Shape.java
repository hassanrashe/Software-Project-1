package package1;

import java.awt.Color;
import javax.swing.JPanel;

//This class creates a Comparable shape
public abstract class Shape extends JPanel implements Comparable<Shape>{
	private int x;	//	x co-ordinate of the shape.
	private int y;	//	y co-ordinate of the shape.
	private int width;	//	width of the shape.
	private int height;	//	height of the shape.
	private Color color;//	color of the shape.
	
	//Parameterized constructor to create a shape.
	public Shape(int x,int y,int width,int height,Color color){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.color=color;		
		this.validate();
	}
	
	//Setter to x coordinate.
	public void setX(int x) {
		this.x=x;
	}

	//Getter to x coordinate.
	public int getX() {
		return x;
	}

	//Setter to y coordinate.
	public void setY(int y) {
		this.y=y;
	}

	//Getter to y coordinate.
	public int getY() {
		return y;
	}

	//Setter to width.
	public void setWidth(int width) {
		this.width=width;
	}

	//Getter to width.
	public int getWidth() {
		return width;
	}

	//Setter to height.
	public void setHeight(int height) {
		this.height=height;
	}

	//Getter to height.
	public int getHeight() {
		return height;
	}

	//Setter to color.
	public void setColor(Color c) {
		this.color=c;
	}

	//Getter to color.
	public Color getColor() {
		return color;
	}
		
	//Getter to surface.
	public abstract double getSurface();
	
	@Override
	public int compareTo(Shape o) {
		return (int)(this.getSurface()-o.getSurface());
	}
}
