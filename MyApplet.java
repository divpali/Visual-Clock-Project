package module2;

import processing.core.*;

/*
 * processing - lib - use to develop application
 * PApplet class will help make the GUI
 */

public class MyApplet extends PApplet {
	
	private PImage backgroundImg;
	private String url="C://Users//Public//Pictures//Sample Pictures//Lighthouse.jpg";

	
	public void setup(){    // configure canvas  -  executed once
		size(800, 800);   //set canvas size
		background(255);  //set canvas color
		stroke(0);        //set pen color
		backgroundImg=loadImage(url,"jpg");
		backgroundImg.resize(0, height);   //resize background image as per the canvas dynamically
		image(backgroundImg, 0, 0);
		
	}
	
	public void draw(){   // Display content  -  loops often
		int[] color = sunColorSec(second());   //calculate color code
		fill(255,209,0);              //set sun color
		ellipse(600, height/7, width/5, height/5);    //draw sun
		
	}
	

	private int[] sunColorSec(float second) {    //call built-in method seconds() which returns no of seconds that have elapsed since the past minute
		// TODO Auto-generated method stub
		int[] rgb=new int[3];
		
		float diffFrom30=Math.abs(30-second);
		float ratio=diffFrom30/30;
		
		rgb[0]= (int) (255*ratio);
		rgb[1]= (int) (255*ratio);
		rgb[2]=	0;
		
		System.out.println("R " + rgb[0]+" C "+ rgb[1] +" B "+ rgb[2]);
		
		return rgb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
