package burger_shop;


import menu.*;

/*
Did pair programming with:
Tyler Clements
Kevin Ibanez


 */
public class Main {
    public static void main(String[] args) {

        Order order = new Order(Meal.healthyMeal);
        order.addSides(Side.fries, Side.salad, Side.applePie);
        order.addBurger(DeluxeBurger.deluxeBurger);
        System.out.println(order.purchaseOrder());

        Order order2 = new Order(Burger.value, Bread.sourdough, Meat.steak);
        order2.addDrink(Drink.mtDew);
        order2.addSides(Side.chips, Side.fries);
        order2.addToppings(Topping.Bacon, Topping.Cheese, Topping.Lettuce);

        System.out.println(order2.purchaseOrder());


        System.out.println(DeluxeBurger.deluxeBurger.totalBurgerPrice());





    }
}
