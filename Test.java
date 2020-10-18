
package shopstore;


public class Test {

  public static void main(String[] args) {
        
        Shopstores s;
        s = new Salers("173-5522","karim","1Gha/7A,Dhanmondhi","01706263727");
        s.show();
    Product p1= new Product("fish","f101","Pran");
       Product p2= new Product("meat","m1002","Desh ");
      p1.show();
      p2.show();
      ProductBuy pbuy1 = new ProductBuy(1,300,p1);
    ProductBuy pbuy2 = new ProductBuy(1,500,p2);
    pbuy1.show();
      pbuy1.show();
       Customer customer1 = new Customer("asif","dhanmondhi","01676257279",pbuy1);
      customer1.show();
       Customer customer2 = new Customer("akib","dhanmondhi","01676257279",pbuy2);
      customer2.show();
       
     
    }
   
}
