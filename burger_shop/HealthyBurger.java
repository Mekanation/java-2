package burger_shop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HealthyBurger extends Burger{
    private String name;
    private double price;
    private String breadType;
    private String meatType;
    private ArrayList<String> toppingList;
    private int toppingsCounter = 0;

    public HealthyBurger(String name, double price, String breadType, String meatType) {
        super(name,price, breadType,meatType);

        this.name = name;
        this.price = price;
        this.breadType = breadType;
        this.meatType = meatType;

        toppingList = new ArrayList<>();


    }
    public static double burgerPrice(){
        return 12.00;
    }

    public double totalBurgerPrice(){
        price+= toppingsCounter*1.00;
        return price;
    }

    public void addToppings(Toppings t,int index) {
        ArrayList<String> healthyOptions = new ArrayList<>();
        healthyOptions = t.getHealthyToppings();

        try {
            if (toppingsCounter < 4) {
                if(!checkToppingDuplicate(toppingList, healthyOptions.get(index))){
                    toppingList.add(healthyOptions.get(index));
                    toppingsCounter++;
                }else {
                    System.out.println("Topping already added! Cannot add another!");
                }
            } else {
                System.out.println("You cannot add more than 4 toppings.");
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid Option for addition to healthy burger\n Available options: ");
            for(String s : healthyOptions){
                System.out.println(s);
            }

        }


    }

    private boolean checkToppingDuplicate(ArrayList<String> list, String item){
        for(String s: list){
            if(s.equals(item)){
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Healthy Burger{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", breadType='" + breadType + '\'' +
                ", meatType='" + meatType + '\'' +
                ", toppingList=" + toppingList +
                ",}"
                ;
    }

}
