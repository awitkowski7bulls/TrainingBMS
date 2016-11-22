package eu.sig.training.ch04.account;

import eu.sig.training.ch04.dto.Money;
import eu.sig.training.ch04.dto.Transfer;

public class AccountUtil {

    public static int validateAccount(String counterAccount) {
        int sum = 0;
        for (int i = 0; i < counterAccount.length(); i++) {
            sum = sum + (9 - i) * Character.getNumericValue(
                    counterAccount.charAt(i));
        }
        return sum;
    }

    public static Transfer createTransfer(String counterAccount, Money amount){
        CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
        Transfer result = new Transfer(this, acct, amount);
        return result;
    }

}