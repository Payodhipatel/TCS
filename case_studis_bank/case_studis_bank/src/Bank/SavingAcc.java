package Bank;

public abstract class SavingAcc extends BankAcc{

	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	private boolean isSalaried;
	static final private float MINBAL=500.0f;

	@Override
	public void withdraw(float amt) {
		
		if(amt <= (getAccBal() - MINBAL))
		{
			//Allow Withdraw
			super.withdraw(amt);
		}
		else
		{
			//Not Allow
		}
		
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", MINBAL=" + MINBAL + "]";
	}
}
