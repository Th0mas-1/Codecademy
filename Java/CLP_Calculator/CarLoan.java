// Program to determine the monthly payment on a  car loan

public class CarLoan {
	int carLoan = 10000;
	int loanLength = 3; // Years
	int interestRate = 5; 
	int downPayment = 2000;

	public CarLoan() {

	}

	public void initialCheck() {
		if (loanLength<=0 || interestRate<=0) {System.out.println("Invalid car loan");}
		else if(downPayment>=carLoan) {System.out.println("The car can be paid in full");}
		else {
			int remainingBalance=carLoan-downPayment;
			int months=loanLength*12;
			int monthlyBalance=remainingBalance/months;
			int interest=monthlyBalance*interestRate/100;
			int monthlyPayment=monthlyBalance+interest;
			System.out.println("The monthly payment is " + monthlyPayment + ".");
		}
	}

	public static void main(String[] args) {
		CarLoan Jim = new CarLoan();
		Jim.initialCheck();
	}
	
}