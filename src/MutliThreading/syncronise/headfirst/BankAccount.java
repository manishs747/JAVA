package MutliThreading.syncronise.headfirst;

public class BankAccount {
	private int balance = 100;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		this.balance = this.balance - amount;
	}
}
