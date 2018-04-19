package art.controller;

import art.view.ArtFrame;

public class ArtController
{
	private ArtFrame appFrame;
	
	public void start()
	{
		appFrame = new ArtFrame(this);
	}
}
