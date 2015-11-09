package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

/**
 * Creates the frame for the GUI project.
 * @author snem8901
 * @version 1.2 11/9/15 Added the helper method
 * 
 */
public class GUIFrame extends JFrame
{

	private GuiController baseController;
	
	public GUIFrame(GuiController baseController)
	{
		this.baseController = baseController; //Assign parameter to data member.
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setVisible(true);	//Must be the last line of code.
	}
}
