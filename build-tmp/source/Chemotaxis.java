import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

Bacteria [] colony; 
public void setup()   
{
 	background(255);
 	frameRate(15);
 	size(500,500);
 	colony = new Bacteria[10];
 	for(int i=0; i<colony.length; i++)   
 	{
 		colony[i]=new Bacteria();
 	}  
}   
public void draw()   
{    
 	background(255);
 	for(int i=1; i<colony.length; i++)   
 	{ 	
 		colony[i].show();
 		colony[i].move();
 	}  
}  
public void mousePressed()
{
	background(255);
	colony = new Bacteria[10];
 	for(int i=0; i<colony.length; i++)   
 	{
 		colony[i]=new Bacteria();
 	}  
 	redraw();
}
class Bacteria    
 {
 	int x, y,r,g,b; //declares x and y for each instance of the bacteria class
 	Bacteria()
 	{
 		x = 250;
 		y = 250;
 		r = (int)(Math.random()*255);
 		g = (int)(Math.random()*255);
 		b = (int)(Math.random()*255);
 	}  
 	public void show()
 	{
 		stroke(0);
 		fill(r,g,b);
 		ellipse(x,y,25,25);
 	}   
 	public void move()
 	{
 		x = x + (int)(Math.random()*8-4);
 		y = y + (int)(Math.random()*8-4);
 	}
}    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
