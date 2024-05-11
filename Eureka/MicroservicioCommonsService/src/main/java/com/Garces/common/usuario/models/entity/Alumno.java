package com.Garces.common.usuario.models.entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nombre;
	private String apellido;
	private String email;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
	
	@PrePersist
	private void prePersiste() {
		this.createAt = new Date();
	}
	
	public Alumno(Long id, String nombre, String apellido, String email, Date createAt) {
		this.Id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.createAt = createAt;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	@Override
	public boolean equals(Object obj) {

		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Alumno)) {
			return false;
		}
		Alumno a = (Alumno) obj;
		return this.Id !=null && this.Id.equals(a.getId());
	}
	
	
}
