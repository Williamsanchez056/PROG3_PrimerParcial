public class ProductoEletronico extends producto{
    private int mesaGaratia;

    public int mesaGaratia(){
        return mesaGaratia;
    }
    public int setmesaGaratia(){
        return mesaGaratia;
    }

    public ProductoEletronico(int mesaGaratia){
        setmesaGaratia(mesaGaratia);
        
    }
    public double calcularPrecioConGarantia(){
        if (garantia > 12){
            System.out.println("Agregar 50");
        }
    }
    public String obtenerInformacion(){
        
    }
}