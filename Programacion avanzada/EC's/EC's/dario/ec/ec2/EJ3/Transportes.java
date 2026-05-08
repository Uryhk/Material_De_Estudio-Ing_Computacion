package ec2.EJ3;
import java.util.ArrayList;

public class Transportes {
    ArrayList<Vehiculo> moviles;

    public Transportes () {
        moviles = new ArrayList<>();
    }

    public void addMovil (Vehiculo v) {
        moviles.add(v);
    }

    public ArrayList<Aereo> getAereos () {
        ArrayList<Aereo> a = new ArrayList<>();
        for (Vehiculo v : moviles) {
            if (v.getMedio().equals(Tipo.AEREO)) {
                a.add((Aereo) v);
            }
        }
        return a;
    }}