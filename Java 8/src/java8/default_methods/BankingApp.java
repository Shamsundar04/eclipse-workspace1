package java8.default_methods;

interface AuditLogger {
	default void logTransaction(String txnId) {
		System.out.println("Audit log: Transaction " + txnId + " recorded for security audit.");
	}
}

interface ComplianceLogger {
	default void logTransaction(String txnId) {
		System.out.println("Compliance log: Transaction " + txnId + " recorded for regulatory compliance.");
	}
}

class TransactionService implements AuditLogger, ComplianceLogger {

	@Override
	public void logTransaction(String txnId) {
		// Conflict resolution: call both explicitly
		AuditLogger.super.logTransaction(txnId);
		ComplianceLogger.super.logTransaction(txnId);
	}

	public void processTransaction(String txnId, double amount) {
		System.out.println("Processing transaction " + txnId + " for amount $" + amount);
		logTransaction(txnId);
	}
}

public class BankingApp {
	public static void main(String[] args) {
		TransactionService txnService = new TransactionService();
		txnService.processTransaction("TXN98765", 5000.00);
	}
}