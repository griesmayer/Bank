public class BankAccount {
	private int accountId;
	private String name;
	private double amount;
	private int creditLimit;
	
	public int getCreditLimit() {
		return creditLimit;
	}
	
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
