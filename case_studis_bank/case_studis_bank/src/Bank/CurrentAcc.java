package Bank;

public abstract class CurrentAcc extends BankAcc{
	
	private float credirLimit;


	@Override
	public String toString() {
		return "CurrentAcc [credirLimit=" + credirLimit + "]";
	}

	public CurrentAcc(int accNo, String accNm, float accBal, float credirLimit) {
		super(accNo, accNm, accBal);
		this.credirLimit = credirLimit;
	}
	
	public float getCredirLimit() {
		return credirLimit;
	}

	@Override
	public void withdraw(float amt) 
	{
		if (amt > 0) 
		{
	        if (amt <= (getAccBal() + credirLimit)) 
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

}
