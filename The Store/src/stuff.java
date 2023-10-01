public class stuff {
    private String name;
    private double price;
    private double rating;

    public stuff(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "stuff{name='" + name + "', price=" + price + ", rating=" + rating + '}';
    }
}
