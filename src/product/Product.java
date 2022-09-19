
/*
    Physical Presentation of the Product.
*/
package product;

import java.time.LocalDate;
import java.time.LocalDateTime;


public interface Product {

    //Getter    
    public String getBarcode();
    public String getBrand();
    public LocalDateTime getCreatedDate();
    public LocalDate getExpiration();
    public LocalDateTime getModifiedDate();
    public String getName();
    public double getPrice();
    public String getSKU();
    

    //Setter    
    public void setBarcode(String barcode);
    public void setBrand(String brand);
    public void setCreatedDate(LocalDateTime createdDate);
    public void setExpiration(LocalDate expiration);
    public void setModifiedDate(LocalDateTime modifiedDate);
    public void setName(String name);
    public void setPrice(double price);
    public void setSKU(String sku);
    
}
