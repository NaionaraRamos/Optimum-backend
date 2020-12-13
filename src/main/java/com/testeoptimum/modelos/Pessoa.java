package com.testeoptimum.modelos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private String cpf;
	
	@Column
	private String cep;
	
	@Column
	private String email;
	
	@Column
	private String telefone;
	
	@Column
	private String skype;
	
	@Column
	private String estado;
	
	@Column
	private String cidade;
	
	@Column
	private LocalDate dataNascimento;
}
