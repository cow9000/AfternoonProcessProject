package process.controller;

import process.model.PlayDohCircle;
import process.model.Cow;

import java.util.Scanner;
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
		secondCircle = new PlayDohCircle();
		
		System.out.println("Look I made a circle");
		System.out.println(firstCircle);
		System.out.println(secondCircle);
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("What size do you want the circle?");
		
		int circleSize = myScanner.nextInt();
		
		
		PlayDohCircle thirdCircle = new PlayDohCircle(circleSize);
		System.out.println(thirdCircle);
		
		
		System.out.println("What size should we change it to?");
		int updated = myScanner.nextInt();
		thirdCircle.setSize(updated);
		System.out.println("The circle is now....");
		System.out.println(thirdCircle);
		
		Cow firstCow = new Cow("Jon");
		System.out.println(firstCow);
	}
	
	
	
}
