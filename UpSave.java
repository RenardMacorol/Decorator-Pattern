
public class UpSave implements BankAccountDecorator {
	private BankAccount bankAccount;
	private SavingsAccount savingsAccount;

	UpSave(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	@Override
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String showAccountType() {
		return "UpSave";
	}

	public Double getInterestRate() {
		return 0.04;
	}

	public String showBenefits() {
		return savingsAccount.showBenefits() + ", With Insurance";
	}

	public Double computeBalanceWithInterest() {
		return savingsAccount.getBalance() + (savingsAccount.getBalance() * getInterestRate());
	}

	public String showInfo() {
		return "Account number: " + savingsAccount.getAccountNumber() + "\n" +
				"Account name: " + savingsAccount.getAccountName() + "\n" +
				"Balance: " + savingsAccount.getBalance() + "\n";
	}

}
