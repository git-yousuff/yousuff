package as;

import java.util.Scanner;

public class areacircle {
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the radius:");
			double radius=scanner.nextDouble();
			double area=scanner.nextDouble();
			System.out.println("the area of circle is:"+area);
				double circumference=Math.PI*2*radius;
				System.out.println("the circumference of the circle is:"+circumference);
		}
}
