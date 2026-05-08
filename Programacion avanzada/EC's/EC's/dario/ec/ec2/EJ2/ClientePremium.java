package ec2.EJ2;
class ClientePremium extends Cliente {
    private Integer descuento;
    public ClientePremium(String nombre, Integer descuento) {
        super(nombre);
        this.descuento = descuento;
    }

    public Integer getDescuento() {
        return descuento;
    }
}
