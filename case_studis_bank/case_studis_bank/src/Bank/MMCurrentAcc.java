package Bank;

public class MMCurrentAcc extends CurrentAcc{
	
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float credirLimit) {
		super(accNo, accNm, accBal, credirLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float amt) {
		if (amt > 0) 
		{
			if (amt <= (getAccBal() + getCredirLimit())) 
			{
				super.withdraw(amt);
			}
			else 
			{
				
			}
		} 
		else 
		{
			
		}
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getAccNm()=" + getAccNm() + ", getAccNo()="
				+ getAccNo() + ", getAccBal()=" + getAccBal() + "]";
	}
}
