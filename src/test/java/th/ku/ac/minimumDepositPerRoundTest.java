package th.ku.ac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class minimumDepositPerRoundTest {
    @Test
    void deposit_Less_Than_Minimum_Deposit_Result_Should_Be_False() {
        boolean expectedResult = false;
        Agent agent = new Agent();
        float depositCash = 99.00f;

        boolean actualResult = agent.checkMinimumDepositPerRound(depositCash);

        assertEquals(actualResult,expectedResult);
    }
    @Test
    void deposit_Equal_To_Minimum_Deposit_Result_Should_Be_True() {
        boolean expectedResult = true;
        Agent agent = new Agent();
        float depositCash = 100.00f;

        boolean actualResult = agent.checkMinimumDepositPerRound(depositCash);

        assertEquals(actualResult,expectedResult);
    }
    @Test
    void deposit_More_Than_Minimum_Deposit_Result_Should_Be_True() {
        boolean expectedResult = true;
        Agent agent = new Agent();
        float depositCash = 101.00f;

        boolean actualResult = agent.checkMinimumDepositPerRound(depositCash);

        assertEquals(actualResult,expectedResult);
    }
}