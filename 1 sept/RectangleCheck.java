/*
Prog : Create a class named Rectangle and calculate area
        It has three constructor : 1)No parameter 2)Two numbers as parameter
		3)One number as parameter
@author : Tanay Patil
@Date : 1 Sept	
*/


import static java.lang.System.*;
class Rectangle 
{
	private int length;
	private int breadth;
	
	// No parameter ---> 1st Condition
	Rectangle(){
		// Assign zero to length and breadth
		this.length=0;
		this.breadth=0;
	}
	
	// Two numbers as parameter ---> 2nd Condition   
	Rectangle(int length,int breadth){
		// initializing the length and breadth
		this.length=length;
		this.breadth=breadth;
	}
	
	// One number as parameter ---> 3rd Condition   
	Rectangle(int value){
		
		this.length=value;
		this.breadth=value;
	}

	// Calculation of area
	int calculateArea(){
		
		return length*breadth;  // Formula to calculate area of rectangle
	}
	
} 



class RectangleCheck
{
	// Calling main method
	public static void main(String...args){
		
		//No parameter
		Rectangle r1=new Rectangle();
		out.println("The area of r1 rectangle is "+r1.calculateArea()+" square units");
		
		//One parameter
		Rectangle r2=new Rectangle(10);
		out.println("The area of r2 rectangle is "+r2.calculateArea()+" square units");
		
		//Two parameter
		Rectangle r3=new Rectangle(40,20);
		out.println("The area of r3 rectangle is "+r3.calculateArea()+" square units");
	
	}
}
