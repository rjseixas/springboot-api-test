package com.example.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/*@Data -> verificar porque não está funcionando*/
@Entity
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idlivro;
	
	@Column (nullable = false)
	private String nmlivro;
	
	@Column (nullable = false)
	private String dslivro;
	
	public Long getIdlivro() {
		return idlivro;
	}

	public void setIdlivro(Long idlivro) {
		this.idlivro = idlivro;
	}

	public String getNmlivro() {
		return nmlivro;
	}

	public void setNmlivro(String nmlivro) {
		this.nmlivro = nmlivro;
	}

	public String getDslivro() {
		return dslivro;
	}

	public void setDslivro(String dslivro) {
		this.dslivro = dslivro;
	}
}
