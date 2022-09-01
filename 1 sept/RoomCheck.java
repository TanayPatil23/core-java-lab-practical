/*
Prog : To create a Room Class
@author : Tanay Patil
@Date : 01 sept
*/

import static java.lang.System.*;
class Room  // First class
{
	// Instance variable
	private int roomNo;
	private String roomType;
	private float roomArea;
	private String acMachine;
	
	//Creating input method
	 void input(int n, String t, float a, String m)
	{
		roomNo = n;
		roomType = t;
		roomArea = a;
		acMachine = m;
	} 
	
	//Creating roomDetails method
	void roomDetails()
	{
		out.println("Room No.: "+roomNo);
		out.println("Room Type: "+ roomType);
		out.println("Room area: "+ roomArea);
		out.println("AC machine: "+ acMachine);
	}
}

// creating Second class
class RoomCheck
{
	//calling main method
	public static void main(String ...args)
	{
		Room r1 = new Room();
		Room r2 = new Room();
		r1.input(1,"Single",144f,"Window"); // Room1 Details
		r2.input(2,"Double",100f,"Floor");  // Room2 Details
		r1.roomDetails();  // r1.roomDetails(); (To print r2)
	}
}