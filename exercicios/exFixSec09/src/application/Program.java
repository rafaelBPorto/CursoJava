package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numberAccount;
		String holder;
		char change;
		double balance = 0;
		double amount;
		
		Account account;
		
		System.out.print("Enter account number: ");
		numberAccount = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		holder = sc.nextLine();
		System.out.print("Is ther an initial deposit value (y/n)?  ");
		change = sc.next().charAt(0);
		if (change == 'y') {
			System.out.print("Enter initial desposit value: ");
			balance = sc.nextDouble();
			account = new Account (numberAccount, holder, balance);
		}else {
			account = new Account(numberAccount, holder);
		}
		
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		amount = sc.nextDouble();
		account.deposit(amount);
		
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.whitdraw(amount);
		
		sc.close();
				
	}

}
