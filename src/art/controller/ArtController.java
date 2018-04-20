package art.controller;

import art.view.ArtFrame;
import javax.swing.JOptionPane;

public class ArtController
{
	private ArtFrame appFrame;
	
	public void start()
	{
		appFrame = new ArtFrame(this);
	}
	
	public ArtFrame getFrame()
	{
		return appFrame;
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
}
