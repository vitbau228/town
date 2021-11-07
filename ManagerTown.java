/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Town;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Hello VIỆT
 */
public class ManagerTown {
    
     private town town =new town(); ;
    private final  ArrayList<Family> familyList = this.town.getTown();
   
   
    private static final   Scanner sc = new Scanner(System.in);

    public ManagerTown() {
    }
    public void addFamily() {
        System.out.println("nhap ten gia dinh ");
      String familyName = sc.nextLine();
        System.out.println("nhap dia chi ");
      String address = sc.nextLine();
      Family family = new Family(familyName,address);
      town.addFamily(family);
        System.out.println("da  them gia dinh vao khu pho");
      
    }
    public void addPerson() {
       this.town.display();
       System.out.println("Nhap ten ho gia muon them nguoi : ");
       String familyName = sc.nextLine();
       boolean seachedState = false; 
       Person person = new Person();
       person.input();
       for(int i = 0; i < familyList.size();i++) {
        if(familyList.get(i).getFamilyName().equals(familyName)) {
            seachedState = true;
            familyList.get(i).addPerson(person);
            System.out.println("da them nguoi thanh cong vao gia dinh");
            
            
        }
       
       } 
        if (!seachedState) {
            System.out.println("khong tim thay ho gd nay nay");
        
       }     
    }
    public void deleteFamily() {
        town.display();
        System.out.println("Nhap ten ho gia muon xoa bo : ");
       String familyName = sc.nextLine();
       for(int i = 0; i < familyList.size();i++) {
        if(familyList.get(i).getFamilyName().equals(familyName)) {
            familyList.remove(i);
            System.out.println("da xoa ho gia dinh khoi khu pho");
            break;
        }         
       }     
    }
    
    public void deletePerson() {
        town.display();  
        System.out.println("nhap ten ho khau");      
         String familyName = sc.nextLine(); 
         
        for(int i = 0;i< familyList.size();i++) {
             if(familyList.get(i).getFamilyName().equals(familyName)){
                  familyList.get(i).getFamilys().forEach(p -> {
                      System.out.println(p.toString());
                  });
                 System.out.println("nhap ten nguoi muon xoa khoi ho khau");
                 String name = sc.nextLine();
                 for(int j = 0; j < familyList.get(i).getFamilys().size();j++) {
                     if(familyList.get(j).getFamilys().get(j).getName().equals(name)) {
                        familyList.get(j).getFamilys().remove(j);
                         System.out.println("da xoa thanh vien trong gia dinh thanh cong");
                     }
                 }
             }
        }
        
    }
    
    public void editInfo() {
         town.display();  
        System.out.println("nhap ten ho khau");      
         String familyName = sc.nextLine(); 
        for(int i = 0;i< familyList.size();i++) {
             if(familyList.get(i).getFamilyName().equals(familyName)){
                 familyList.get(i).display();
                 System.out.println("nhap ten nguoi muon thay doi thong tin");
                 String name = sc.nextLine();
                 for(int j = 0; j < familyList.get(i).getFamilys().size();j++) {
                     if(familyList.get(j).getFamilys().get(j).getName().equals(name)) {
                         
                        for(;true;) {
                            System.out.println("--------------");
                            System.out.println("moi chon chuc nang ");
                            System.out.println("1 : doi ten \n 2: doi tuoi \n 3: doi cong viec hien tai \n 4: thoat");
                          int choose = sc.nextInt() ;
                          sc.nextLine();
                         switch (choose) {
                             case 1:
                                 familyList.get(j).getFamilys().get(j).setName(sc.nextLine());
                                 break;
                             case 2:
                                 familyList.get(j).getFamilys().get(j).setAge(Integer.parseInt(sc.nextLine()));
                                 break;
                             case 3:
                                 familyList.get(j).getFamilys().get(j).setJob(sc.nextLine());
                                 break;
                             case 4:
                                return;
                               
                             default:
                                 System.out.println("nhap sai xin nhap lai");;
                                 choose = Integer.parseInt(sc.nextLine());
                         }
                        }
                        
                        
                     }
                 }
             }
        }
    }
    
    public void display() {
        this.familyList.forEach(p -> {
            System.out.println(p.toString());;
        });
    }
    
    
    
    
}
