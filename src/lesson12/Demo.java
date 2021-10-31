package lesson12;

public class Demo {
    public static void main(String[] args) {
        Bank usBank = new USBank(651699, "Sweden", Currency.EUR, 100, 1400, 4, 12555847);
        Bank euBank = new EUBank(651685, "Italy", Currency.EUR, 150, 1500, 4, 13555847);
        Bank chinaBank = new ChinaBank(685699, "Being", Currency.USD, 500, 5400, 6, 1002555847);

        User user = new User(651651, "Denis", 12000, 40, "GMD", 2000, usBank);
        User user2 = new User(651652, "Andrey", 15000, 50, "GMD", 2000, usBank);
        User user3 = new User(651653, "Stepan", 25000, 60, "GMD", 4000, euBank);
        User user4 = new User(651654, "Nikolay", 10000, 30, "GMD", 1500, euBank);
        User user5 = new User(651655, "Anton", 200000, 20, "GMD", 5000, chinaBank);
        User user6 = new User(651656, "Ivan", 150000, 25, "GMD", 4000, chinaBank);

        User fromUser = new User(651121, "Alex", 100000, 40, "GMD", 1000, usBank);
        User toUser = new User(623651, "Andrey", 10000, 40, "GMD", 1000, usBank);

        BankSystem bankSystem = new UkrainianBankSystem();

        bankSystem.withdraw(user, 150);
        bankSystem.withdraw(user5, 50);
        System.out.println(user.getBalance());
        System.out.println(user5.getBalance());

        bankSystem.fund(user, 250);
        bankSystem.fund(user5, 8000);
        System.out.println(user.getBalance());
        System.out.println(user5.getBalance());

        bankSystem.transferMoney(fromUser, toUser, 1000);
        bankSystem.transferMoney(user6, user5, 2000);
        System.out.println(fromUser.getBalance());
        System.out.println(toUser.getBalance());
        System.out.println(user6.getBalance());
        System.out.println(user5.getBalance());

        bankSystem.paySalary(user);
        bankSystem.paySalary(user5);
        System.out.println(user.getBalance());
        System.out.println(user5.getBalance());
    }
}
