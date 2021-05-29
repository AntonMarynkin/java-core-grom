package lesson9.homework;

public class UserRepository {
    private User[] users;
    private long[] id;

    public UserRepository(User[] users, long[] id) {
        this.users = users;
        this.id = id;
    }

    public User[] getUsers() {
        return users;
    }


    public String[] getUserNames() {
        System.out.println(users);
        return null;
    }

    public long[] getUserIds() {
        System.out.println(id);
        return null;
    }

    public String getUserNameById(long id) {
        return null;
    }
}
