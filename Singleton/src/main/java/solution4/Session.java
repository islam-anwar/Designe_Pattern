/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution4;

/**
 *
 * @author eslam java
 */
public class Session {
    
    private Session() {
    }
    
    public static Session getInstance() {
        return SessionHolder.INSTANCE;
    }
    
    private static class SessionHolder {

        private static final Session INSTANCE = new Session();
    }
}
