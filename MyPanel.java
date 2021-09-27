package package1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//This class creates a Panel as the main UI. 
public class MyPanel extends JPanel implements ActionListener{
	private JButton loadButton;	//	Button to load the shapes.
	private JButton sortButton;	//	Button to sort the shapes by their surface area.
	private Shape shapes[];	//	An array of all the shapes.
	private JPanel panelHeader;	//	A Panel to display the Buttons.
	private JPanel panelDrawing;//	A panel to display all teh shapes.
	
	//Default constructor to create the main panel UI.
	public MyPanel() {
		//Creating the button to load the shapes.
		loadButton=new JButton("Load shapes");
		//Making the same application as listener of the button.
		loadButton.addActionListener(this);
		
		//Creating the button to sort the shapes.
		sortButton=new JButton("Sort shapes");
		//Making the same application as listener of the button.
		sortButton.addActionListener(this);
		
		//Setting the BorderLayout as layout of the main UI.
		setLayout(new BorderLayout());
		
		//Creating a Panel to place the Buttons.
		panelHeader=new JPanel();
		//Creating a Panel to place all the shapes.
		panelDrawing=new JPanel();		
			
		//Setting the FlowLayout as layout of the header panel of the buttons.
		panelHeader.setLayout(new FlowLayout(FlowLayout.CENTER));
		//Adding the buttons onto header panel.
		panelHeader.add(loadButton);		
		panelHeader.add(sortButton);
				
		//Disable the layout manager of the panel , to place all the shapes at manual
		//locations.
		panelDrawing.setLayout(null);

		//Adding the header panel of buttons , onto the top position of UI.
		add(panelHeader,BorderLayout.NORTH);
		//Adding the drawing panel of shapes , onto the center position of UI.
		add(panelDrawing);
	}
	
	//This method manages the ActionEvent , while clicking on a button.
	@Override
	public void actionPerformed(ActionEvent e) {
		//Removing all the shape panels from the drawing panels , if any.
		panelDrawing.removeAll();
		//Setting the background color of the drawing panel. 
		panelDrawing.setBackground(Color.DARK_GRAY);
		//Checking if the loadButton was clicked , if so create all the shapes.
		if(e.getSource()==loadButton) {
			//Creating a Random object.
			Random random=new Random();
			//Creating an array of 6 shapes.
			shapes=new Shape[6];
			int y=50;
			int height=30+random.nextInt(20);
			//Creating a Rectangle instance.
			shapes[0]=ShapeFactory.getRectangleInstance(50,y,random.nextInt(100),height,Color.RED);
			
			y+=height+10;
			height=30+random.nextInt(50);
			//Creating a Square instance.
			shapes[1]=ShapeFactory.getSquareInstance(150,y,height,height,Color.PINK);
			
			y+=height+10;
			height=30+random.nextInt(50);
			//Creating a Circle instance.
			shapes[2]=ShapeFactory.getCircleInstance(250,y,height,height,Color.GREEN);
			
			y+=height+10;
			height=30+random.nextInt(50);
			//Creating a Rectangle instance.
			shapes[3]=ShapeFactory.getRectangleInstance(350,y,random.nextInt(100),height,Color.BLUE);
			
			y+=height+10;
			height=30+random.nextInt(50);
			//Creating a Square instance.
			shapes[4]=ShapeFactory.getSquareInstance(450,y,height,height,Color.YELLOW);
			
			y+=height+10;
			height=30+random.nextInt(50);
			//Creating a Circle instance.
			shapes[5]=ShapeFactory.getCircleInstance(550,y,height,height,Color.CYAN);	
		}
		//Checking if the sortButton was clicked , if so sort all the shapes.
		else if(e.getSource()==sortButton) {
			//Sorting all the shapes.
			SortingTechnique.selectionSort(shapes);
			int x=50;
			int y=50;
			//This loop iterates over each shape and set its location on the panel.
			for(int i=0;i<shapes.length;i++) {
				//Setting the x coordinate
				shapes[i].setX(x);
				//Setting the x coordinate
				shapes[i].setY(y);
				x+=shapes[i].getWidth()+10;
				y+=shapes[i].getHeight()+10;
			}
		}
		//This loop iterates over each shape and add it to the drawing panel.
		for(int i=0;i<shapes.length;i++) {
			panelDrawing.add(shapes[i]);
		}
		//Repaint the UI.
		this.repaint();
		//Refreshing the arrangement of shapes onto the drawing panel.
		panelDrawing.validate();
	}
	public static void main(String[] args) {
		//Creating a MyPanel object.
		MyPanel mp=new MyPanel();
		//Creating the main window.
		JFrame jframe=new JFrame();
		//Setting the BorderLayout as the layout manager for the main window. 
		jframe.setLayout(new BorderLayout());
		//Adding the main panel.
		jframe.add(mp);
		//Setting the location of the main window at the center of the desktop.
		jframe.setLocationRelativeTo(null);
		//Setting the width and height of the main window.
		jframe.setSize(700,700);
		//Making the window visible to the user.
		jframe.setVisible(true);
	}

}
