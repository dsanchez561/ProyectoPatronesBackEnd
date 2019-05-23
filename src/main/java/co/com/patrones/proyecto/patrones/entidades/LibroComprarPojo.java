/**
 * 
 */
package co.com.patrones.proyecto.patrones.entidades;

/**
 * @author brayanguerrero
 *
 */
public class LibroComprarPojo {
	
	private Long id;
	private Integer cantidad;
	
	public LibroComprarPojo() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param id
	 * @param cantidad
	 */
	public LibroComprarPojo(Long id, Integer cantidad) {
		super();
		this.id = id;
		this.cantidad = cantidad;
	}



	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
