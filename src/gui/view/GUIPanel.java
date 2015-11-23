package gui.view;

import javax.swing.JPanel;
import gui.controller.GuiController;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Color;

/**
 * 
 * @author snem8901
 * @version 1.0 11/9/15 Basic constructor setup.
 */
public class GUIPanel extends JPanel
{

	private GuiController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	
	public GUIPanel(GuiController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Press teh button.");
		firstTextField = new JTextField("Type your words here.");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Loads content into the panel.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout); //Needs to be the first line of the setupPanel helper method.
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	/**
	 * Helper method to hold ugly GUI layout code.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -155, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 53, SpringLayout.SOUTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, 0, SpringLayout.EAST, firstTextField);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 137, SpringLayout.WEST, this);
		
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("press it!");
			}
		});
		
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent clicked)
			{
				changeRandomColor();
			}
			
			public void mouseReleased(MouseEvent released)
			{
				
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				
			}
			
			public void mouseEntered(MouseEvent entered)
			{
			//	changeRandomColor();
			}
			
			public void mouseExited(MouseEvent exited)
			{
			//	changeRandomColor();
			}
		});
	}
	
	private void changeRandomColor()
	{
		int red, green, blue;
		
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	
}
