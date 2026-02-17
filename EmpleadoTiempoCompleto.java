public class EmpleadoTiempoCompleto extends Empleado{
    private double bono;

    public double getbono(){
        return bono;
    }
    public double setbono(){
        return bono;
    }

    public EmpleadoTiempoCompleto(String nombre, doubel salarioBase, double bono){
        setNombre(nombre);
        setsalarioBase(salarioBase);
        setbono(bono);

    }

    @Override
    public string calcularSalario(){
        return salarioBase(+ bono);
    }

    public toString(){
        System.out.println(nombre[total]);
    }







}