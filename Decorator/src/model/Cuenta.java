package model;


public class Cuenta {
    
    private int id;
    private String Cliente;
    
    public Cuenta(){
        
    }
    
    public Cuenta(int id, String cliente){
        this.id = id;
        this.Cliente = cliente;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getCliente(){
        return Cliente;
    }
    
    public void setCliente(String cliente){
        this.Cliente = Cliente;
    }
}
