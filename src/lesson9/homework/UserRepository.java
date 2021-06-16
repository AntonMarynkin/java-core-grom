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
            if (name == findUser.getName())
                return findUser;
        }
        return null;
    }

    public User getUserById(long id) {
        for (User findUser : users) {
            if (id == findUser.getId())
                return findUser;
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        for (User findUser : users) {
            if (sessionId == findUser.getSessionId())
                return findUser;
        }
        return null;
    }


    public User save(User user) {
        for (User findUser : users) {
            if (findUser.getId() != user.getId() && user != findById(523852387))
                user = users[users.length - 1];
                return user;
        }
        return null;
    }

    private User findById(long id) {
        for (User findUser : users) {
            if (id == findUser.getId())
                return findUser;
        }
        return null;
    }
}
