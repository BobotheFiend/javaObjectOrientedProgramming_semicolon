package bankAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    private Account nnamdi;

    @BeforeEach
    public void setUp(){
        String correctPassword = "@OwoLabi99";
        nnamdi = new Account("firstName", "lastname", "234", correctPassword);
    }

    @Test
    public void deposit2000InMyAccount_balanceIs2000Test(){
        //When
        assertEquals(0, nnamdi.checkBalance("@OwoLabi99"));
    }

    @Test
    public void depositAmountIs2000_balanceIs2000Test(){
        nnamdi.deposit(2000);
        assertEquals(2000, nnamdi.checkBalance("@OwoLabi99"));
    }

    @Test
    public void depositTwiceWith1000And500_balanceIs1500Test(){
        nnamdi.deposit(1000);
        nnamdi.deposit(500);
        assertEquals(1500, nnamdi.checkBalance("@OwoLabi99"));
    }

    @Test
    public void depositMinus1000_balanceRemains0Test(){
        assertThrows(IllegalArgumentException.class, ()-> nnamdi.deposit(-1000));
        assertEquals(0, nnamdi.checkBalance("@OwoLabi99"));
    }

    @Test
    public void depositAmountIs5000_withdrawalAmountIs2000_balanceBecomes3000Test(){
        nnamdi.deposit(5000);
        nnamdi.withdraw("@OwoLabi99",2000);
        assertEquals(3000, nnamdi.checkBalance("@OwoLabi99"));
    }

    @Test
    public void balanceIs0_withdrawalAmounts2000_throwsErrorMessageAndBalanceRemains0Test(){
        assertThrows(IllegalArgumentException.class, ()-> nnamdi.withdraw("@OwoLabi99",2000));
        assertEquals(0, nnamdi.checkBalance("@OwoLabi99"));
    }

    @Test
    public void balanceIs0_withdrawalAmountIsMinus800_throwsErrorMessageAndBalanceRemains0Test(){
        assertThrows(IllegalArgumentException.class, ()-> nnamdi.withdraw("@OwoLabi99",-800));
        assertEquals(0, nnamdi.checkBalance("@OwoLabi99"));

    }

    @Test
    public void deposit10000_withdraw3500_balanceIs6500Test(){
        //When
        nnamdi.deposit(10000);

        nnamdi.withdraw("@OwoLabi99", 3500);

        //Check that
        assertEquals(6500, nnamdi.checkBalance("@OwoLabi99"));
    }

    @Test
    public void deposit3000_whenAccountInputsTheWrongPinToWithdraw2000_throwAnErrorMessageTestAndBalanceRemains3000(){
        //When
        nnamdi.deposit(3000);

        //Check that
        assertThrows(IllegalArgumentException.class, ()-> nnamdi.withdraw("@Owolwbi19", 2000));
        assertEquals(3000, nnamdi.checkBalance("@OwoLabi99"));
    }

}
