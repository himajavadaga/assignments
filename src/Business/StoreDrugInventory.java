/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class StoreDrugInventory {
    
    
    private ArrayList<Inventory> storeDrugInventory;
    
    public StoreDrugInventory(){
        storeDrugInventory=  new ArrayList<Inventory>();
        
    }

    public ArrayList<Inventory> getStoreDrugInventory() {
        return storeDrugInventory;
    }

    public void setStoreDrugInventory(ArrayList<Inventory> storeDrugInventory) {
        this.storeDrugInventory = storeDrugInventory;
    }
    
    
}
