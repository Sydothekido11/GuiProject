package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

/**
 * 
 * @author snem8901
 * @version 1.0 11/9/15
 * 
 */
public class GUIFrame extends JFrame
{

	private GuiController baseController;
	
	public GUIFrame(GuiController baseController)
	{
		this.baseController = baseController; //Assign parameter to data member.
	}
}
