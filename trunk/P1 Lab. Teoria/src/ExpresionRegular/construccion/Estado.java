package ExpresionRegular.construccion;
import java.util.*;
/**
 * En esta clase definimos el comportamiento que tiene la máquina
 * 
 * @version 1.0
 * @author Sebastian
 */
public final class Estado {
    /**
     * Es el nombre del <code>Estado</code> por defecto no tiene ninguno.
     */
    private String name;
    /**
     * En este campo verificamos si el <code>Estado</code> es inicial.
     */
    private boolean inicial;
    /**
     * En este campo verificamos si el <code>Estado</code> es de aceptación.
     */
    private boolean aceptacion;
    /**
     * Esta colección de datos mantenemos las transiciones que tiene este
     * estado a otros.
     */
    private Vector<Transicion> transiciones;
    /**
     * Constructor por defecto de <code>Estado</code> que asigna nombre en
     * blanco, acaptación e inicial en falso, e instancia la coleccion de
     * <code>Trancision</code>.
     */
    public Estado(){
        setNombre("");
        setAceptacion(false);
        setInicial(false);
        this.transiciones = new Vector<Transicion>();
    }
    /**
     * Constructor en el cual construimos un estado con un nombre definido,
     * especificamos si es inicial y de aceptación.
     *
     * @param nombre nombre especifico que se le da al estado.
     * @param inicial true si es de inicial, en caso contrario false.
     * @param aceptacion true si es de aceptación, en caso contrario false.
     */
    public  Estado(String nombre, boolean inicial,boolean aceptacion){
        setNombre(nombre);
        setInicial(inicial);
        setAceptacion(aceptacion);
        this.transiciones = new Vector<Transicion>();
    }
/**
 * En este método le asignamos un nombre al estado
 * @param nombre nombre especifico que le queremos asignar.
 */
    public void setNombre(String nombre){
        name=nombre;
    }
    /**
     * Método en el cual asignamos 
     * @param aceptacion
     */

    public void setAceptacion(boolean aceptacion){
        this.aceptacion=aceptacion;

    }
/**
 *
 * @param inicial
 */
    public void setInicial(boolean inicial){
        this.inicial=inicial;
    }
    /**
     *
     * @return
     */

    public String getNombre(){
        return name;
    }
    /**
     *
     * @return
     */

    public boolean esAceptacion(){
        return aceptacion;
    }
    /**
     *
     * @return
     */

    public boolean esInicial(){
        return inicial;
    }
/**
 *
 * @param trancisiones
 */
    public void setTransicion(Vector<Transicion> trancisiones){
        this.transiciones=trancisiones;
    }
/**
 *
 * @param i
 * @return
 */
    public Transicion getTransicion(int i){
        return transiciones.get(i);
    }
    /**
     *
     * @return
     */

     public Vector <Transicion> getTransicion(){
        return transiciones;
    }
     /**
      *
      * @param transicion
      */

    public void agregarTransicion(Transicion transicion){
        transiciones.addElement(transicion);
    }
    /**
     *
     * @param estadoFinal
     * @param simbolo
     */

    public void agregarTransicion(Estado estadoFinal, char simbolo){
        transiciones.addElement(new Transicion(estadoFinal, simbolo));
    }
    /**
     *
     * @return
     */
    public int getLengthTrancisiones(){
        return transiciones.size();
    }
    /**
     *
     */
    public void removerTransiciones(){
        transiciones.removeAll(transiciones);
    }
}
