/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Town;
import java.util.Scanner;
/**
 *
 * @author Hello VIỆT
 */
public class Main {
   static ManagerTown managerTown = new ManagerTown();
    static void displayMenu () {
        System.out.println("-----------MENU-----------");
        System.out.println(" 1: Them ho gia dinh vao khu pho");
        System.out.println(" 2: Xoa mot ho gia dinh khoi khu pho");
        System.out.println(" 3: Them nguoi vao mot ho gia dinh trong khu pho");
        System.out.println(" 4: Xoa mot nguoi khoi ho gia dinh trong khu pho ");
        System.out.println(" 5: display famly ");
        System.out.println("____________________________");
    }
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        while (true) {
            displayMenu();
        int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    managerTown.addFamily();
                    break;
                 case 2:
                    managerTown.deleteFamily();
                    break;
                 case 3:
                    managerTown.addPerson();
                    break;
                 case 4:
                    managerTown.deletePerson();
                    break;
                 case 5:
                   managerTown.display();
                   break;
                   
                default:
                    System.out.println("ban da nhap sai vui long nhap lai");
                   
            }
        }
    }
}
