package eu.sig.training.ch04;

import eu.sig.training.ch04.Money;

// tag::CheckingAccount[]
public class CheckingAccount {
    private int transferLimit = 100;

    public Transfer makeTransfer(String counterAccount, Money amount)
        throws BusinessException {

        checkWithdrawalLimit(amount);

        AccountUtil.validateAccount(counterAccount);

        if (sum % 11 == 0) {
            return AccountUtil.createTransfer(counterAccount, amount);

        } else {
            throw new BusinessException("Invalid account number!");
        }
    }

    private checkWithdrawalLimit(Money amount) {
        if (amount.greaterThan(this.transferLimit)) {
            throw new BusinessException("Limit exceeded!");
        }
    }
}
// end::CheckingAccount[]