
/**
 * Write a description of class Gerencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gerencia extends Empleado
{
    
    String lista;
    

    public Gerencia(String dni,String nombre, int telefono, String puesto, String ocupacion, String especialidad, String turno, String lista) {
        super(dni,nombre, telefono, puesto, ocupacion, especialidad,turno);
            this.lista = lista;
    }
    
    public String getLista(){
        return lista;
    }
    
    public void setLista(String lista){
        this.lista=lista;
    }
}
