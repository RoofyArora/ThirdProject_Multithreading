
public class BankRunner implements Runnable {
	
	ICICIBank bank;
	
	public BankRunner(ICICIBank bank) {
		super();
		this.bank = bank;
	}

	@Override
	public void run()
	{
		try
		{
			if(Thread.currentThread().getName().equals("first"))
			{
				System.out.println("Balance = "+bank.withdrawAmount(101, 2000));
			}
			else
			{
				System.out.println("Balance = "+bank.withdrawAmount(102, 4000));
			}
		}catch(InvalidAccountNumberException i)
		{
			System.out.println("Invalid account number ");
		}
		catch(InsufficientBalanceException ibe){
			System.out.println("insufficient balance");
		}

		
	}

}
