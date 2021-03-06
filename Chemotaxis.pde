//Teagan Mucher, Block 4 AP CS, "Chemotaxis"

Bacteria [] colony; 
void setup()   
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
void draw()   
{    
 	background(255);
 	for(int i=1; i<colony.length; i++)   
 	{ 	
 		colony[i].show();
 		colony[i].move();
 	}  
}  
void mousePressed()
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
 	void show()
 	{
 		stroke(0);
 		fill(r,g,b);
 		ellipse(x,y,25,25);
 	}   
 	void move()
 	{
 		x = x + (int)(Math.random()*8-4);
 		y = y + (int)(Math.random()*8-4);
 	}
}    
