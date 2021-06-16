package lesson9.homework;

public class Demo {
    public static void main(String[] args) {
        User client = new User(65121321, "Alex", "session2");
        User client2 = new User(65171321, "Sergiy", "session3");
        User client3 = new User(65421321, "Ivan", "session4");
        User[] clients = {client, client2, client3};

        UserRepository userRepository = new UserRepository(clients);

        userRepository.getUserByName("Vadim");
        userRepository.getUserById(377378734);
        userRepository.getUserBySessionId("session1");
        userRepository.save(client);
    }
}
