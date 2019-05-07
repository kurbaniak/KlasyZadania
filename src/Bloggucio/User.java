package Bloggucio;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String nick;
    private static int USER_COUNTER = 0;


    public User(String firstName, String lastName, String nick) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nick = nick;
        this.id = ++USER_COUNTER;
    }

    public int getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "(" + id +   ") " + firstName + " " + lastName + ", nick= " + nick;
    }
}
