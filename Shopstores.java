
package shopstore;


abstract class Shopstores {
    abstract void show();
    protected String name;
    protected String address;
    protected String Phoneno;

    public Shopstores(String name, String address, String Phoneno) {
        this.name = name;
        this.address = address;
        this.Phoneno = Phoneno;
    }
    public Shopstores(String name, String adress){
        this.name=name;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneno() {
        return Phoneno;
    }
    
}
