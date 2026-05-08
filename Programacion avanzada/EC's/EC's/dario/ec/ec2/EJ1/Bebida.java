package ec2.EJ1;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Bebida {
//rivate  String[] bebidas= ("JUGO", "CAFE", "CERVEZA", "TRAGO", "GASEOSA");
   //private ArrayList<String> bebidas = Arrays.asList("Amsterdam", "Paris", "London");



}
package ec2.EJ2;

import java.util.HashMap;

public class Carta {
    HashMap <Bebida,Integer> carta;

    /**
     *  Inicializa un HashMap para almacenar todas las bebidas del enumerado
     *  y sus precios. Debe asignar precio por defecto 30
     **/
    public Carta (){
        carta = new HashMap<Bebida,Integer>();
        for (Bebida b : Bebida.values()){
            carta.put(b,30);
        }
    }
    /**
     *  Ajusta el precio de una bebida en particular
     **/
    public void setPrecio (Bebida b, int precio){
        carta.put(b,precio);
        //throw new Exception(); // No olvide comentar esta linea
    }
    /**
     *  Retorna el precio de una bebida en particular
     **/
    public int getPrecio(Bebida b){
        return carta.get(b);
        //throw new Exception(); // No olvide comentar esta linea
    }

    /**
     *  Retorna el HashMap Carta
     **/
    public HashMap<Bebida,Integer> getCarta(){
        return carta;
        //throw new Exception(); // No olvide comentar esta linea
    }

}