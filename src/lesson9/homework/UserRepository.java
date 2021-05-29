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
        System.out.println(users);
        return null;
    }

    public long[] getUserIds() {
        return null;
    }

    public String getUserNameById(long id) {
        return null;
    }
}
