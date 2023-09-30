package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice());//n veg = 400+80+120 = 600  || 300+80+70= 450
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addExtraToppings();
    System.out.println(dp.getBill()); //600+20+80+120||70

    Pizza p = new Pizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());//400+80+120+20 = 620
  }
}