package ec1.EJ3;

import java.util.HashSet;
import java.util.ArrayList;

public class Evaluacion {
    public ArrayList<Persona> personas;

    //Constructor
    public Evaluacion () {
        personas = new ArrayList<Persona>();

    }

    /**
     * Devuelve un HashSet con todas las personas mayores o iguales a 18 anios.
     */
    public HashSet<Persona> listaVotantes ( ){
        // TODO: Implementar metodo
        HashSet<Persona> lista = new HashSet<Persona>();
        for (Persona p:personas){
            if (p.getEdad() >= 18){
                lista.add(p);
            }
        }
        return lista;
    }
}