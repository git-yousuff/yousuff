package as;

import java.util.Scanner;

public class multiply {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF...:");
		int i=scan.nextInt();
		
		System.out.println("ENTER VALUE FOR J...:");
		int j=scan.nextInt();
		int multication=i*j;
	
		System.out.println("THE MULTICATION OF I AND J IS...:"+ multication); 
		
	}

}
