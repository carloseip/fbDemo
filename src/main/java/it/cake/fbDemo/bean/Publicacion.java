package it.cake.fbDemo.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Publicacion")
public class Publicacion implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public Publicacion() {
		
	}


	public Publicacion(int IdPublicacion, int descripcion, Usuario usuario) {
		this.IdPublicacion = IdPublicacion;
		this.descripcion = descripcion;
		this.usuario = usuario;
	}


	@Id
	@Column(name="IdPublicacion", nullable= false)
	private int IdPublicacion;
	
	@Column(name="Descripcion", nullable= false)
	private int descripcion;
	
	@ManyToOne
	@JoinColumn(name="IdUsuario")
	private Usuario usuario;


	public int getIdPublicacion() {
		return IdPublicacion;
	}


	public void setIdPublicacion(int idPublicacion) {
		IdPublicacion = idPublicacion;
	}


	public int getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(int descripcion) {
		this.descripcion = descripcion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
