import java.util.ArrayList;

public class ThePrimeDirective {

	public static void main(String [] args) {

		ArrayList<Integer> prime = new ArrayList<Integer>();

		for (int i = 2; i < 10000; i++) {
			boolean test = true;
			for (int j = 2; j < i; j++) {
				if (i%j==0) {test=false;}
			}
		if (test==true) prime.add(i);
		}
		System.out.println(prime);
	}
}