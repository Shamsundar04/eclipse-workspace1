package java9.privatemethod;

import java.time.LocalDateTime;
import java.util.UUID;

// Interface defining reusable helpers and default methods
interface TransactionService {

    // Default method: can be called by implementing classes
    default void deposit(String accountNo, double amount) {
        if (!validateAmount(amount)) return;
        System.out.println("Deposited " + amount + " to account " + accountNo);
        logTransaction(accountNo, amount, "DEPOSIT");
    }

    default void withdraw(String accountNo, double amount) {
        if (!validateAmount(amount)) return;
        System.out.println("Withdrawn " + amount + " from account " + accountNo);
        logTransaction(accountNo, amount, "WITHDRAW");
    }

    // Private helper: reused in multiple default methods
    private boolean validateAmount(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero!");
            return false;
        }
        return true;
    }

    // Private static helper: used for logging in all transactions
    private static void logTransaction(String accountNo, double amount, String type) {
        String txnId = generateTransactionId();
        System.out.println("[LOG] " + type + " | Account: " + accountNo + " | Amount: " + amount
                + " | TxnID: " + txnId + " | Time: " + LocalDateTime.now());
    }

    // Private static helper: generates unique transaction IDs
    private static String generateTransactionId() {
        return UUID.randomUUID().toString();
    }

    // Public static method: utility accessible without creating an object
    static void showWelcomeMessage() {
        System.out.println("Welcome to the Banking System!");
    }
}

// Implementation class
class BankAccount implements TransactionService {
    private String accountNo;

    BankAccount(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountNo() {
        return accountNo;
    }
}

// Test class
public class Transaction {
    public static void main(String[] args) {
        TransactionService.showWelcomeMessage(); // Call static utility

        BankAccount account = new BankAccount("ACC12345");
        account.deposit(account.getAccountNo(), 500);
        account.withdraw(account.getAccountNo(), 200);
        account.withdraw(account.getAccountNo(), -50); // invalid amount
    }
}

