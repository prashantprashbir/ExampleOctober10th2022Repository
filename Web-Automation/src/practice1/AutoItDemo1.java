package practice1;

public class AutoItDemo1 {

	public static void main(String[] args) {
		
		autoit();

	}
	
	private static void autoit()
	{
		try
		{
			Runtime.getRuntime().exec("\"D:\\Autoit\\practice1.exe\"");
		}catch(Exception e)
		{
			
		}
	}

}
