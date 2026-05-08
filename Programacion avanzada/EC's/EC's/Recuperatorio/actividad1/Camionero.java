package Recuperatorio.actividad1;

    /**
 * Implemente la clase 'Camionero' que extiende de 'Persona' e implementa la interfaz 'ConductorPesado'
 * 
 * 1. Debera codificar un constructor para esta clase que reciba los parametros "String nombre" y "String dni"
 * 2. Debera codificar los metodos necesarios declarados en la interfaz implementada. Nota: ConductorPesado 
 * extiende de Conductor
 * 3. Un camionero maneja a la maxima velocidad permitida para un Conductor (VEL_MAX), pero transporta a
 * la velocidad maxima permitida para circular con carga (VEL_MAX_CON_CARGA)
 * 
* NOTA: Segun nuestro modelo, asuma los siguientes comportamientos para los metodos declarados en las interfaces
 * void manejar (Vehiculo v, String direccion)
 * //   a. Llevar el vehiculo a una direccion, (i.e., setea la direccion en el vehiculo)
 * //   b. Setear una velocidad crucero.
 *      
 * void transportar (Vehiculo v, String direccion, Carga c):
 * //     a. Llevar el vehiculo a una direccion.
 * //     b. Setear una velocidad crucero.
 * //     c. Marcar la carga como "despachada"
 **/
 public class Camionero extends Persona implements Conductor {
    private String nombre;
   private String dni;
       public Camionero(String nombre, String dni) {
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

