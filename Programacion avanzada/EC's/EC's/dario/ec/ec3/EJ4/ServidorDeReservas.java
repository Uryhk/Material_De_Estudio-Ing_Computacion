package ec3.EJ4;

import java.util.HashMap;

public class ServidorDeReservas {
    public static final String ARGUMENTOS_INVALIDOS= "Parametros Invalidos";
    public static final String VUELO_DESCONOCIDO = "Vuelo Desconocido";
    public static final String ASIENTO_OCUPADO = "Asiento Ocupado";
    public static final String PREFIJO_CONFIRMACION = "Conf-";
    //Mapa de ocupacion. Asocia un vuelo (idVuelo) con un Set<Asiento> que
    //contiene el conjunto de asientos ocupados.
    public HashMap<String,Asiento> mapaDeOcupacion;
    public ServidorDeReservas() {
        mapaDeOcupacion = new HashMap<String,Asiento>();}
    /*** Este metodo reserva un asiento en el vuelo especificado, y devuelve
     * un String con el codigo de confirmacion. Cuando los argumentos son
     * null, el metodo lanza IllegalArgumentException con el mensaje apropiado
     * (ARGUMENTOS_INVALIDOS). Cuando el vuelo es desconocido o el asiento
     * esta ocupado, lanza NoDisponibleException con el mensaje apropiado
     * (VUELO_DESCONOCIDO o ASIENTO_OCUPADO segun corresponda)
     * (Como ej, podria usar las siguientes lineas de codigo para
     * obtener la lista de asientos ocupados de un vuelo, para luego agregar
     * un asiento o chequear la existencia de un aseinto en esa lista
     *      Set<Asiento> asientosOcupados = mapaDeOcupacion.get(idVuelo);).
     * @param idVuelo@param asient* @return
     *               el codigo de confirmacion de la reserva, con la forma
     * <PREFIJO_CONFIRMACION><idVuelo>-<fila_del_asiento><ubicacion_del_asiento>
     * Ej:"Conf-LAN2001-11A"
     * @throws NoDisponibleException cuando
     *          1. el idVuelo no existe en el mapaDeOcupacion (i.e., no pertenece a
     *             las keys del mapaDeOcupacion)
     *          2. el asiento esta ocupado en el vuelo requerido (i.e, el asiento esta
     *             incluido en Set de asientos del mapaDeOcupacion asociado al vuelo
     *             especificado)
     * @throws IllegalArgumentException cuando
     * 			1. idVuelo o asiento son null*/
    public String reservar(String idVuelo, Asiento asiento) throws NoDisponibleException,IllegalArgumentException {
        Asiento asientosOcupados = mapaDeOcupacion.get(idVuelo);
        try{
            return PREFIJO_CONFIRMACION+"-"+idVuelo+"-"+asiento.getFila()+asiento.getUbicacion();}
        catch (NoDisponibleException ex) {
            if( asientosOcupados.equals(asiento)){
                return ASIENTO_OCUPADO;}
            else {
                return VUELO_DESCONOCIDO;}}
        catch (IllegalArgumentException ex2){
            return ARGUMENTOS_INVALIDOS;}


    }


