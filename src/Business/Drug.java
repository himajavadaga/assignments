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
public class Drug {
    
    private String drugName;
    private int price;
    private int drugId;
    private int avail;
      
    private static int count =0;

    @Override
    public String toString() {
        return drugName; //To change body of generated methods, choose Tools | Templates.
    }
     public int getAvail() {
        return avail;
    }
    
    public void setAvail(int avail) {
        this.avail = avail;
    }
    
    public Drug() {
    count++;
    drugId = count;
    }

    public String getProdName() {
        return drugName;
    }

    public void setdrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }
    
   
    
}
