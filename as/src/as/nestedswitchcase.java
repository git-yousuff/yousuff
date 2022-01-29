package as;

public class nestedswitchcase {
	public static void main(String[] args) {
		int tech=2;
		int course=2;
		switch(tech) {
		case 1:
			System.out.println("python");
			break;
		case 2:
			System.out.println("golang");
			switch(course) {
			case 1:
				System.out.println("j2ee");
				break;
			case 2:
				System.out.println("advance java");
			}
		}
	}

}
