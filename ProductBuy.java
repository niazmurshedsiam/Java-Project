
package shopstore;


public class ProductBuy {
   private float quantity,price;
   Product product;

    public ProductBuy(float quantity, float price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public float getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

  
  public float productcalculation(){
       
       
       float totalcost = price * quantity;
 return totalcost;
    }
 public void show(){
     System.out.println(".....Product buy info....");
       System.out.println("Product Name = "+product.getName());
     System.out.println("Product code = "+product.getPcode());
     System.out.println("Product Company = "+product.getcompany());
     System.out.println("Product price = "+price);
     System.out.println("Product Quantity = "+quantity);
     System.out.println("Product TotalCost = "+productcalculation());
   
 }   
   
}
