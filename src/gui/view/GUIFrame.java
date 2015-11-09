package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

/**
 * Creates the frame for the GUI project.
 * @author snem8901
 * @version 1.3 11/9/15 Added a reference to the GUIPanel and installed it as the content pane.
 * Added the setupFrame helper method.
 * 
 */
public class GUIFrame extends JFrame
{

	private GuiController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GuiController baseController)
	{
		this.baseController = baseController;	 //Assign parameter to data member.
		basePanel = new GUIPanel(baseController); //Creates an instance of the GUIPanel with a reference to the controller.
		setupFrame();
		
	}
	
	/**
	 * Helper method to setup the Frame and its structure.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);		   //Sets the panel in the GUIFrame, this is required!
		this.setResizable(false);			   //Usually a good idea but not required.
		this.setTitle("My window app breh."); //Sets the title.
		this.setSize(400,400);				  //Sets the size.
		this.setVisible(true);				  //Must be the last line of code in the setupFrame method.
	}
}
