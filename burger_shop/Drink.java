package burger_shop;

import java.util.ArrayList;

public class Drink {

    private ArrayList<String> drinkList;

    public Drink(){
        drinkList = new ArrayList<>();

        drinkList.add("Water");
        drinkList.add("Gatorade");
        drinkList.add("Power Aid");
        drinkList.add("Coke");
        drinkList.add("Mountain Dew");
        drinkList.add("Sprite");
        drinkList.add("Diet Coke");
        drinkList.add("Fanta Orange");



    }

    public String getDrink(int index){
        return drinkList.get(index);
    }

    public ArrayList<String> getAllDrinks(){

        return drinkList;
    }
}
