package burger_shop;

import java.util.ArrayList;

public class Sides {

    private ArrayList<String> sidesList;

    public Sides(){
        sidesList = new ArrayList<>();

        sidesList.add("Fries");
        sidesList.add("Chips");
        sidesList.add("Apple Pie");
        sidesList.add("Salad");


    }

    public String getSide(int index){
        return sidesList.get(index);
    }

    public ArrayList<String> getAllSides(){

        return sidesList;
    }

}

