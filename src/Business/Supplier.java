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
public class Supplier {
     
   private String supplyName;
    private DrugCatalog drugCatalog;
      
      public Supplier(){
          drugCatalog = new DrugCatalog();
                   
      }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

    public void setDrugCatalog(DrugCatalog drugCatalog) {
        this.drugCatalog = drugCatalog;
    }
  @Override
 public String toString(){
     return String.valueOf(supplyName);
  
 }
}

    