package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int baseprice;
    private int choosePrice;

    private int toppingsPrice;

    private int bagPrice;

    private boolean isCarryBagAdded;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            price=300;
            toppingsPrice=70;
        }else{
           price=400;
           toppingsPrice=80;
        }
        choosePrice=80;
        bagPrice=20;
        this.price=baseprice;
    }


    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){
            isCheeseAdded=true;
           this. price+=choosePrice;
        }

    }

    public void addExtraToppings() {
        if(!isToppingsAdded){
            isToppingsAdded=true;
            this.price+=toppingsPrice;
        }
    }
    public void addTakeaway() {
        if (!isCarryBagAdded) {
            isCarryBagAdded=true;
            this.price += bagPrice;
        }
    }

    public String getBill(){

        if(!isBillGenerated){
            isBillGenerated=true;
            this.bill="Base Price Of The Pizza: "+this.baseprice+"\n";
            if(isCheeseAdded){
                this.bill=this.bill+"Extra Cheese Added: "+this.choosePrice+"\n";
            }
            if(isToppingsAdded){
                this.bill=this.bill+"Extra Toppings Added: "+this.toppingsPrice+"\n";
            }
            if(isCarryBagAdded){
                this.bill=this.bill+"PaperBag Added: "+this.bagPrice+"\n";
            }
            this.bill=this.bill+"Total Price: "+this.bill+"\n";
        }
return this.bill;

    }
}
