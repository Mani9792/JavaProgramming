package com.programs_oops;

class Animal
{
	String colour = "White";
	
	Animal()
	{
		System.out.println("Constructor call by Super");
	}
}

class Dog extends Animal
{
	String colour = "Red";
	
	void displayColour()
	{
		
		System.out.println(super.colour);//White   -- Variable call by Super
		System.out.println(colour);    //Red
		
	}
	
	Dog()
	{
		super();  // Calls Animal class constructor - which is the Immediate parent class
		System.out.println("Dog Barking now");
	}
}

// For Method call
class Sound extends Dog
{
	String bark = "hard";
	
	void barking()
	{
		super.displayColour(); //White Red   ---For  Method call by Super
		System.out.println(bark);	//bark	
	}
}


public class L_SuperKeyWord {

	public static void main(String[] args) {
		
		//For Variables
		//Dog d = new Dog();
		
		//d.displayColour();
		
		//For Methods
		//Sound s = new Sound();
		
		//s.barking();

		//For Constructors
		Dog d1 = new Dog();  //Jus with Object creation Constructor is called --Try running it alone
	}

}
