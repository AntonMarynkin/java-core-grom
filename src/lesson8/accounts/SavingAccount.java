package lesson8.accounts;

public class SavingAccount extends Account {
    int savingPerMonth;

    public SavingAccount(String bankName, String ownerName, int moneyAmount, int savingPerMonth) {
        super(bankName, ownerName, moneyAmount);
        this.savingPerMonth = savingPerMonth;
    }

    @Override
    void changeOwnerName(String newOwnerName) {
        if (newOwnerName == "Jack" || newOwnerName == "Ann")
            ownerName = newOwnerName;
        System.out.println("Sorry, you can`t owner name of this saving account");
    }
}
