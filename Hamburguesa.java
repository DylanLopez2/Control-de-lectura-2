public class Hamburguesa
{
	public String nombre;
	public String ingrediente;
	public int tamaño;
	public String sabor;
	
	public Hamburguesa(String nombre, String ingrediente, int tamaño, String sabor){
	    this.nombre=nombre;
	    this.ingrediente=ingrediente;
	    this.tamaño=tamaño;
	    this.sabor=sabor;
	}
	
	public void Agregaringredientes() {
		System.out.println("Se agregaron los ingredientes a la hamburguesa  " + nombre);
	}
	public void Eliminaringredientes() {
		System.out.println("Se eliminaron algunos ingredientes de la hamburguesa " + nombre);
	}
	public void Prepararingredientes() {
		System.out.println("Se prepararon los ingredientes de la hamburguesa " + nombre);
	}
	
	

}