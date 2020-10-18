
package shopstore;


public class Customer {
   private String name;
   private String address,phone;
  
   ProductBuy productbuy;

    public Customer(String name, String address, String phone, ProductBuy productbuy) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.productbuy = productbuy;
    }
   

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public ProductBuy getProductbuy() {
        return productbuy;
    }

    

    
   
    public void show(){
        System.out.println("......Customer Info....");
        System.out.println("Customer Name = "+name);
        System.out.println("Customer Address = "+address);
        System.out.println("Customer phone = "+phone);
        System.out.println("Product  calculation = "+ productbuy.getPrice());
        System.out.println("Product  calculation = "+ productbuy.getQuantity());
        System.out.println("Product  calculation = "+ productbuy.productcalculation());

      
    }
    
}
