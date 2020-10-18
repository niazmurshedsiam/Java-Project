
package shopstore;

public class Product {
    private String name;
    private String pcode;
    private String company;

    public Product(String name, String pcode, String company) {
        this.name = name;
        this.pcode = pcode;
        this.company = company;
    }
  public String getName() {
        return name;
    }

    public String getPcode() {
        return pcode;
    }

    public String getcompany() {
        return company;
    }
    

   

   public void show(){
       System.out.println(".....Product info....");
       
       System.out.println("Product Name = "+name);
       System.out.println("Product Code = "+pcode);
       System.out.println("Product Company = "+company);
       
   }
    
}
