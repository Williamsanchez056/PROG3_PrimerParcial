public class producto{
    private String nombre;
    private double precio;
    private int stock;

    public double getprecio(){
        return precio;
    }
    public int getstock(){
        return stock;
    }
    public String getnombre(){
        return nombre;
    }
    public String setnombre(){
        return nombre;
    }
    public double setprecio(){
        return precio;
    }
    public int setstock(){
        return stock;
    }

    public void reducirStock(int cantidad){
        System.out.print(cantidad - cantidad);
    }

}