/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution3;

/**
 *
 * @author JEDiver
 */
public class Connection {

    private static Connection instance = new Connection();

    private Connection() {
    }

    public static Connection getInstance() {
        return instance;
    }

    public void sayHello(String name) {
        System.out.println("Hello ya " + name);
    }

}
