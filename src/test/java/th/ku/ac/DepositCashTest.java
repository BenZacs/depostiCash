package th.ku.ac;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class DepositCashTest {
    @Test
    void deposit_less_than_30000_Result_should_be_True(){
        // Arrange
        boolean expectedResult = true;
        float depositCash = 5000.00f;
        Agent agent = new Agent();
        // Act
        boolean actualResult = Agent.canDepositPerRound(depositCash);
        // Assert
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void deposit_equal_to_30000_Result_should_be_True(){
        // Arrange
        boolean expectedResult = true;
        float depositCash = 30000.00f;
        Agent agent = new Agent();
        // Act
        boolean actualResult = Agent.canDepositPerRound(depositCash);
        // Assert
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void deposit_more_than_30000_Result_should_be_True(){
        // Arrange
        boolean expectedResult = false;
        float depositCash = 32000.00f;
        Agent agent = new Agent();
        // Act
        boolean actualResult = Agent.canDepositPerRound(depositCash);
        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
