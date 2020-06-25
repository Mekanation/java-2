package burger_shop;



import java.util.ArrayList;

public class Order {
    private Sides sides = new Sides();
    private Toppings toppings = new Toppings();
    private Drink drink = new Drink();

    private Burger burger;
    private Bread bread;
    private Meat meat;
    private Meal meal;

    private ArrayList<Meal> mealList = new ArrayList<>();
    private ArrayList<String> sidesList = new ArrayList<>();
    private ArrayList<String> drinksList = new ArrayList<>();
    private ArrayList<Burger> burgerList = new ArrayList<>();



    public Order(Burger burger){

        this.burger = burger;

        burgerList.add(burger);



    }

    public Order(Meal meal){
        this.meal = meal;
        mealList.add(meal);

    }

    public void addBurger(String burgerType){
        switch (burgerType){
            case "Deluxe Burger":
                burgerList.add(new DeluxeBurger("Deluxe", DeluxeBurger.burgerPrice(),bread.getBread(0),meat.getMeat(0)));
                break;
            case "Healthy Burger":
                burgerList.add(new HealthyBurger("Healthy", HealthyBurger.burgerPrice(),bread.getBread(0),meat.getMeat(0)));
                break;
            default:
                burgerList.add(new Burger("Basic", Burger.burgerPrice(),bread.getBread(0),meat.getMeat(0)));
                break;
        }

    }
    public void addToppings(Meal meal, int index){
        meal.addTopping(index);
    }

    public void addToppings(Burger burger, int index){
        burger.addToppings(toppings, index);

    }

    public void addSides(int index){
        sidesList.add(sides.getSide(index));

    }
    public void addSDrink(int index){
        drinksList.add(drink.getDrink(index));

    }

    public double purchaseOrder(){
        double total = 0.00;
        for(Burger b: burgerList){
            total+=b.totalBurgerPrice();
        }
        for(Meal m: mealList){
            total+=m.totalMealPrice();
        }
        System.out.println("The total for your order today is: " + total);
        return total;

    }



}
