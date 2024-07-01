package Bank;

public class MMSavingAcc extends SavingAcc{
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void withdraw(float amt) {
		// TODO Auto-generated method stub
		super.withdraw(amt);
	}

	static final private float MINBAL = 500.0f;

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getAccNm()=" + getAccNm() + ", getAccNo()="
				+ getAccNo() + ", getAccBal()=" + getAccBal() + "]";
	}
}
