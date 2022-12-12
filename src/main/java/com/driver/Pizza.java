package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;

    public Pizza(boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            price=300;
        }
        else {
            price=400;
        }
        bill="Base Price Of The Pizza: "+price;
    }

    public Pizza(boolean isVeg,boolean deluxe){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            price=450;
        }
        else {
            price=600;
        }
        bill="Base Price Of The Pizza: "+price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        int extraCheese=80;
        bill=bill+"\nExtra Cheese Added: "+extraCheese;
        price += 80;
    }

    public void addExtraToppings(){
        // your code goes here
        int extraToppings;
        if(isVeg)
        {
            extraToppings=70;
        }
        else {
            extraToppings=120;
        }
        bill=bill+"\nExtra Toppings Added: "+extraToppings;
        price += extraToppings;
    }

    public void addTakeaway(){
        // your code goes here
        int takeAway=20;
        bill=bill+"\nPaperbag Added: "+takeAway;
        price +=takeAway;
    }

    public String getBill(){
        // your code goes here
        bill=bill+"\nTotal Price: "+price;
        return this.bill;
    }
}
