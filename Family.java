/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Town;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hello VIỆT
 */
public class Family {
    private List<Person> familys;
    private String familyName;
    private String address;

    public Family( String address) {
        this.familys = new ArrayList<>();
        this.address = address;
    }

    public Family(String familyName, String address) {
        this(address);
        this.familyName = "ho gia dinh "+familyName;
        
    }
    

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    
    public String getAddress() {
        return address;
    }

    public List<Person> getFamilys() {
        return familys;
    }

    public void setFamilys(List<Person> familys) {
        this.familys = familys;
    }
    

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void deletePerson(String name){
     for(int i = 0; i < familys.size();i++) {
         if(familys.get(i).getName().equals(name)) {
             familys.remove(i);
         }
     }   
    }
    
    public void addPerson(Person person) {
        this.familys.add(person);
    }

    @Override
    public  String toString() {
        return "FamilyName =" + familyName+ '{' + "family=" + familys + ", address=" + address + '}';
    }
    
   public void display(){
       familys.forEach(person -> {
           System.out.println(person.toString());
        });
   }
    
    
}
