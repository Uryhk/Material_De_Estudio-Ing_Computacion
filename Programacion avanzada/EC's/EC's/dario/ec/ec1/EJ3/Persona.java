package ec1.EJ3;

public class Persona {
    private Integer dni;
    private Integer edad;

    public Persona(Integer dni, Integer edad) {
        this.dni = dni;
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
