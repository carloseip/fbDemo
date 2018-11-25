package it.cake.fbDemo.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="publicacion")
public class Publicacion implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public Publicacion() {
	}

	public Publicacion(int idPublicacion, String descripcion, Usuario usuario) {
		IdPublicacion = idPublicacion;
		this.descripcion = descripcion;
		this.usuario = usuario;
	}



	@Id
	@Column(name="IdPublicacion", nullable= false)
	private int IdPublicacion;
	
	@Column(name="Descripcion", nullable= false)
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="IdUsuario")
	private Usuario usuario;


	public int getIdPublicacion() {
		return IdPublicacion;
	}


	public void setIdPublicacion(int idPublicacion) {
		IdPublicacion = idPublicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
