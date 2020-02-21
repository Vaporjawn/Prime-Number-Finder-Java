package math;
import java.util.ArrayList;
/**
 *
 * @author Victor Williams/todoslosdays
 */

public class Prime-Number-Finder {

	public static void main(String[] args) {

		ArrayList<Long> prime = new ArrayList<Long>();
		boolean primeExists = true;

		long limit = 9_223_372_036_854_775_806L;
		for (long i = 2; i < limit; i++) {

			primeExists = checkForPrime(i);

			if (primeExists) {
				prime.add(i); System.out.println(i + " is a prime number");
				/*if (checkForPrime((long) (Math.pow(2, i) - 1))) {
					System.out.println("Prime number " + i + " is a Mersenne prime.");
				}*/
			}
		}
	}

	public static boolean checkForPrime(long d) {
		boolean primeExists = true;
		for (long j = 2; j <= d - 1; j++) {
			if (d % j == 0) {
				primeExists = false;
				break;
			}
		}
		return primeExists;
	}
}
