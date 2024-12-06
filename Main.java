public class Main
{
	public static void main(String[] args) {
		Hamburguesa hamburguesa = new Hamburguesa("Clásica", "Carne", 5, "Salada");
        System.out.println("La Hamburguesa: " + hamburguesa.nombre + " con los ingredientes " +hamburguesa.ingrediente + "y con un tamaño de " + hamburguesa.tamaño + " con un sabor a " +hamburguesa.sabor);
		hamburguesa.Agregaringredientes();
        hamburguesa.Eliminaringredientes();
        hamburguesa.Prepararingredientes();
		System.out.println("");
		
		Restaurante restaurante = new Restaurante("A LA BURGUER", 5, "hamburguesa triple", "quito");
        System.out.println("El resturante: "+restaurante.nombre+" tiene "+restaurante.empleados+" empleados y el menu es "+restaurante.menu+" en la ubicacion "+restaurante.ubicacion);
        restaurante.Agregarhamburguesa();
        restaurante.Eliminarhamburguesa();
        restaurante.Gestionarpedido();
        System.out.println("");
        
        Cliente cliente = new Cliente("Dylan", 5.99, "mayonesa");
        System.out.println("El cliente: "+cliente.nombre+" tiene que pagar "+cliente.precio+" con los ingredientes "+cliente.ingredientes);
        cliente.Realizarpedidos();
        cliente.Consultarpedidos();
        System.out.println("");
        
        Pedido pedido = new Pedido("Juan","hamburguesa con papas", "caliente", 7.99);
        System.out.println("El pedido: "+pedido.cliente+" con  la "+pedido.hamburguesa+" con los ingredientes "+pedido.estado+" con un total "+pedido.total);
        pedido.Calculartotal();
        pedido.Actualizarestado();
        System.out.println("");
        
        Empleado empleado = new Empleado("Pepe","3 hamburguesas", "interfaz", "computadora");
        System.out.println("El empleado: "+empleado.usuario+" se registro "+empleado.registro+" en la "+empleado.interfaz+" de la  "+empleado.publicaciones);
        empleado.Antenderpedido();
        empleado.Prepararhamburguesa();
        empleado.Entregarpedido();
	}
}
