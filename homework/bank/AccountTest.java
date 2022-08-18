package bank;

public class AccountTest {

	public static void main(String[] args) {

		AccountClient accountClient = new AccountClient();
		Account client1 = new Account();
		Account client2 = new Account();

		accountClient.withDrawBalance(client1, 500.0);
		accountClient.depositBalance(client1, 1000.0);
		accountClient.depositBalance(client2, 300.0);
		accountClient.transfer(client2, client1, 100.0);
		accountClient.depositBalance(client2, 100.0);
	}

}
