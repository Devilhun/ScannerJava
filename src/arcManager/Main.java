package arcManager;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("<<<<<<PROJECT START>>>>>>>>>");
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.printf("nextLine:");
		
		String cmd = sc.nextLine();
		System.out.printf("nextLine: %s \n",cmd);
		
		System.out.printf("next:");
		cmd = sc.next();
		
		System.out.printf("next: %s \n",cmd);
		
		System.out.printf("nextInt:");
		int sum = sc.nextInt();
		System.out.printf("nextInt: %s \n",sum);
		
		
		
		sc.close();
		
		
		
		
		System.out.println("<<<<<<PROJECT END>>>>>>>>>");

	}

}
