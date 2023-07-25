package account;

/// 이숭무, 1111 , 100
public class Account {
	String accNum;
	String accName;
	int balance;
	public Account(String accNum, String accName, int balance) {
		super();
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
