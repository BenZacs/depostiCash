package th.ku.ac;


import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class Agent {
    static float depositMaximumPerRound = 30000.00F;
    static float depositMaximumPerDay = 50000.00F;
    static float depositMinimumPerRound = 100.00F;

    public static boolean canDepositPerRound(float deposit_cash){
        if (deposit_cash <= depositMaximumPerRound){
            return true;
        }
        return false;
    }
    public boolean canDepositPerDay(float depositCash) {
        if (depositCash <= depositMaximumPerDay){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean checkMinimumDepositPerRound(float depositCash) {
        if(depositMinimumPerRound <= depositCash){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean checkValidAccount(String accountNumber) {
        if(!getInvalidAccountList().contains(accountNumber)){
            return true;
        }
        else{
            return false;
        }
    }
    private List<String> getInvalidAccountList(){
        List<String> inValidAccountList = Arrays.asList("0160260439","5372946598");
        return inValidAccountList;
    }


}

