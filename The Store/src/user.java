public class user {
    private String username;
    private String password;
    private basket basket;

    public user(String username, String password) {
        this.username = username;
        this.password = password;
        this.basket = new basket();
    }

    public basket getBasket() {
        return basket;
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', password='" + password + "', basket=" + basket + '}';
    }
}
