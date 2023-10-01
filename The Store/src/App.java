public class App {
    public static void main(String[] args) {
        category electronics = new category("Electrinics");
        category clothing = new category("Clothes");

        stuff smartphone = new stuff("Smarthone", 500, 4.5);
        stuff laptop = new stuff("Laptop", 1000, 4.8);
        stuff tShirt = new stuff("T-shirt", 20, 4.0);
        stuff jeans = new stuff("Jeans", 50, 4.2);

        electronics.addstuff(smartphone);
        electronics.addstuff(laptop);
        clothing.addstuff(tShirt);
        clothing.addstuff(jeans);

        user user1 = new user("user1", "password1");
        user user2 = new user("user2", "password2");

        user1.getBasket().addToBasket(smartphone);
        user1.getBasket().addToBasket(tShirt);
        user2.getBasket().addToBasket(laptop);
        user2.getBasket().addToBasket(jeans);
        

        System.out.println("Catalogue of products:");
        System.out.println(electronics);
        System.out.println(clothing);

        System.out.println("\npurchases of users:");
        System.out.println(user1);
        System.out.println(user2);
    }
}
