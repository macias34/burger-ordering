public class App {
    public static void main(String[] args) throws Exception {

        Burger burger = new Burger("Cheeseburger", 10);
        Topping pickles = new Topping("pickles", 2);
        Topping onion = new Topping("onion", 1.50);
        Topping spicySauce = new Topping("spicy sauce", 2.20);
        Topping ham = new Topping("ham", 2.0);
        Topping jalapeno = new Topping("jalapeno", 3.0);

        burger.addTopping(pickles);
        burger.addTopping(onion);
        burger.addTopping(spicySauce);

        Drink dietCoke = new Drink("diet coke", "medium");
        SideItem bigFries = new SideItem("big fries", 5);

        Meal meal = new Meal(burger, dietCoke, bigFries);
        System.out.println(meal);

        meal = new Meal();
        meal.getBurger().addTopping(jalapeno);
        System.out.println(meal);

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addTopping(pickles);
        deluxeBurger.addTopping(onion);
        deluxeBurger.addTopping(spicySauce);
        deluxeBurger.addTopping(jalapeno);
        deluxeBurger.addTopping(ham);

        meal = new Meal(deluxeBurger, new Drink("juice", "large"), new SideItem("potatos", 4.3));
        meal.setPrice(deluxeBurger.getPrice());
        System.out.println(meal);

    }
}
