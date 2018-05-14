
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ganesh
 */
public class ProductDetails implements Serializable {
    public String name;
    public int price;
    public String Supplier;
    public int stock;
    public boolean flag=true;

    public ProductDetails() {
        this.name = null;
        this.price = 0;
        this.Supplier = null;
    }
    
    
}
