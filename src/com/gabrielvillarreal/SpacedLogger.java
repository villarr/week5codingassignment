package com.gabrielvillarreal;

public class SpacedLogger implements Logger {
	/*
	 * 3. Create two classes that implement the Logger interface
	 * a. AsteriskLogger
	 * b. SpacedLogger
	 *
     * 6. The SpacedLogger should add spaces between each
     *    character of the String argument passed into its methods.
     * 7. If the log method received “Hello” as an argument, 
     *    it should print H e l l o    
	 */
	
	@Override
	public void Log(String Log) {
		StringBuilder build = new StringBuilder();
		build.append("");
		 for(char i=0;i<Log.length();i++){  
		     build.append(Log.charAt(i) + " ");
		 }
		 System.out.println(build.toString());
	}

	@Override
	public void Error(String Error) {
		StringBuilder errorBuild = new StringBuilder();
		errorBuild.append("");
		 for(char i=0;i<Error.length();i++){  
		     errorBuild.append(Error.charAt(i) + " ");
		 }
		 System.out.println("ERROR: " + errorBuild.toString());
	}	
	}
