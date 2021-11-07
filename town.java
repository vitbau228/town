/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Town;

import java.util.ArrayList;

/**
 *
 * @author Hello VIỆT
 */
public class town {
    private final ArrayList<Family> town;

    public town() {
        this.town = new ArrayList<>();
    }
    public void addFamily(Family e) {
        this.town.add(e);
    }
    public void deleteFamily(String familyName ) {
        for(int i = 0;i<town.size();i++) {
            if(town.get(i).getFamilyName().equals(familyName)) {
                town.remove(i);
            }
        }
    }
    
    public int countFamily() {
        int count =0; 
        for (int i = 0; i < town.size(); ){
            count +=1;
        }
        return count;
    }
    
    public void display() {
        town.forEach(p -> {
            System.out.println(p.toString());
        });
    }

    public ArrayList<Family> getTown() {
        return town;
    }
    

    
    
}
