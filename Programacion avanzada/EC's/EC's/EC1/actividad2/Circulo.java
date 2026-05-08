package actividad2;

public class Circulo {
    public String identificador;

     /**
     * Si el argumento es distinto de null, setea el identificador,
     * removiendo antes cualquier espacio inicial y conviertiendo a mayusculas.
     * Si el argumento es null, ignora el valor sin setear el identificador
     * @param el nuevo identificador
     */
    public void setIdentificador (String id)
    {
        if(id!=null)
        {
            identificador=id.trim().toUpperCase();

        }
    }
    
    /**
     * retorna el valor del identificador de este Circulo
     */
    public String getIdentificador () {
        return identificador;
    }
}
