package revision.core;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class BankAccount {
    //? Members
    private String name = "";
    private String accountId = UUID.randomUUID().toString();
    private float balance = 0;
    private List <String> transactions = new LinkedList<>();
    private boolean closed = false;
    private Date accountCreated = new Date();
    private Date accountClosed = new Date();

    //? Getter & Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public float getBalance() {
        return balance * .0001f;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public List<String> getTransactions() {
        return transactions;
    }
    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }
    public boolean isClosed() {
        return closed;
    }
    public void setClosed(boolean closed) {
        this.closed = closed;
    }
    public Date getAccountCreated() {
        return accountCreated;
    }
    public void setAccountCreated(Date accountCreated) {
        this.accountCreated = accountCreated;
    }
    public Date getAccountClosed() {
        return accountClosed;
    }
    public void setAccountClosed(Date accountClosed) {
        this.accountClosed = accountClosed;
    }

    //? Constructor
    public BankAccount(String name) {
        this.name = name;
    }

    public BankAccount (String name, float initialBalance) {
        this.name = name;
        this.balance = initialBalance;
    }

    //? Methods
    public void deposit(Integer depositAmount, Date currentDateTime) {
        String depositTransaction = ("Deposit $" + depositAmount + " at " + currentDateTime + "\n");
        transactions.add(depositTransaction);
        System.out.print(depositTransaction);
    }

    public void withdraw(Integer withdrawAmount, Date currentDateTime) {
        String withdrawTransactions = ("Withdraw $" + withdrawAmount + " at " + currentDateTime + "\n");
        transactions.add(withdrawTransactions);
        System.out.print(withdrawTransactions);
    }

    public void list() {
        System.out.printf("List of Transactions: " + transactions + "\n");
    }
    
}
