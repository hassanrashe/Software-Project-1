package package1;

import java.awt.Color;
//This class provides static methods each to create a different shape.
public class ShapeFactory {
	//This static method creates a Rectangle for the given x, y, width, height and Color
	//parameters , and returns that.
	public static Rectangle getRectangleInstance(int x,int y,int width,int height,Color color) {
		return new Rectangle(x,y,width,height,color);
	}

	//This static method creates a Square for the given x, y, width, height and Color
	//parameters , and returns that.
	public static Square getSquareInstance(int x,int y,int width,int height,Color color) {
		return new Square(x,y,width,height,color);		
	}

	//This static method creates a Circle for the given x, y, width, height and Color
	//parameters , and returns that.
	public static Circle getCircleInstance(int x,int y,int width,int height,Color color) {
		return new Circle(x,y,width,height,color);		
	}
}
