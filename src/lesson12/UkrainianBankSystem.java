package lesson12;

public class UkrainianBankSystem implements BankSystem {

    @Override
    public void withdraw(User user, int amount) {
        // проверить можно ли снять:
        // проверить лимит
        // проверить достаточно ли денег
        // снять деньги

//        int limitOfWithdrawal = user.getBank().getLimitOfWithdrawal();
//
//        if (amount + user.getBank().getCommission(amount) > limitOfWithdrawal) {
//            printWithdrawalErrorMsg(amount, user);
//            return;
//        }
//
//        if (amount + user.getBank().getCommission(amount) > user.getBalance()) {
//            printWithdrawalErrorMsg(amount, user);
//            return;
//        }

        if (!checkWithdraw(user, amount))
            return;
        user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount));
    }

    @Override
    public void fund(User user, int amount) {
        //TODO homework
        if (!checkFunding(user, amount))
            return;
        user.setBalance(user.getBalance() + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        //снимаем деньги fromUser
        //пополняем деньги toUser

        if (!checkWithdraw(fromUser, amount))
            return;

        if (!checkFunding(toUser, amount))
            return;

        fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount));

        toUser.setBalance(toUser.getBalance() + amount);
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }

    private boolean checkWithdraw(User user, int amount) {
        return checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal()) &&
                checkWithdrawLimits(user, amount, user.getBalance());
    }

    private boolean checkWithdrawLimits(User user, int amount, double limit) {
        if (amount + amount * user.getBank().getCommission(amount) > limit) {
            printWithdrawalErrorMsg(amount, user);
            return false;
        }
        return true;
    }

    private void printWithdrawalErrorMsg(int amount, User user) {
        System.err.println("Can`t withdraw money" + amount + " from user " + user.toString());
    }


    private boolean checkFunding(User user, int amount) {
        return checkFundingLimit(user, amount, user.getBank().getLimitOfFunding());
    }

    private boolean checkFundingLimit(User user, int amount, double limit) {
        if (amount > limit) {
            printFundingErrorMsg(amount, user);
            return false;
        }
        return true;
    }

    private void printFundingErrorMsg(int amount, User user) {
        System.err.println("Can`t funding money" + amount + " to user " + user.toString());
    }
}
