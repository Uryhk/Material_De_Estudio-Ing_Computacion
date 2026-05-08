package ec2.EJ1;

import java.util.HashMap;

public class Carta {
    HashMap <Bebida,Integer> carta;

    /**
     *  Inicializa un HashMap para almacenar todas las bebidas del enumerado
     *  y sus precios. Debe asignar precio por defecto 30
     **/
    public Carta (){
        //TODO Implementar

        carta=new HashMap<Bebida,Integer>();
       /* for (Bebida b : Bebida.values()){
            carta.put(b,30);
        }*/
    }


    /**
     *  Ajusta el precio de una bebida en particular
     **/
    public void setPrecio (Bebida b, int precio){
       carta.put(b,precio);
    }
    /**
     *  Retorna el precio de una bebida en particular
     **/
    public int getPrecio(Bebida b){
        return carta.get(b);
    }

    /**
     *  Retorna el HashMap Carta
     **/
    public HashMap<Bebida,Integer> getCarta(){
        return carta;
    }

}