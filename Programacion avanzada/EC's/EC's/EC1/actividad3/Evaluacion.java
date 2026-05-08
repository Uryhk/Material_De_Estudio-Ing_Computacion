package actividad3;

import java.util.HashMap;
public class Evaluacion
{
//mapa que relaciona Autos con una patente del tipo String
public HashMap<String,Auto> mapaDeAutos;
	
//Constructor
public Evaluacion () {
    mapaDeAutos=new HashMap<String,Auto>();
}    

/**
 * pinta todos los Autos del mapa del color especificado
 */
public void pintarTodos (String color) 
{
    for(String s: mapaDeAutos.keySet())
    {
        Auto a= mapaDeAutos.get(s);
        a.pintar(color);
    }
// TODO: Implementar metod
}

public HashMap<String, Auto> getMapaDeAutos() {
    return mapaDeAutos;
}

}
