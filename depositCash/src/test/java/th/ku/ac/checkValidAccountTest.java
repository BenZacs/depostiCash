package th.ku.ac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class checkValidAccountTest {
    @Test
    void check_Valid_Account_Result_Should_Be_True(){
        boolean expectedResult = true;
        Agent agent = new Agent();
        String accountNumber = "3456789012";

        boolean actualResult = agent.checkValidAccount(accountNumber);

        assertEquals(actualResult,expectedResult);
    }
    @Test
    void check_Suspended_Account_Result_Should_Be_False(){
        boolean expectedResult = false;
        Agent agent = new Agent();
        String accountNumber = "5372946598";

        boolean actualResult = agent.checkValidAccount(accountNumber);

        assertEquals(actualResult,expectedResult);
    }
}
