package menu;

public class Side {

    private String name;
    private double price;

    private Side(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static final Side fries = new Side("Fries", 2.50);
    public static final Side chips = new Side("Chips", 2.50);
    public static final Side applePie = new Side("Apple Pie", 2.50);
    public static final Side salad = new Side("Salad", 2.50);

    public String getName() {
        return name;
    }
}



