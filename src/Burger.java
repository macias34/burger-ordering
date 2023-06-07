import java.util.ArrayList;

public class Burger extends Product {
    private ArrayList<Topping> toppings = new ArrayList<Topping>();

    public Burger(String type, double price) {
        super(type, price);
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public void addTopping(Topping topping) {
        if (toppings.size() >= 3) {
            System.out.println("You can add up to 3 toppings");
            return;
        }
        toppings.add(topping);
        setPrice(this.getPrice() + topping.getPrice());
    }

}
