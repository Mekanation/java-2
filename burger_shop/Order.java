package burger_shop;


import menu.*;

import java.util.ArrayList;

public class Order {

    private Burger burger;
    private Bread bread;
    private Meat meat;

    private Meal meal;

    private ArrayList<Meal> orderMealList = new ArrayList<Meal>();
    private ArrayList<Drink> orderDrinkList = new ArrayList<Drink>();
    private ArrayList<Burger> orderBurgerList = new ArrayList<Burger>();
    private ArrayList<Side> orderSidesList = new ArrayList<Side>();
    private ArrayList<Topping> orderToppingsList = new ArrayList<Topping>();

    public Order(Burger burger, Bread bread, Meat meat) {
        this.burger = burger;
        this.bread = bread;
        this.meat = meat;
    }

    public Order(Meal meal) {
        this.meal = meal;
    }

    //code folding comment for Mark
    public void addToppings(Topping one, Topping two, Topping three, Topping four) {
        orderToppingsList.add(one);
        orderToppingsList.add(two);
        orderToppingsList.add(three);
        orderToppingsList.add(four);


    }

    public void addToppings(Topping one, Topping two, Topping three) {
        orderToppingsList.add(one);
        orderToppingsList.add(two);
        orderToppingsList.add(three);

    }

    public void addToppings(Topping one, Topping two) {
        orderToppingsList.add(one);
        orderToppingsList.add(two);

    }

    public void addToppings(Topping one) {
        orderToppingsList.add(one);
    }

    public void addSides(Side one, Side two, Side three, Side four) {
        orderSidesList.add(one);
        orderSidesList.add(two);
        orderSidesList.add(three);
        orderSidesList.add(four);
    }

    public void addSides(Side one, Side two, Side three) {
        orderSidesList.add(one);
        orderSidesList.add(two);
        orderSidesList.add(three);
    }

    public void addSides(Side one, Side two) {
        orderSidesList.add(one);
        orderSidesList.add(two);
    }

    public void addSides(Side one) {
        orderSidesList.add(one);
    }
    //end code folding here.

    public void addBurger(Burger burger) {
        orderBurgerList.add(burger);
    }
    public void addDrink(Drink drink) {
        orderDrinkList.add(drink);
    }
    public void addMeal(Meal meal) {
        orderMealList.add(meal);
    }



    public double purchaseOrder() {
        double orderTotal = 0;
        try {
            orderTotal += meal.getPrice();
        } catch (NullPointerException npe) {
            // Ignore
        }

        try {
            orderTotal += burger.totalBurgerPrice();
        } catch (NullPointerException npe) {
            // Ignore
        }


        for (Burger b : orderBurgerList) {
            orderTotal += b.totalBurgerPrice();
        }

        for(Topping t: orderToppingsList){
            orderTotal += .25;
        }

        for(Side s: orderSidesList){
            orderTotal += 1.50;
        }
        for(Drink d: orderDrinkList){
            orderTotal += .50;
        }
        for(Meal m: orderMealList){
            orderTotal += m.getPrice();
        }

        return orderTotal;
    }

}









