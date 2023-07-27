package Bank;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3:예금 | 4.출금 | 5.종료 ");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			scanner.nextLine();
			if(selectNo == 1) {createAccount();	}
			else if(selectNo == 2) {accountList();}
			else if(selectNo == 3) {deposit();}
			else if(selectNo == 4) {withdraw();}
			else if(selectNo == 5) {run = false;}
		}
	}
	private static Account findAccount(String ano) {
		Account acc = null;
		for(Account acc1 : accountArray) {
			if(acc1 == null) break;
			if(acc1.getAno().equals(ano)) {
				acc=acc1;
			}
		}
		return acc;
	}
	private static void withdraw() {
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		System.out.print("예금액 : ");
		String balance = scanner.nextLine();
		Account acc = findAccount(ano);
		int money = Integer.parseInt(acc.getBalance()) 
				  - Integer.parseInt(balance);
		acc.setBalance(String.valueOf(money));
	}
	private static void deposit() {
		System.out.println("-------");
		System.out.println("입금");
		System.out.println("-------");
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		System.out.print("예금액 : ");
		String balance = scanner.nextLine();
		Account acc = findAccount(ano);
		int money = Integer.parseInt(acc.getBalance()) 
				  + Integer.parseInt(balance);
		acc.setBalance(String.valueOf(money));
	}
	private static void accountList() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		for(Account  acc : accountArray) {
			if(acc == null) break;
			System.out.println(acc.getAno()+"\t"
		                      +acc.getOwner()+"\t"
		                      +acc.getBalance());	
		}
	}
	private static void createAccount() {
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		System.out.print("계좌주");
		String owner =  scanner.nextLine();
		System.out.print("초기입금액 : ");
		String balance = scanner.nextLine();
		Account acc = new Account(ano, owner, balance);
		accountArray[idx++] = acc;
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}
}


