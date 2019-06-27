package be.laurent.burgertime;

public class ViewRestaurant {

    private int note;
    private String view;

    public void displayViewresaurant(){
        System.out.println(note+" "+view);
    }

    public int getNote (){
        return note;
    }

    public  String getView(){
        return view;
    }

    public void setView(int note, String view){
        this.note = note;
        this.view = view;
    }
}
