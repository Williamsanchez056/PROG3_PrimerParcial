public class EmpledoMedioTiempo extends Empleado{
    private int horasTrabajadas;

    public int gethorasTrabajadas(){
        return horasTrabajadas;
    }


    public EmpledoMedioTiempo(String nombre, double salarioBase, int horasTrabajadas){
        setNombre(nombre);
        setsalarioBase(salarioBase);
        setint (horasTrabajadas);

    }




}