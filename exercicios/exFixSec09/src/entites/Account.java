package entites;

public class Account {
	
	private int accountNumber;
	private String holder;
	private double balance;
	
	public Account(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}
	
	public Account(int accountNumber, String holder, double balance) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber () {
		return accountNumber;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Updated account data:");
		System.out.println(toString());

	}
	
	public void whitdraw(double amount) {
		balance -= amount + 5;
		System.out.println("Updated account data: ");
		System.out.println(toString());
	}
	public  String toString() {
		return "Account " +
				accountNumber +
				", Holder: " +
				String.format(holder) +
				", Balance: $ " +
				String.format("%.2f", balance);
	}
	
	
	

}