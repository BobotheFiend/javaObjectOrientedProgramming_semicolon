package bankAccount;


public class Atm {
    public static void main(String... args) {
        goToMainMenu();
    }

    private static Bank nadisBank = new Bank("Nadis");

    private static void goToMainMenu(){
        print("""
                    NADIS A T M 
                1. Create Account
                2. Deposit
                3. Withdrawal
                4. Check Balance
                5. Transfer
                6. Remove Account
                0. Exit
                """);

        int userChoice = Integer.parseInt(input("Enter your choice: "));

        switch(userChoice){

            case 1 -> createAnAccount();
            case 2 -> deposit();
            case 3 -> withdraw();
            case 4 -> checkBalance();
            case 5 -> transfer();
            case 6 -> removeAccount();
            case 0 -> exit();
            default -> wrongInput();

        }

    }

    private static void createAnAccount() {

        print("---- Welcome to NADIS Bank ----");
        String firstName = input("Enter your FirstName: ");
        String lastName = input("Enter your LastName: ");
        String createdPin = input("Create a 4 digit pin: ");

        Account newCustomer = nadisBank.registerCustomer(firstName, lastName, createdPin);
        print("Welcome aboard " + newCustomer.getAccountName() + " \n\tYour Account number is " + newCustomer.getNumber());
        goToMainMenu();
    }

    private static void deposit(){

        print("How much would you Deposit today!");
        try {

            String accountNumber = input("Enter your Account Number: ");
            String amount = input("How much would you like to deposit: ");
            int getAmountAsInt = Integer.parseInt(amount);
            nadisBank.deposit(getAmountAsInt, accountNumber);

            print("Thank you for your Time!");
            goToMainMenu();
        }
        catch (IllegalArgumentException error) {
            print("ERROR!!");
            goToMainMenu();
        }
    }

    private static void withdraw(){

        print("How much would you like to withdraw today");

        try {
            int amountToWithDraw = Integer.parseInt(input("Enter amount: "));
            String accountNumber = input("Enter your Account Number: ");
            String pin = input("Enter your 4 digit pin: ");

            nadisBank.withdraw(amountToWithDraw, accountNumber, pin);

            print("Successful!\n\t\tThank you for chossing NADIS Bank");
            goToMainMenu();
        }
        catch (IllegalArgumentException error){
            print("Error!!");
            goToMainMenu();
        }
    }

    private static void transfer(){

        print("What account would you like to transfer to today!");

        try {
            String userAccountNumber = input("Enter your account number: ");
            int amountSent = Integer.parseInt(input("Enter the amount: "));
            String receiverAccountNumber = input("Enter receiver account number: ");
            String userPassword = input("Enter your password: ");

            nadisBank.transfer(userAccountNumber, amountSent, receiverAccountNumber, userPassword);

            print("Transfer Successful!!\n\t\tThank you for choosing NADIS Bank");
            goToMainMenu();
        } catch (IllegalArgumentException error) {
            print("ERROR!!! Transfer Was Not Successful!");
            goToMainMenu();
        }
    }

    private static void checkBalance(){

        print("Hello there!");

        try {
            String accountNumber = input("Enter your account number: ");
            String password = input("Enter your password: ");
            int balance = nadisBank.checkBalance(accountNumber, password);

            print("Your balance is: " + balance);
            goToMainMenu();
        }
        catch (IllegalArgumentException error) {
            print("Incorrect Pin!!");
            goToMainMenu();
        }
    }

    private static void removeAccount(){

        try {
            print("Remove Your Account");

            String accountNumber = input("Enter Account number: ");
            String accountName = input("Enter AccountName: ");

            nadisBank.removeAccount(accountNumber, accountName);
            print("Account Sucessfully Removed!!");
            goToMainMenu();
        }
        catch (IllegalArgumentException  error) {
            goToMainMenu();
        }
    }


    private static void exit(){

        print("GoodBye!!!");
    }

    private static void wrongInput(){

        print("Wrong choice!!");
        goToMainMenu();
    }

    private static void print(String message) {

        System.out.println(message);
    }

    private static String input(String message) {

        print(message);
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        return inputCollector.nextLine();
    }

}