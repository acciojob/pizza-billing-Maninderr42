package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price+=300;
        }else{
           this. price+=400;
        }
       // bill = String.valueOf(price);
        //bill+=price;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        price+=80;

    }

    public void addExtraToppings(){
        if(isVeg){
            price+=70;
        }else{
            price+=120;
        }
    }

    public void addTakeaway(){
        price+=20;
    }

    public String getBill(){


        return Integer.toString(price);
    }
}
