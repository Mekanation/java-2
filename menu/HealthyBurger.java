package menu;

import java.util.ArrayList;

public class HealthyBurger extends Burger {

    private String name;
    private double price = 10.00;
    private Meat meat;
    private Bread bread;
    private Topping topping;

    private ArrayList<Topping> toppingList = new ArrayList<>();

    public static final HealthyBurger healthyBurger = new HealthyBurger("Healthy Burger", Meat.impossibleBurger, Bread.wheat);


    public HealthyBurger(String name, Meat meat, Bread bread) {
        super(name, meat, bread);
        this.name = name;
        this.meat = meat;
        this.bread = bread;
    }

    public void addTopping(Topping topping) {
        try {
            if (toppingList.size() < 4) {

                try {
                    // Check for a topping duplicate - if there is a duplicate, don't add the requested topping
                    if (!checkToppingDuplicate(topping) && checkToppingHealthy(topping )) {
                        toppingList.add(topping);
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Topping already added or it is unhealthy! Cannot add duplicate or unhealthy toppings. ");
                }
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Cannot add more than 2 toppings.");
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Meat getMeat() {
        return meat;
    }

    public Bread getBread() {
        return bread;
    }

    public Topping getTopping() {
        return topping;
    }

    public ArrayList<Topping> getToppingList() {
        return toppingList;
    }

    private boolean checkToppingDuplicate(Topping top) {

        for (Topping t : toppingList) {

            if (t.equals(top)) {
                return true;
            }
        }

        return false;
    }

    private boolean checkToppingHealthy(Topping top){

    return top.isHealthy();

    }

    public double totalBurgerPrice(){
        price += toppingList.size() *1.00;
        return price;
    }

    @Override
    public String toString() {

        String burger;

        burger = "Burger: {name: " + name + ", price: " + price + ", bread: " + bread.getName() + ", meat: "
                + meat.getName() + ", toppings: ";

        for (Topping top : toppingList) {
            if (toppingList.indexOf(top) == toppingList.size() - 1) {
                burger += top.getName();
            } else {
                burger += top.getName();
                burger += ", ";
            }
        }

        burger += "}";

        return burger;
    }

}



















