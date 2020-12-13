package com.testeoptimum.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PessoaDto {
	
	private Long id;
	private String nome;
	private String cpf;
	private String cep;
	private String email;
	private String telefone;
	private String skype;
	private String estado;
	private String cidade;
	private LocalDate dataNascimento;
}
