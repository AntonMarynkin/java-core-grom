package lesson9.homework;

public class UserRepository {
    private User[] users;
    private User user = new User(5535353, "Vadim", "session1");

    public UserRepository(User[] users) {
        this.users = users;
    }


    public User[] getUsers() {
        return users;
    }


    public String[] getUserNames() {
        return null;
    }

    public long[] getUserIds() {
        return null;
    }

    public String getUserNameById(long id) {
        return null;
    }


    public User getUserByName(String name) {
        for (User findUser : users) {
            if (name == user.getName())
                return user;
        }
        return null;
    }

    public User getUserById(long id) {
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        return null;
    }
}
