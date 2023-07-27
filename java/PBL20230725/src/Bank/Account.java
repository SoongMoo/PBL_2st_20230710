package Bank;
public class Account {
	private String ano;
	private String owner;
	private String balance;
	public Account(String ano, String owner, String balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno() {return ano;	}
	public void setAno(String ano) {this.ano = ano;}
	public String getOwner() {	return owner;	}
	public void setOwner(String owner) {this.owner = owner;	}
	public String getBalance() {return balance;	}
	public void setBalance(String balance) {this.balance = balance;	}
}
