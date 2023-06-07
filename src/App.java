public class App {
    public static void main(String[] args) throws Exception {
        Drink drink = new Drink("Cola", "small");
        System.out.println(drink.getPrice(4));
    }
}
