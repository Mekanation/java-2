package burger_shop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Burger {


    private String name;
    private double price;
    private String breadType;
    private String meatType;
    private ArrayList<String> toppingList;
    private int toppingsCounter = 0;

    public Burger(String name, double price, String breadType, String meatType) {
        this.name = name;
        this.price = price;
        this.breadType = breadType;
        this.meatType = meatType;

        toppingList = new ArrayList<String>();
    }
    public Burger(){};

    public static double burgerPrice(){
        return 10.00;
    }

    public double totalBurgerPrice(){
        price+= toppingsCounter*.50;
        return price;
    }


    public void addToppings(Toppings t,int index){

        try {
            if (toppingsCounter < 2) {

                if(!checkToppingDuplicate(toppingList, t.getTopping(index))){
                    toppingList.add(t.getTopping(index));
                    toppingsCounter++;
                }else {
                    System.out.println("Topping already added! Cannot add another!");
                }

            } else {
                System.out.println("You cannot add more than 2 toppings.");
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("Invalid Option for addition to burger\n Available options: ");
            for(String s : t.getAllToppings()){
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
        return "Burger{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", breadType='" + breadType + '\'' +
                ", meatType='" + meatType + '\'' +
                ", toppingList=" + toppingList +
                ",}"
                ;
    }





}
