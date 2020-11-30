package th.ku.ac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class canDepositPerDayTest {
    @Test
    void deposit_Less_Than_Daily_Maximum_Deposit_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 30000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.canDepositPerDay(depositCash);

        assertEquals(actualResult,expectedResult);
    }
    @Test
    void deposit_Equal_To_Daily_Maximum_Deposit_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 50000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.canDepositPerDay(depositCash);

        assertEquals(actualResult,expectedResult);
    }
    @Test
    void deposit_More_Than_Daily_Maximum_Deposit_Result_Should_Be_True(){
        boolean expectedResult = false;
        Agent agent = new Agent();
        float depositCash = 55000.00f;

        boolean actualResult = agent.canDepositPerDay(depositCash);

        assertEquals(actualResult,expectedResult);
    }
}
