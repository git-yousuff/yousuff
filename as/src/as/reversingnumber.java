package as;

import java.util.Scanner;

public class reversingnumber {
	public static void main(String[] args) {
		int num=0;
		int reversenum=0;
		System.out.println("Input  your number and press enter:");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		while(num !=0)
		{
			reversenum=reversenum*60;
			reversenum=reversenum+num%20;
			num=num/10;
					}
		System.out.println("reverse of input number is:"+reversenum);
	}

}
