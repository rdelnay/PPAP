package pen;

import java.io.PrintStream;


/**
 *
 * @author rossd
 */
public class Pen {

	/**
	 * @param a
	 * @param b
	 */
	public static void uhh(String a, String b) {
		System.out.println(a + b);
	}

	public static PrintStream Ihave(String a) {
		return System.out.printf("I have a %s.\n", a);
	}



	public static void main(String[] args) {
		String apple = "Apple",
				pineapple = "Pineapple",
				pen = "Pen",
				ap = (apple + pen),
				pp = (pen + pineapple);

		Ihave(pen);
		Ihave(apple);
		uhh(apple, pen);

		Ihave(pen);
		Ihave(pineapple);
		uhh(pineapple, pen);
		System.out.println(apple + pen);
		System.out.println(pineapple + pen);
		uhh(pp, ap);
		


	}

}
