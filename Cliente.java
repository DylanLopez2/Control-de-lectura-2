public class Cliente{
	public String nombre;
	public Double precio;
	public String ingredientes;
	
	public Cliente(String nombre, Double precio, String ingredientes){
	    this.nombre=nombre;
	    this.precio=precio;
	    this.ingredientes=ingredientes;
	}
	
	public void Realizarpedidos() {
		System.out.println("Se realizaron los siguientes pedidos " + nombre );
	}
	public void Consultarpedidos() {
		System.out.println("Se consultaron los siguientes pedidos "+ nombre);
	}

}
	