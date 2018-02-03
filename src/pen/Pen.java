package pen;

import java.io.PrintStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rossd
 */
public class Pen {

	/**
	 * @param a
	 * @param b
	 */
	public static void uhh(String a, String b) throws InterruptedException {
//		System.out.println(a + b);
		printWithDelays( a + b ,TimeUnit.MILLISECONDS, 200);
		System.out.println("");
	}

	public static void Ihave(String a) throws InterruptedException {
//		return System.out.printf("I have a %s.\n", a);
		printWithDelays("I have a " + a, TimeUnit.MILLISECONDS, 200);
		System.out.println("");
	}

	public static void printWithDelays(String data, TimeUnit unit, long delay)
			throws InterruptedException {
		for (char ch : data.toCharArray()) {
			System.out.print(ch);
			unit.sleep(delay);
		}
	}

	public static void main(String[] args) throws InterruptedException {
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
