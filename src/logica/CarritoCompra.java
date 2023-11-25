package logica;

import java.sql.Date;

import javax.swing.JOptionPane;

public class CarritoCompra {

	private long cantidadItems;
	private Date fechaCreacion;
	private boolean retorno = false;

	public CarritoCompra() {

	}

	public long getCantidadItems() {
		return cantidadItems;
	}

	public void setCantidadItems(long cantidadItems) {
		this.cantidadItems = cantidadItems;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public boolean ingresarCantidadMaxima(int cantidadItems) {
		
		if (cantidadItems <= 10)
			retorno = true;
		
		return retorno;
	}
//	4.8.	Declarar en la clase CarritoCompras un método 
//	llamado ingresarCantidadMaxima, que reciba como arlong gumento un valor 
//	de tipo entero, y retorne un valor booleano, }
//que sea true si el argumento es menor o igual a 10, y false en caso contrario.

}

