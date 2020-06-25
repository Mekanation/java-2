package burger_shop;



/*
Did pair programming with:
Tyler Clements
Kevin Ibanez


 */
public class Main {
    public static void main(String[] args) {
//        Meat meat = new Meat();
//        Bread bread = new Bread();
//        Toppings t = new Toppings();
//        Burger b = new Burger("basic", Burger.burgerPrice(),bread.getBread(1), meat.getMeat(1));
//        b.addToppings(t, 3);
//        b.addToppings(t, 1);
//
//
//
//        HealthyBurger hb = new HealthyBurger("Healthy", HealthyBurger.burgerPrice(),bread.getBread(1), meat.getMeat(1));
//
//        hb.addToppings(t, 1);
//        hb.addToppings(t, 1);
//        hb.addToppings(t, 1);
//
//        DeluxeBurger db = new DeluxeBurger("Deluxe", 10.50,bread.getBread(1), meat.getMeat(1));
//        db.addToppings(t,0);
//        db.addToppings(t,17);
//        db.addToppings(t, 7);
//        db.addToppings(t,2);
//        db.addToppings(t, 3);
//        db.addToppings(t, 3);
//        db.addToppings(t, 4);
//
//        System.out.println(hb.totalBurgerPrice());
//        System.out.println(b.totalBurgerPrice()) ;
//        System.out.println(db.toString());
//        System.out.println(b.toString());
//        System.out.println(hb.toString());

        Meal m1 = new Meal();
        m1.newBasicBurger();


        Order order = new Order(m1);
        order.purchaseOrder();

    }
}
