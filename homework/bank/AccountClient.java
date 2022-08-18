package bank;

public class AccountClient {

	double depositCost = 5;

	public void withDrawBalance(Account account, double amount) {

		if (amount > account.getBalance()) {
			System.out.println("Yetersiz bakiye!");
		} 
		else {
			printInfo(account);
			account.setBalance(account.getBalance() - amount);
			System.out.println("Cekilen miktar: " + amount);
			System.out.println("Para cekme islemi basarili");
			printInfo(account);			
		}
		System.out.println("------------------------------");
	}

	public void depositBalance(Account account, double amount) {
		printInfo(account);
		account.setBalance(account.getBalance() + amount);
		System.out.println("Yatirilacak miktar: " + amount);
		System.out.println("Para yatirma islemi basarili");
		printInfo(account);
		System.out.println("------------------------------");
	}

	public void transfer(Account client1, Account client2, double amount) {
		if (client1.getBalance() < (amount + depositCost)) {
			printInfo(client1);
			System.out.println("Havale yapilmak istenen miktar: " + amount);
			System.out.println("Havale icin yetersiz bakiye!");
		} 
		else {
			printInfo(client1);
			client1.setBalance(client1.getBalance() - (amount + depositCost));
			System.out.println("Eski bakiye: " + client2.getBalance());
			client2.setBalance(client2.getBalance() + amount);
			System.out.println("Havale masrafi: " + depositCost);
			System.out.println("Havale miktari: " + amount);
			System.out.println("Havale islemi basarili");
			printInfo(client1);
		}
		System.out.println("------------------------------");
	}

	public void printInfo(Account account) {
		System.out.println("Bakiyeniz: " + account.getBalance());
		System.out.println("------------------------------");
	}
}
