## Project Assignment

The objective of this workshop is to use object oriented techniques to model 
bank account.

You are to implement the following commands:

### BankAccount Class

**Members:**

[X] All members are private
[X] Provide getters and setters
[X] Account holder name (String)
[] Account holder name - Read-only property. Cannot be changed once it's set
[X] Randomly generated account number (String)
[] Randomly generated account number - Read-only property. Cannot be changed once it's set
[X] Account Balance (Float). Initialise balance to 0
[X] Transactions list for operations performed on account (List of Strings)
[X] Closed to indicate if the account has been closed (Boolean)
[X] Account creation date
[X] Account closing date

**Methods:**

**Deposit**

[X] Deposit some money into the account
[X] Operation should be added to the transactions list - E.g. If $100 is added to the account, add "deposit $100 at <date time> to transaction list
[] Only accepts +ve amounts
[] If incorrect amount is given / account is closed, throw an IllegalArgumentException

**Withdraw**

[X] Withdraw some money from the account
[X] Operation should be added to the transactions list - E.g. If $100 is withdrawn to the account, add "Withdraw $100 at <date time> to transaction list

**Constructor:**

[X] First constructor has a single parameter which is the account holder's name. 
[X] Second constructor has 2 parameters: account holder's name + initial account balance


### FixedDeposit Class

**Members & Methods:**

[X] Same methods and members as BankAccount class

**Members:**

[X] Interest (Float) - Default = 3. Can be changed once
[X] Duration in months (Integer) - Default = 6. Can be changed once
[] Any subsequent attempt to change Interest & Duration will result in an IllegalArgumentException thrown

**Methods:**

[] Withdraw will not update account's balance. It will perform a NOP (no operation)
[] Deposit will not update account's balance. It will perform a NOP (no operation)
[] getBalance() will return the balance + interest - E.g. if interest = 3, and balance = 100, the getBalance() = 103.

**Constructor:**

[X] public FixedDepositAccount (String name, Float balance)

[X] public FixedDepositAccount (String name, Float balance, Float interest)

[X] public FixedDepositAccount (String name, Float balance, Float interest, Integer duration)


## UUID

UUIDs are generally used for identifying information that needs to be unique within a system or network thereof. 

Their uniqueness and low probability in being repeated makes them useful for being associative keys in databases and identifiers for physical hardware within an organization

How to generate UUID: https://www.uuidgenerator.net/dev-corner/java

## Read-only property

- Use the final keyword in Java


## Java Constructors

A constructor in Java is a special method that is used to initialize objects. 

The constructor is called when an object of a class is created. It can be used to set initial values for object attributes


More info on constructors: https://www.w3schools.com/java/java_constructors.asp 


## Fixed Deposit Class

- The FixedDeposit class (subclass) inherits attributes and methods from the BankAccount (superclass)