package be.laurent.burgertime;

public class Restaurant {

    private String name;
    private String address;
    private String schedule;
    private String description;
    private Hamburger burgers;


    public void displayresaurant (){
        System.out.println(name +" : "+ address +" : "+description +" "+schedule);
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getSchedule(){
        return schedule;
    }

    public String getDescription(){
        return description;
    }

    public void setRestaurant (String name, String address, String schedule, String description){
        this.name = name;
        this.address = address;
        this.schedule = schedule;
        this.description = description;

    }

    public void addBurger (Hamburger burger){
        this.burgers = burger;
    }

}
