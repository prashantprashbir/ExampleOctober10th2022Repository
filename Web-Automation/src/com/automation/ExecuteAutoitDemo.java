package com.automation;

public class ExecuteAutoitDemo {

	public static void main(String[] args) {
		
		executeAutoIt();

	}
	
	private static void executeAutoIt()
	{
		try
		{
			Runtime obj=Runtime.getRuntime();
			obj.exec("\"D:\\Autoit\\test1.exe\"");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
