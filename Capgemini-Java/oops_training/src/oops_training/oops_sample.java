package oops_training;

interface PaymentGateway{
	void processPayment(double amount);
	void validatePayment();
}
abstract class Bank implements PaymentGateway{
	String bankName;
	public Bank(String bankName) {
		this.bankName = bankName;
	}
	void showBankName() {
		System.out.println("Bank "+bankName);
	}
	public void validatePayment() {
		System.out.println("Performing standard KYC and fraud check.");
	}
}
class HDFCBank extends Bank{
	public HDFCBank() {
		super("HDFC Bank");
	}

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing " +amount+ " through HDFC net Banking");
	}
	
}
class ICICBank extends Bank{
	public ICICBank(){
		super("ICIC Bank");
	}

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing " +amount+ " through ICIC");
	}
	
}
public class oops_sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank u1 = new HDFCBank();
		u1.showBankName();
		u1.validatePayment();
		u1.processPayment(5000);
		
		System.out.println();
		
		Bank u2 = new ICICBank();
		u2.showBankName();
		u2.validatePayment();
		u2.processPayment(2000);
		
		System.out.println();
		

	}

}
