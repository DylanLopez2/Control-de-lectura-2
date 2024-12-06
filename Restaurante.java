public class Restaurante{
	public String nombre;
	public int empleados;
	public String menu;
	public String ubicacion;
	
	public Restaurante(String nombre, int empleados, String menu, String ubicacion){
	    this.nombre=nombre;
	    this.empleados=empleados;
	    this.menu=menu;
	    this.ubicacion=ubicacion;
	}
	
	public void Agregarhamburguesa() {
		System.out.println("Se agregaron nuevos ingredientes al menú del restaurante "+ nombre );
	}
	public void Eliminarhamburguesa() {
		System.out.println("Se eliminaron algunos ingredientes del menú del restaurante "+ nombre);
	}
	public void Gestionarpedido() {
		System.out.println("Se preparó un nuevo plato en el restaurante " + nombre);
	}

}
	