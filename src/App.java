public class App {
    public static void main(String[] args) throws Exception {

        Burger burger = new Burger("Cheeseburger", 10);
        Topping pickles = new Topping("pickles", 2);
        Topping onion = new Topping("onion", 1.50);
        Topping spicySauce = new Topping("spicy sauce", 2.20);

        burger.addTopping(pickles);
        burger.addTopping(onion);
        burger.addTopping(spicySauce);

        System.out.println(burger.getPrice());
    }
}
