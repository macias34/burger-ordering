public class DeluxeBurger extends Burger {
    public DeluxeBurger() {
        super("Deluxe burger", 30.50);
    }

    @Override
    public void addTopping(Topping topping) {
        if (getToppings().size() >= 5) {
            System.out.println("You can add up to 5 toppings for Deluxe Burger.");
            return;
        }
        getToppings().add(topping);
    }
}
