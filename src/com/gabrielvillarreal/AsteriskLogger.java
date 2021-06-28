package com.gabrielvillarreal;

/*
 *     3. Create two classes that implement the Logger interface
 *     a. AsteriskLogger
 *     b. SpacedLogger
 */

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String Log) {
/*
 * 4.The log method on the AsteriskLogger should 
 *   print out the String it receives between 3 asterisks 
 *   on either side of the String (e.g. if the String passed 
 *   in is “Hello”, then it should print ***Hello*** to the console 	
 */
	System.out.println("***" + Log + "***");	
	}
/*
 * 5.The error method on the AsteriskLogger should 
 *   print the String it receives inside a box of asterisks, 
 *   with the String preceded by the word “ERROR:”. 
 *   For example, if “Hello” is the argument, the following should be printed:
 * **************
** ***Error: Hello***
** **************
 */
	@Override
	public void Error(String Error) {
		// TODO Auto-generated method stub
	System.out.println("****************");
	System.out.println("                ");
	System.out.println("***Error:"+ Error + "***");
	System.out.println("                ");
	System.out.println("****************");
	}
	}
