/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JEDiver
 */
public class Factory {
    
    private Factory() {
    }
    
    public static Factory getInstance() {
        return FactoryHolder.INSTANCE;
    }
    
    private static class FactoryHolder {

        private static final Factory INSTANCE = new Factory();
    }
}
