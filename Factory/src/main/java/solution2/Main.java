/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution2;

/**
 *
 * @author JEDiver
 */
public class Main {

    public static void main(String[] args) {
        PizzaRestaurant restaurant = new ItalianPizzaRestaurant();
        restaurant.orderPizza("Cheese");
        restaurant.orderPizza("Vegetable");
        PizzaRestaurant restaurant2 = new EgyptianPizzaRestaurant();
        restaurant2.orderPizza("Cheese");
        restaurant2.orderPizza("Vegetable");
    }

}
