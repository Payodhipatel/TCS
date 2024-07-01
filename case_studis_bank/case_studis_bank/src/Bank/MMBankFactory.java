package Bank;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		// TODO Auto-generated method stub
		return new MMSavingAcc(accNo, accNm, accBal, isSalaried);
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
	}

}
