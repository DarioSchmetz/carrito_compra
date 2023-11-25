package logica;

public class Usuario extends Persona {

	private String nombreUsuario;
	private CarritoCompra carritoCompra;

	
	public Usuario(String nombreUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public CarritoCompra getCarritoCompra() {
		return carritoCompra;
	}

	public void setCarritoCompra(CarritoCompra carritoCompra) {
		this.carritoCompra = carritoCompra;
	}

}
