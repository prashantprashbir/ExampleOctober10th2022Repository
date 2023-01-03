package practice1;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the city name :");
		String str=sc.nextLine();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int res=(x+y);
		System.out.println(res);
		sc.close();

	}

}
