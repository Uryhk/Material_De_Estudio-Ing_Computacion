package Recuperatorio.actividad2;

class ClientePremium extends Cliente
{
	//Defina los atributos necesarios de la clase
	private int descuento;
	//Implemente los siguientes metodos
	public ClientePremium(String nombre, int descuento) {
	    super(nombre);
        this.descuento=descuento;
	
	}
	public int getDescuento() {
		return descuento;
	}
}