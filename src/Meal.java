public class Meal {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public Meal(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public Meal() {
        Burger cheeseBurger = new Burger("cheeseBurger", 7);
        Drink drink = new Drink("coke", "small");
        SideItem fries = new SideItem("fries", 4);

        this.burger = cheeseBurger;
        this.drink = drink;
        this.sideItem = fries;
    }

    public double getPrice() {
        return burger.getPrice() + drink.getPrice() + sideItem.getPrice();
    }

    public String toString() {
        String mealString = """
                Meal:
                    Burger:
                        name: %s -> $%.2f,
                        toppings: %s
                        price: $%.2f
                    Drink:
                        name: %s,
                        size: %s,
                        price: $%.2f
                    Side item:
                        name: %s,
                        price: $%.2f

                Full price: $%.2f
                    """;

        StringBuilder toppingsString = new StringBuilder();
        burger.getToppings()
                .forEach((topping) -> toppingsString
                        .append(String.format("\n%s%s -> $%.2f", " ".repeat(14), topping.getType(),
                                topping.getPrice())));

        return String.format(mealString, burger.getType(), burger.getPrice(), toppingsString,
                burger.getPriceWithToppings(), drink.getType(),
                drink.getSize(), drink.getPrice(), sideItem.getType(), sideItem.getPrice(), getPrice());
    }
}
