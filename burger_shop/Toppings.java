package burger_shop;

import java.util.ArrayList;

public class Toppings {
    private ArrayList<String> toppingList;

    public Toppings(){
        toppingList = new ArrayList<>();

        toppingList.add("Ketchup");
        toppingList.add("Mustard");
        toppingList.add("Mayo");
        toppingList.add("Cheese");
        toppingList.add("Pickles");
        toppingList.add("Tomatoes");
        toppingList.add("Jalapenos");
        toppingList.add("Bacon");
        toppingList.add("Lettuce");

    }

    public String getTopping(int index){
        return toppingList.get(index);
    }

    public ArrayList<String> getAllToppings(){
        return toppingList;
    }
    public ArrayList<String> getUnHealthyToppings(){
        ArrayList<String> unHealthyToppingList = new ArrayList<>();

        for(String s: toppingList){
            if(s.equals("Ketchup") || s.equals("Mustard") || s.equals("Mayo") || s.equals("Bacon") || s.equals("Cheese")){
                unHealthyToppingList.add(s);
            }
        }
        return unHealthyToppingList;

    }

    public ArrayList<String> getHealthyToppings(){
        ArrayList<String> healthyToppingList = new ArrayList<>();

        for(String s: toppingList){
            if(s.equals("Pickles") || s.equals("Lettuce") || s.equals("Tomatoes") || s.equals("Jalapenos")){
                healthyToppingList.add(s);
            }
        }
        return healthyToppingList;

    }

}
