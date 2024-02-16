package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.println("Number: ");
		int number = sc.nextInt();
		System.out.println("Holder: ");
		String holder = sc.nextLine();
		sc.next();
		System.out.println("Initial balance: ");
		double initial_balance = sc.nextDouble();
		System.out.println("Withdraw limit: ");
		double limit_withdraw = sc.nextDouble();
		
		Account account = new Account(number, holder, initial_balance, limit_withdraw);
		
		System.out.println();
		System.out.println("Enter amount for withdraw: ");
		double amount_withdraw = sc.nextDouble();
		
		try {
			account.withdraw(amount_withdraw);
			System.out.printf("novo saldo: %.2f%n", account.getBalance());
		
	}
		
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}

	
	}
}
