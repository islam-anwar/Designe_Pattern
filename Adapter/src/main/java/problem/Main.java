/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

/**
 *
 * @author JEDiver
 */
public class Main {

    public static void main(String[] args) {
        ViewService viewService = new ViewService();
        UserDTO user = viewService.getUser();

        UserEntity userEntity = new UserEntity();
        userEntity.setId(user.getId());
        userEntity.setFullName(user.getFirstName() + " " + user.getMiddleName()
                + " " + user.getLastName());
        userEntity.setNetSalary(user.getSalary() + user.getBonus() - user.getDeduction());

        PersistService persistService = new PersistService();
        persistService.persist(userEntity);

        PrintService printService = new PrintService();
        printService.print(userEntity);
    }

}
