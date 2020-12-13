package com.testeoptimum.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.testeoptimum.dto.PessoaDto;
import com.testeoptimum.modelos.Pessoa;
import com.testeoptimum.requests.PessoaRequest;

@Component
public class PessoaMapper {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public Pessoa requestToModel(PessoaRequest pessoaRequest) {
		return modelMapper.map(pessoaRequest, Pessoa.class);
	}
	
	public PessoaDto modelToDto(Pessoa pessoa) {
		return modelMapper.map(pessoa, PessoaDto.class);
	}
}
