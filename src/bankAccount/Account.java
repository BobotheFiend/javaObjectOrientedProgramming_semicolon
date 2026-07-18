package bankAccount;

public class Account {

    private int balance;
    private final String password;
    private String name;
    private String number;

    public Account (String firstName, String lastName, String accountNumber, String password){
        this.name = firstName + " " + lastName;
        this.number = accountNumber;
        this.password = password;
    }

    public int checkBalance(String password){
        validatedPin(password);
        return balance;
    }

    public void deposit(int amount){
       validateDeposit(amount);
       balance = balance + amount;
    }


    public void withdraw(String password, int amount){
        validatedPin(password);
        validateBalance(amount);
        validateWithdrawalAmount(amount);
        balance = balance - amount;
    }

    private void validateDeposit(int amount){
        boolean depositAmountIsNegative = amount < 0;
        if(depositAmountIsNegative)
            throw new IllegalArgumentException("Ole!!");
    }
    private void validatedPin(String pin){
        boolean pinDoesNotMatchAccountPin = !this.password.equals(pin);
        if(pinDoesNotMatchAccountPin)
         throw new IllegalArgumentException("Invalid Pin");
    }

    private void validateWithdrawalAmount(int amount){
        boolean withdrawalAmountIsBelowFifty = amount < 50;
        if(withdrawalAmountIsBelowFifty)
            throw new IllegalArgumentException("Amount cannot be lower Than 50");
    }

    private void validateBalance(int amount){
        boolean balanceIsNotSufficient = balance < amount;
        if(balanceIsNotSufficient) throw new IllegalArgumentException("Insufficient Balance");
    }

    public String getNumber(){
        return this.number;
    }

    public String getAccountName(){
        return this.name;
    }

}
