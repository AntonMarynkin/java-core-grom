package lesson9.homework;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }


    public String[] getUserNames() {
        //System.out.println(users);
        return null;
    }

    public long[] getUserIds() {
        return null;
    }

    public String getUserNameById(long id) {
        return null;
    }


    public User[] getUserByName(String name) {
        User user = new User(2552, "Ed", "session");
        for (User findUser : users) {

        }
        return null;
    }

    public String getUserById(long id) {
        return null;
    }

    public String getUserBySessionId(String sessionId) {
        return null;
    }
}
