
package domain;


public class Client {
    private String id;
    private String name;
    private String phone;
    private String address;
    
    public Client(){
        
    }

    public Client(String id, String name, String phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String result = "\n Client Information"
                + "\n ______________________________________"
                + "\n Id: " + this.getId()
                + "\n Name: " + this.getName()
                + "\n Phone: " + this.getPhone()
                + "\n Address: " + this.getAddress();
        return result;
    }
    
    
    
    
    
    
    
}
