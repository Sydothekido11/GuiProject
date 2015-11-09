package gui.controller;

import gui.view.GUIFrame;


/**
 * AppController for the simple GUI project.
 * @author snem8901
 * @version 1.0 11/9/2015
 */
public class GuiController
{

	/**
	 * Reference to the GUIFrame object of the view.
	 */
	private GUIFrame baseFrame;
	
	public GuiController()
	{
		baseFrame = new GUIFrame(this);
	}
	
	
	public void start()
	{	
	}
	
}
