package selenium_yuva;

import java.util.Scanner;

public class Prime_New {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		
		
		for (int i = input1 ; i <=input2; i++) {
			int count = 0;
			
			for (int j = 1; j <=i; j++) {
				if (i % j == 0) {
					count++;
					
				}
				
			}
			if (count == 2) {
				System.out.println(i +" ");
			}

			
		}
	}
	


}






















