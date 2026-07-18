package bankAccount;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private int count;
    private String name;
    private List<Account> accounts;

    public Bank(String bankName){
        this.name = bankName;
        this.accounts = new ArrayList<>();
    }

    public Account registerCustomer(String firstName, String lastName, String pin){
        String accountNumber = getAccountNumber();
        Account customer = new Account(firstName, lastName, accountNumber, pin);
        this.accounts.add(customer);
        return customer;
    }

    private void generateAccountNumber(){
        ++count;
    }

    private String getAccountNumber() {
        generateAccountNumber();
        return this.count + "";
    }

    public int getSize(){
        return accounts.size();
    }

    public Account findAccount(String accountNumber){
        for(Account account : this.accounts) {
            if (account.getNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new IllegalArgumentException("Account Not Found!!");
    }

    public void removeAccount(String accountNumber, String accountName){
        Account customer = findAccount(accountNumber);
        if(accountName.equals(customer.getAccountName()))
            this.accounts.remove(customer);

        else
            throw new IllegalArgumentException("Account is not available");
    }

    public void deposit(int amountToDeposit, String accountNumber) {
        Account customerAccount = findAccount(accountNumber);
        customerAccount.deposit(amountToDeposit);
    }

    public int checkBalance(String accountNumber, String password){
        Account customersAccount = findAccount(accountNumber);
        return customersAccount.checkBalance(password);

    }

    public void withdraw(int amountToWithdraw, String accountNumber, String pin){
        Account customer = findAccount(accountNumber);
        customer.withdraw(pin, amountToWithdraw);
    }

    public void transfer(String senderAccountNumber, int amountToSend, String receiverAccountNumber, String password){
        Account sender = findAccount(senderAccountNumber);
        Account receiver = findAccount(receiverAccountNumber);

        sender.withdraw(password, amountToSend);

        receiver.deposit(amountToSend);
    }
}
