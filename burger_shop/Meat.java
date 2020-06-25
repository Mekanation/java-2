package burger_shop;

import java.util.ArrayList;

public class Meat {
    private ArrayList<String> meatTypes;

    public Meat(){
        meatTypes = new ArrayList<>();
        meatTypes.add("Ground Beef");
        meatTypes.add("Steak");
        meatTypes.add("Chicken");
        meatTypes.add("Black Bean");
        meatTypes.add("Beyond meat");
        meatTypes.add("Impossible meat");

    }

    public ArrayList<String> getAllMeats() {
        return meatTypes;
    }

    public String getMeat(int index){
        return meatTypes.get(index);
    }




}