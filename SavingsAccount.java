
public class SavingsAccount implements BankAccount {
	private int accountNumber;
	private String accountName;
	private Double balance;

	public SavingsAccount() {
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String showAccountType() {
		return "Savings Account";
	}

	@Override
	public Double getInterestRate() {
		return 0.01;
	}

	@Override
	public String showBenefits() {
		return "Standard Savings Account";
	}

	@Override
	public Double computeBalanceWithInterest() {
		return balance + (balance * getInterestRate());
	}

	@Override
	public String showInfo() {
		return "Account number: " + accountNumber + "\n" +
				"Account name: " + accountName + "\n" +
				"Balance: " + balance + "\n";
	}

}
