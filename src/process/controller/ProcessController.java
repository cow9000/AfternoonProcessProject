package process.controller;

import process.model.PlayDohCircle;

public class ProcessController
{
	
	
	
	public ProcessController()
	{
		System.out.println("This is the constructor");
		
	}

	public void start()
	{
		System.out.println("Print print print print print print");
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle(10);
		
		System.out.println("Look I made a circle");
		System.out.println(firstCircle);
		System.out.println(secondCircle);
	}
}
