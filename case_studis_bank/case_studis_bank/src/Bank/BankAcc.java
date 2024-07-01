package Bank;
// 1. Abstract BankAcc: An abstract class to represent a bank Account

public abstract class BankAcc {
	
	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public int getAccNo() {
		return accNo;
	}

	public float getAccBal() {
		return accBal;
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}

	public BankAcc(int accNo, String accNm, float accBal) 
	{
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	private int accNo;
	private String accNm;
	private float accBal;
	
	public void withdraw(float amt)
	{
		if(amt > 0)
		{
			accBal -= amt;
		}
	}
	
	public void deposite(float amt)
	{
		if(amt > 0)
		{
			accBal += amt;
		}
	}
}
