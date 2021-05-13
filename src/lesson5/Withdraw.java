package lesson5;

public class Withdraw {
    public static void main(String[] args) {
        String[] names = {"Jack", "Denis", "Oleg", "Andrey", "Nikolay", "Irina"};
        int[] balances = {1003, 500, -10, 547, 12540, -50};

        System.out.println((withdraw(names, balances, "Nikolay", 12541)));
    }

    public static int withdraw(String[] clients, int[] balances, String client, int money) {

        //1. найти клиента в базе (в нашем случае в массивах)
        //2. ставим условия. считаем сумму баланса после снятия денег
        //3. обновляем баланс (снимаем или нет)

        //1.
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }

        //2.
        int empty = -1;
        if (balances[clientIndex] < money)
            balances[clientIndex] = balances[clientIndex] = empty;
        else
            balances[clientIndex] -= money;

        //3.
        return balances[clientIndex];
    }
}
