public class DeluxeBurger extends Burger {
    public DeluxeBurger() {
        super("Deluxe burger", 20.50);
    }

    @Override
    public void addTopping(Topping topping) {
        if (getToppings().size() >= 2) {
            System.out.println("You can add up to 2 toppings for Deluxe Burger.");
            return;
        }
        getToppings().add(topping);
    }
}
