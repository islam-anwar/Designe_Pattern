/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sss;

/**
 *
 * @author eslam java
 */
public class Payment {
    parent p ;

    public Payment(parent p) {
        this.p = p;
    }
    
    void pay(int amount){
        p.doPayment(amount);
    }
}
