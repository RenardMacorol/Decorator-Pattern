public class GSave implements BankAccountDecorator {
	private BankAccount bankAccount;
	private SavingsAccount savingsAccount;

	GSave(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	@Override
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String showAccountType() {
		return "GSave";
	}

	public Double getInterestRate() {
		return 0.025;
	}

	public String showBenefits() {
		return savingsAccount.showBenefits() + ", GCash Transfer";
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
