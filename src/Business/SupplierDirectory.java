/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SupplierDirectory {
    
    
    private ArrayList<Supplier> supplierDict;
   
    public SupplierDirectory() {
    
        supplierDict = new ArrayList<Supplier>();
    }
    
    public List<Supplier> getSupplierlist(){
        return supplierDict;
    }
    
    public Supplier addSupplier(){
        Supplier s = new Supplier();
        supplierDict.add(s);
        return s;
    }
    
    public void removeSupplier(Supplier s){
        supplierDict.remove(s);
    }
    
    public Supplier searchSupplier(String keyword){
        for (Supplier supplier : supplierDict) {
            if(supplier.getSupplyName().equals(keyword)){
                return supplier;
            }
        }
        return null;
    }
}
