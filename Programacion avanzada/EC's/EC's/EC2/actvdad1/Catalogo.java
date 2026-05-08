package actvdad1;

import java.util.HashMap;

public class Catalogo 
{
    HashMap <Auto,Integer> catalogo;
    /**
     *  Inicializa un HashMap para almacenar todos los autos
     *  del enumerado y el precio de alquiler. Debe asignar
     *  precio por defecto 1500
     **/
    public Catalogo()
    {
        catalogo= new HashMap<Auto , Integer>();
        for(Auto p: Auto.values())
        {
            catalogo.put(p, 1500);
        }
    }
    
    /**
     *  Ajusta el precio de alquiler de un auto en particular
     **/
    public void setPrecio (Auto a, int precio)
    {
        catalogo.put(a, precio);
    }
    /**
     *  Retorna el precio de alquiler de un auto en particular
     **/
    public int getPrecio(Auto a){
        return catalogo.get(a);
    }
    
    /**
     *  Retorna el HashMap Catalogo
     **/
    public HashMap<Auto,Integer> getCatalogo(){
        return catalogo;
    }   
}
