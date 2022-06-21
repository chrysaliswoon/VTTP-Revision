package revision.core;

public class FixedDeposit extends BankAccount {
    //? Members
    private float interest = 3;
    private Integer duration = 6;

    //? Constructor
    public FixedDeposit (String name, float balance) {
        super (name, balance);
    }

    public FixedDeposit (String name, float balance, float interest) {
        super (name, balance);
        this.interest = interest;
    }

    public FixedDeposit (String name, float balance, float interest, Integer duration) {
        this(name, balance, interest);
        this.duration = duration;
    }

    //? Methods
    public void withdraw () {

    }

    public void deposit () {

    }

    
}