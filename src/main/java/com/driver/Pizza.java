package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;
    private int extraCheese=0;
    private int extraToppings=0;
    private int paperbag=20;
    private boolean addCheese=false;
    private boolean addToppings=false;
    private boolean takeAway=false;
    private boolean billing=false;

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
        bill="Base Price Of The Pizza: "+price+"\n";
    }
    public Pizza(boolean isVeg,boolean deluxe){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            price=300;
        }
        else {
            price=400;
        }
        bill="Base Price Of The Pizza: "+price+"\n";
        addExtraCheese();
        addExtraToppings();
    }


    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!addCheese)
        {
            addCheese=true;
            extraCheese=80;
            price+=extraCheese;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!addToppings)
        {
            addToppings=true;
            if(isVeg) {
                extraToppings=70;
            }
            else {
                extraToppings=120;
            }
            price+=extraToppings;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway)
        {
            takeAway=true;
            price+=paperbag;
        }
    }

    public String getBill(){
        // your code goes here
        if(!billing) {
            billing = true;
            if (addCheese) {
                bill = bill + "Extra Cheese Added: " + extraCheese+"\n";
            }
            if (addToppings) {
                bill = bill + "Extra Toppings Added: " + extraToppings+"\n";
            }
            if (takeAway) {
                bill = bill + "Paperbag Added: " + paperbag+"\n";
            }
            bill = bill + "Total Price: " + price+"\n";
        }
        return this.bill;
    }
}
