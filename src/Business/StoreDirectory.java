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
public class StoreDirectory {
  private ArrayList<Store> storeDict;
 
  public StoreDirectory(){
      storeDict = new ArrayList<Store>();
      
  }
  
  
  public int size(){
  
  return storeDict.size();
  }

    public ArrayList<Store> getStoreDict() {
        return storeDict;
    }

     public Store addStore(){
        Store st = new Store();
        storeDict.add(st);
        return st;
    }
    
    public void removeStore(Store st){
        storeDict.remove(st);
    }
    
    public Store searchStore(String keyword){
        for (Store store : storeDict) {
            if(store.getStoreName().equals(keyword)){
                return store;
            }
        }
        return null;
 
  
    }

    
    
}
