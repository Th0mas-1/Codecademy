import java.util.ArrayList;

public class ThePrimeDirective {

	public static void main(String [] args) {

		ArrayList<Integer> prime = new ArrayList<Integer>();

		for (int i = 3; i < 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i%j!=0) prime.add(i);}
		}
		System.out.println(prime);
	}
}