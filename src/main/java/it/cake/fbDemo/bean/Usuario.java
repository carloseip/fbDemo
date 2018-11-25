package it.cake.fbDemo.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public Usuario() {
	}

	public Usuario(int id, String nombre, String apellidos, String celular, int edad, String correo,
			List<Publicacion> publicaciones) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.celular = celular;
		this.edad = edad;
		this.correo = correo;
		this.publicaciones = publicaciones;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="IdUsuario", nullable=false)
	private int id;
	
	@Column(name="Nombres", nullable= false, length=45)
	private String nombre;
	
	@Column(name="Apellidos", nullable= false, length=45)
	private String apellidos;
	
	@Column(name="NumeroCelular", nullable= false, length=9)
	private String celular;
	
	@Column(name="Edad", nullable=false)
	private int edad;
	
	@Column(name="Correo", nullable=false, length=30)
	private String correo;
	
	@OneToMany(mappedBy="usuario", cascade=CascadeType.ALL)
	private List<Publicacion> publicaciones = new ArrayList<Publicacion>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(List<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}
	
}
