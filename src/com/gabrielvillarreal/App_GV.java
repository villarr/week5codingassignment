package com.gabrielvillarreal;
/*
 * 9.  Create a class named App that has a main method.
 * 10. In this class instantiate an instance of each of 
 *     your logger classes that implement the Logger interface.
 * 11. Test both methods on both instances, passing in Strings of your choice.
 */
public class App_GV {
	
	public static void main(String[] args) {
		AsteriskLogger Cheetah = new AsteriskLogger();
		
		Cheetah.Log("Henry");
		// creating a new space
		System.out.println("");
		Cheetah.Error("Hendog");
		// creating a new space
		System.out.println("");
		SpacedLogger Louie = new SpacedLogger();
		Louie.Log("Majestic");
		// creating a new space
		System.out.println("");
		Louie.Error("Networking");
	}
	
}
