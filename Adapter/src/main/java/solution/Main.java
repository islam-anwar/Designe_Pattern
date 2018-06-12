/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

/**
 *
 * @author JEDiver
 */
public class Main {

    public static void main(String[] args) {
        
        ViewService viewService = new ViewService();
        UserDTO user = viewService.getUser();

        PersistAdapter persistAdapter = new PersistAdapter();
        persistAdapter.persist(user);

        PrintAdapter printAdapter = new PrintAdapter();
        printAdapter.print(user);
    }

}
