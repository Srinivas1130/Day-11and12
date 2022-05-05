package com.bridgelabz.day11and12;
import java.util.Scanner;

public class Account{
	Scanner scanner = new Scanner(System.in);

	public  void debit(int accBalance){
		System.out.println("Account Balance is.. : " + accBalance);
		System.out.println("Enter amount to debit : ");
		int debitamount = scanner.nextInt();
		int balanceamount = accBalance - debitamount;

		if( debitamount <= accBalance) {
			System.out.println("Money " + debitamount + " is Debited from Account ");
			System.out.println("Your BALANCE is "+balanceamount);
		}else{
			System.out.println("You tried to Debit amount " + debitamount + " it is exceeded the current "
					+ "account balance " + accBalance);
		}
		System.out.println("Transaction Completed....");
	}

	public  void credit(int accBalance){
		System.out.println("Account Balance is.. : " + accBalance);
		System.out.println("Enter amount to credit : ");
		int creditamount = scanner.nextInt();
		int balanceamount = accBalance + creditamount;
		System.out.println("Amount "+ creditamount + " is credited and Total Account balance is " + balanceamount);
		System.out.println("Transaction Completed....");
	}

	public  void accbalance(int accBalance){
		System.out.println("Total Balance amount is.. : " + accBalance);
		System.out.println("Transaction Completed....");
	}
	public static void main(String[] args) {
		Account account = new Account();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount");
		int accBalance = scanner.nextInt();
		System.out.println("Enter your option : Account balance -> A Credit -> C Debit -> D"); 
		String ch = scanner.next();

		switch(ch){
		case "A":
			account.accbalance(accBalance);
			break;
		case "C":
			account.credit(accBalance);
			break;
		case "D":
			account.debit(accBalance);
			break;
		default:
			System.out.println("You are not performed any Transaction");
			break;
		}
		System.out.println("Thank you!! for using HDFC Bank service");
	}
}




