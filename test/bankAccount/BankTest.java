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
    public void haveABank_register2Customers_findFirstCustomer(){
        myBank.registerCustomer("abc", "xyz", "566");
        myBank.registerCustomer("bbc", "tnt", "989");

//        assertTrue(myBank.findAccount(989));

    }

}
