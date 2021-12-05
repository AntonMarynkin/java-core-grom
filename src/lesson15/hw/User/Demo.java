package lesson15.hw.User;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User(65465465, "Name", "4f65we4f6w5e");
        User user2 = new User(65461111, "Name2", "4f65we4f6w5e");
        User user3 = new User(65465465, "Name", "4f65we4f6w5e");
        User[] users = new User[10];
        UserRepository userRepository = new UserRepository(users);

        System.out.println(user1.equals(user3));
        System.out.println(userRepository.save(user1));

        System.out.println(userRepository.update(user2));
    }
}
