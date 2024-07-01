package Bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a. Assign instance of MMBankFactory to BankFactory reference
		BankFactory bf = new MMBankFactory();
		
		//b. Instantiate MMSavingAcc and refer it through reference SavingAcc
		SavingAcc sv_acc = bf.getNewSavingAcc(4201, "payodhi",8000, true);
		
		//c. Instantiate MMCurrentAcc and refer it through reference CurrentAcc
		CurrentAcc cu_acc = bf.getNewCurrentAcc(75102, "payal", 9800,90000);
		
		//d. Invoke withdraw() method.
		//e. Invoke toString() method
		
		sv_acc.withdraw(1000);
		cu_acc.withdraw(1500);
		
		System.out.println("Saving Acc : "+sv_acc.toString());
		System.out.println("===============================================");
		System.out.println("Current Acc : "+cu_acc.toString());
	}

}
