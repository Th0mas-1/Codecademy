public class Magic {
	public static void main(String[] args) {
		int myNumber = 3;
		// I initially set my number to 5

		int stepOne = myNumber * myNumber;
		int stepTwo = stepOne + myNumber;
		int stepThree = stepTwo / myNumber;
		int stepFour = stepThree + 17;
		int stepFive = stepFour - myNumber;
		int stepSix = stepFive / 6;
		System.out.println(stepSix);

		int magicNumber = myNumber;
		magicNumber *= myNumber;
		magicNumber += myNumber;
		magicNumber /= myNumber;
		magicNumber += 17;
		magicNumber -= myNumber;
		magicNumber /= 6;
		System.out.println(magicNumber);

	}
}