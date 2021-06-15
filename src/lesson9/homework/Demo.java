package lesson9.homework;

public class Demo {
    public static void main(String[] args) {
        User[] clients = new User[5];
        UserRepository userRepository = new UserRepository(clients);
        userRepository.getUserByName("Vadim");
    }
}
