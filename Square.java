package package1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

//This class creates a square  by extending the Comparable MyRectangle.
public class Square extends Rectangle{

	//Parameterized constructor to create a Square.
	public Square(int x,int y,int width,int height,Color color){
		super(x,y,width,height,color);
	}
}
