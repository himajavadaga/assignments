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
public class DrugCatalog {

    
    private List<Drug> drugCatalog;

    public DrugCatalog() {
    drugCatalog = new ArrayList<Drug>();
    }
    
    public List<Drug> getDrugcatalog(){
        return drugCatalog;
    }
    
    
    public Drug addDrug(){
        Drug d = new Drug();
        drugCatalog.add(d);
        return d;
    }
    
    public void removeDrug(Drug d){
        drugCatalog.remove(d);
    }
    
    public Drug searchDrug(int id){
        for (Drug drug : drugCatalog) {
            if(drug.getDrugId()==id){
                return drug;
            }
        }
        return null;
    }
}
   

