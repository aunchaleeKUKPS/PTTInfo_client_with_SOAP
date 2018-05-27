package Model;


import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MA-Aunchalee
 */
//serialize
public class DataAccess {
     String PRICE_DATE;
     String PRODUCT;
     String PRICE;

     public DataAccess(String PriceDate, String Product, String Price){
         this.PRICE_DATE = PriceDate;
         this.PRODUCT = Product;
         this.PRICE = Price;
     }
     public DataAccess(){
     }
    public String getPRICE_DATE() {
        return PRICE_DATE;
    }
@XmlElement
    public void setPRICE_DATE(String PRICE_DATE) {
        this.PRICE_DATE = PRICE_DATE;
    }

    public String getPRODUCT() {
        return PRODUCT;
    }
@XmlElement
    public void setPRODUCT(String PRODUCT) {
        this.PRODUCT = PRODUCT;
    }

    public String getPRICE() {
        return PRICE;
    }
@XmlElement
    public void setPRICE(String PRICE) {
        this.PRICE = PRICE;
    }
    
}
