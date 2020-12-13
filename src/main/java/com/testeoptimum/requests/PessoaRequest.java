package com.testeoptimum.requests;

import lombok.Data;

@Data
public class PessoaRequest {
	
	private Long id;
	private String nome;
	private String cpf;
	private String cep;
	private String email;
	private String telefone;
	private String skype;
	private String estado;
	private String cidade;
}
