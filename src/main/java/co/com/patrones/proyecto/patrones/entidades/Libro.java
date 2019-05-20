/**
 * 
 */
package co.com.patrones.proyecto.patrones.entidades;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author asus
 *
 */
@Entity
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Basic
	private String nombre;
	
	@Basic
	private String editorial;
	
	@Basic
	private String autor;
	
	@Basic
	private BigDecimal precio;
	
	@Basic
	private Integer cantidad;
	
	@Basic
	private Boolean escogido;
	
	@Basic
	private String nombreArchivo;
	
	@Basic
    private byte[] imagen;
	
	public Libro() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param editorial
	 * @param autor
	 * @param precio
	 * @param cantidad
	 */
	public Libro(Long id, String nombre, String editorial, String autor, BigDecimal precio, Integer cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.editorial = editorial;
		this.autor = autor;
		this.precio = precio;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}



	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}



	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}



	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}



	/**
	 * @return the precio
	 */
	public BigDecimal getPrecio() {
		return precio;
	}



	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
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

	/**
	 * @return the escogido
	 */
	public Boolean getEscogido() {
		return escogido;
	}

	/**
	 * @param escogido the escogido to set
	 */
	public void setEscogido(Boolean escogido) {
		this.escogido = escogido;
	}

	/**
	 * @return the imagen
	 */
	public byte[] getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	/**
	 * @return the nombreArchivo
	 */
	public String getNombreArchivo() {
		return nombreArchivo;
	}

	/**
	 * @param nombreArchivo the nombreArchivo to set
	 */
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	

}
