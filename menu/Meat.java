package menu;

import java.util.ArrayList;

public class Meat {
    private String name;
    private Meat(String name){
        this.name = name;


    }

    public static final Meat chicken = new Meat("Chicken");
    public static final Meat steak = new Meat("Steak");
    public static final Meat groundBeef = new Meat("groundBeef");
    public static final Meat beyondBurger = new Meat("BeyondBurger");
    public static final Meat impossibleBurger = new Meat("Impossible Burger");
    public static final Meat blackBean = new Meat("Black Bean");

    public String getName() {
        return name;
    }




}