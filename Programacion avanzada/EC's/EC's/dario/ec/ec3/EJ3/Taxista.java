package ec3.EJ3;
public class Taxista extends Persona implements Conductor, ConductorPesado {
/**
 * Implemente la clase 'Taxista' que extiende de 'Persona' e implementa la interfaz 'Conductor'
 * 1. Debera codificar un constructor para esta clase que reciba los parametros "String nombre" y "String dni"
 * 2. Debera codificar los metodos necesarios declarados en la interfaz implementada.
 * 3. Un taxista maneja a la maxima velocidad permitida para un Conductor (VEL_MAX)
 * NOTA: Segun nuestro modelo, asuma los siguientes comportamientos para los metodos declarados en las interfaces
 **/
private String nombre;
private String dni;
    public Taxista(String nombre, String dni) {
        super(nombre, dni);
    }
      public void manejar(Vehiculo v, String direccion){
         //   a. Llevar el vehiculo a una direccion, (i.e., setea la direccion en el vehiculo)
         v.setUbicacion(direccion);
          //   b. Setear una velocidad crucero.
         v.setVelocidad(50);
     }
     public void transportar(Vehiculo v, String direccion, Carga c) {
         //     a. Llevar el vehiculo a una direccion.
         v.setUbicacion(direccion);
         //     b. Setear una velocidad crucero.
         v.setVelocidad(100);
         //     c. Marcar la carga como "despachada"
         c.setDespachado(true);
     }}
