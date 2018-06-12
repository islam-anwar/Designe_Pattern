/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution1;

/**
 *
 * @author JEDiver
 */
public class SimpleFactory {

//    Pizza pizza = new CheesePizza();
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "Cheese":
                if (this.pizza != null) {
                    pizza = new CheesePizza();
                } else {
                    pizza = this.pizza;
                }
                break;
            case "Vegetable":
                pizza = new VegetablePizza();
                break;
            case "Seafood":
                pizza = new SeafoodPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
    static CheesePizza pizza = new CheesePizza();

    public CheesePizza createCheesePizza() {
//        CheesePizza pizza = new CheesePizza();
        return pizza;
    }
}
