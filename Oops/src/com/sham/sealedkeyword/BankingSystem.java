package com.sham.sealedkeyword;

sealed class Account permits SavingsAccount, CurrentAccount, LoanAccount {}

final class SavingsAccount extends Account {}
final class CurrentAccount extends Account {}
non-sealed class LoanAccount extends Account {} // Open for future subt-ypes
class AccountService {
    public void process(Account account) {
        switch (account) {
            case SavingsAccount s -> System.out.println("Process savings");
            case CurrentAccount c -> System.out.println("Process current");
            case LoanAccount l -> System.out.println("Process loan");
		default -> throw new IllegalArgumentException("Unexpected value: " + account);
        }
    }
}


public class BankingSystem {
	
	public static void main(String[] args) {
		new AccountService().process(new SavingsAccount());
	}

}
