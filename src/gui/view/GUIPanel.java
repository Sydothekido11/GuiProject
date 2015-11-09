package gui.view;

import javax.swing.JPanel;
import gui.controller.GuiController;

/**
 * 
 * @author snem8901
 * @version 1.0 11/9/15 Basic constructor setup.
 */
public class GUIPanel extends JPanel
{

	private GuiController baseController;
	
	public GUIPanel(GuiController baseController)
	{
		this.baseController = baseController;
	}
	
	
}
