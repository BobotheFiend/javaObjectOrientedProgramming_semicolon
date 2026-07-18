package bankAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankTest {

    Bank myBank;
    @BeforeEach
    public void setUp(){
        myBank = new Bank("UBA");
    }

    @Test
    public void createMyBank_accountListIsZeroTest(){
        Bank myBank = new Bank("UBA");

        assertEquals(0, myBank.getSize());
    }

    @Test
    public void createMyBank_registerCustomer_sizeIs1Test(){
        Bank bankOne = new Bank("UBA");

        bankOne.registerCustomer("nn", "bb", "090");
        assertEquals(1, bankOne.getSize());
    }

    @Test
    public void createMyBank_register2Customer_accountSizeIs2Test(){
        Bank bankOne = new Bank("UBA");

        bankOne.registerCustomer("nn", "bb", "090");
        assertEquals(1, bankOne.getSize());

        bankOne.registerCustomer("abc", "xyz", "566");
        assertEquals(2, bankOne.getSize());
    }

    @Test
    public void haveABank_register2Customers_finddSecondCustomerTest(){
        Account abc = myBank.registerCustomer("abc", "xyz", "566");
        Account bbc = myBank.registerCustomer("bbc", "tnt", "989");

        assertEquals(bbc, myBank.findAccount("2"));

    }
    @Test
    public void haveABank_register4Customers_findFirstAndThirdCustomerTest(){
        Account abc = myBank.registerCustomer("abc", "xyz", "566");
        Account bbc = myBank.registerCustomer("bbc", "tnt", "989");
        Account ckc = myBank.registerCustomer("ckc", "indeed", "567");
        Account bbd = myBank.registerCustomer("bbd", "yrt", "987");

        assertEquals(abc, myBank.findAccount("1"));
        assertEquals(ckc, myBank.findAccount("3"));

    }

    @Test
    public void register2persons_accountOneDeposit5000_withdraw2000_balanceIs3000Test(){
        myBank.registerCustomer("abc", "xyz", "566");
        myBank.registerCustomer("bbc", "tnt", "989");


        myBank.deposit(5000, "1");

        myBank.withdraw(2000, "1", "566");

        assertEquals(3000, myBank.checkBalance("1", "566"));
    }

    @Test
    public void register2Account_deposit5000infirstAccount_transfer1700ToAccountTwo_balanceIs3300And1700(){
        myBank.registerCustomer("abc", "xyz", "566");
        myBank.registerCustomer("bbc", "tnt", "989");


        myBank.deposit(5000, "1");

        myBank.transfer("1", 1700, "2", "566");

        assertEquals(3300, myBank.checkBalance("1", "566"));
        assertEquals(1700, myBank.checkBalance("2", "989"));
    }

    @Test
    public void register3Accounts_removeThirdAccount_sizeOfAccounts2Test(){

        myBank.registerCustomer("ckc", "indeed", "567");
        myBank.registerCustomer("cki", "indeed","667");
        Account bbc = myBank.registerCustomer("bbc", "tnt", "989");

        assertEquals(3, myBank.getSize());

        myBank.removeAccount(bbc.getNumber(), bbc.getAccountName());

        assertEquals(2, myBank.getSize());
    }
}
