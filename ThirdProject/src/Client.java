
public class Client {

	public static void main(String[] args) {
		ICICIBank bank = new ICICIBank();
		
		System.out.println(bank.createAccount(101, 3000));
		System.out.println(bank.createAccount(102, 3000));
		
		BankRunner bankRunner = new BankRunner(bank);
		
		Thread firstThread=new Thread(bankRunner,"first");
		firstThread.start();
		
		Thread secondThread=new Thread(bankRunner,"second");
		secondThread.start();

	}

}
