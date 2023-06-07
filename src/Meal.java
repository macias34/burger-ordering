import java.util.ArrayList;

public class Meal {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;
    private double price;

    public Meal(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
        price = burger.getPrice() + drink.getPrice() + sideItem.getPrice();
    }

    public Meal() {
        this(new Burger("cheeseBurger", 7), new Drink("coke", "small"), new SideItem("fries", 4));
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
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
        ArrayList<Topping> toppings = burger.getToppings();

        if (toppings.size() > 0) {
            toppings
                    .forEach((topping) -> toppingsString
                            .append(String.format("\n%s%s -> $%.2f", " ".repeat(14), topping.getType(),
                                    topping.getPrice())));

        } else {
            toppingsString.append("none");
        }

        return String.format(mealString, burger.getType(), burger.getPrice(), toppingsString,
                burger.getPriceWithToppings(), drink.getType(),
                drink.getSize(), drink.getPrice(), sideItem.getType(), sideItem.getPrice(), getPrice());
    }
}
