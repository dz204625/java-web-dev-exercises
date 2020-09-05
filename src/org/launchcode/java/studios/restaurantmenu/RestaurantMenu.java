package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class RestaurantMenu{
    private ArrayList<MenuItem> listOfItems;
    private Date updatedDate;
    public RestaurantMenu(){
        this.listOfItems = new ArrayList<>();
        this.updatedDate = new Date();
    }
public void add(MenuItem m){
        if(listOfItems.contains(m)){
            listOfItems.add(m);
        }
        this.updatedDate = new Date();
}

public void remove(MenuItem m){
        listOfItems.remove(m);
        this.updatedDate = new Date();
}

public Date getUpdatedDate(){
        return updatedDate;
    }


    @Override
    public String toString() {
        return "RestaurantMenu{" +
                "listOfItems=" + listOfItems +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
