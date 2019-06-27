package be.laurent.burgertime;

public class Hamburger {

    private String name;
    private String ingredient;
    private String description;
    private double price;

    public Hamburger(String name, String description, String ingredient, Double price) {
    }

    public void displayBurger(){
        System.out.println(name + " : " + price +"%n"+ description);
    }

    public String getName(){
        return name;
    }

    public String getIngredient(){
        return ingredient;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public void setBurger(String name, String description, String ingredient, double price){
        this.name = name;
        this.description = description;
        this.ingredient = ingredient;
        this.price = price;
    }

    public void addToRestaurant(Restaurant restaurant) {

    }
}
