package eu.sig.training.ch04;

import eu.sig.training.ch04.Money;

// tag::SavingsAccount[]
public class SavingsAccount {
    CheckingAccount registeredCounterAccount;

    public Transfer makeTransfer(String counterAccount, Money amount)
        throws BusinessException {

        int sum = AccountUtil.validateAccount(counterAccount);

        if (sum % 11 == 0) {
            Transfer result = AccountUtil.createTransfer(counterAccount, amount);

            if (result.getCounterAccount().equals(this.registeredCounterAccount)) 
            {
                return result;
            } else {
                throw new BusinessException("Counter-account not registered!");
            }

        } else {
            throw new BusinessException("Invalid account number!!");
        }
    }
}
// end::SavingsAccount[]
