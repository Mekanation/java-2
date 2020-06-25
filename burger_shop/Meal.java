package burger_shop;

import java.util.ArrayList;

public class Meal {
    Toppings t;
    Bread br;
    Meat m;
    Sides s;
    Drink d;
    Burger b;

    ArrayList<String> sidesList;

    String drink = "";
    int sideCounter = 1;
    public Meal() {
        t = new Toppings();
        br = new Bread();
        m = new Meat();
        s = new Sides();
        d = new Drink();
        b = new Burger();
        sidesList = new ArrayList<>();
    }

    public void newBasicBurger() {
        b = new Burger("Basic Burger", Burger.burgerPrice(), br.getBread(0), m.getMeat(0));
        sidesList.add(s.getSide(0));
        drink = "Coke";
    }

    public void newHealthyMeal() {
        b = new HealthyBurger("Healthy Burger", HealthyBurger.burgerPrice(), br.getBread(0), m.getMeat(0));
        sidesList.add(s.getSide(3));
        drink = "Water";
    }

    public void newDeluxeMeal() {
        b = new DeluxeBurger("Deluxe Meal", DeluxeBurger.burgerPrice(), br.getBread(0), m.getMeat(0));
        sidesList.add(s.getSide(0));
        drink = "Coke";
    }
    public void addTopping(int index){
        b.addToppings(t, index);
    }

    public void addSide(int index){
        try{
            if(sideCounter <= 3){
                sidesList.add(s.getSide(index));
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Invalid side option. Available sides: ");
            for(String str : s.getAllSides()){
                System.out.println(str);
            }

        }

    }

    public void changeDrink(int index){
        drink = d.getDrink(index);
    }

    public String getCurrentMeal(){
        String currentMeal = b.toString() + " | Sides: {";

        for(String str : sidesList){
            currentMeal+=str;
            currentMeal+=", ";
        }
        currentMeal+="} | Drink: " + drink;

        return currentMeal;
    }

    public double totalMealPrice() {

        return b.totalBurgerPrice();

    }



}
