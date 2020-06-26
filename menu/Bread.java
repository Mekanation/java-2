package menu;

public class Bread {
    private String name;

    private Bread(String name) {

        this.name = name;
    }

    public static final Bread rye = new Bread("Rye");
    public static final Bread white = new Bread("White");
    public static final Bread wheat = new Bread("Wheat");
    public static final Bread rosemaryCheddar = new Bread("Rosemary Cheddar");
    public static final Bread brioche = new Bread("Brioche");
    public static final Bread sourdough = new Bread("Sourdough");

    public String getName() {
        return name;
    }
}