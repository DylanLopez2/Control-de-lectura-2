public class Empleado{
	public String usuario;
	public String registro;
	public String interfaz;
	public String publicaciones;
	
	public Empleado(String usuario, String registro, String interfaz, String publicaciones){
	    this.usuario=usuario;
	    this.registro=registro;
	    this.interfaz=interfaz;
	    this.publicaciones=publicaciones;
	}
	
	public void Antenderpedido() {
		System.out.println("Se atendio el siguiente pedido " + usuario );
	}
	public void Prepararhamburguesa() {
		System.out.println("Se preparo el siguiente pedido "+ usuario);
	}
	public void Entregarpedido() {
		System.out.println("Se entrego el siguiente pedido "+ usuario);
	}

}
	