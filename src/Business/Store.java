/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Admin
 */
public class Store {
    
    private String storeName;
    private StoreDrugInventory storeDrugInventory;
    
    public Store(){
        storeDrugInventory= new StoreDrugInventory();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public StoreDrugInventory getStoreDrugInventory() {
        return storeDrugInventory;
    }

   
}
