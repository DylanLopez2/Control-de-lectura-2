public class Pedido{
	public String cliente;
	public String hamburguesa;
	public String estado;
	public Double total;
	
	public Pedido(String cliente, String hamburguesa, String estado, Double total){
	    this.cliente=cliente;
	    this.hamburguesa=hamburguesa;
	    this.estado=estado;
	    this.total=total;
	}
	
	public void Calculartotal() {
		System.out.println("Se calcula el siguiente pedido " + cliente );
	}
	public void Actualizarestado() {
		System.out.println("Se acualizo el pedido "+ cliente);
	}

}
	