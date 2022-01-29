package as;

public class swaptwonumber {
public static void main(String[] args) {
	float first=2.50f,second=4.50f;
	System.out.println("__BEFORE SWAP__");
	System.out.println("FIRST NUMBER="+first);
	System.out.println("SECOND NUMBER="+second);
	float temporary=first;
	first=second;
	second=temporary;
	System.out.println("__AFTER SWAP__");
	System.out.println("FIRST NUMBER="+first);
	System.out.println("SECOND NUMBER="+second);
}
}
