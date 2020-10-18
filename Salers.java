
package shopstore;


public class Salers extends Shopstores{
 private String id;
 private int phone;


 Salers(String id, String name, String address, String Phoneno) {
        super(name, address, Phoneno);
        this.id = id;
    }
 
 public String getId() {
        return id;
    }
    
 public void show(){
     System.out.println(".......Salers info......"); 
     System.out.println("Salers Name = "+this.name);
     System.out.println("Salers Id = "+this.id);
     System.out.println("Salers Address = "+this.address);
     System.out.println("Salers Phone = "+this.Phoneno);
 }
}
