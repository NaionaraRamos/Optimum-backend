package com.testeoptimum.servicos;

import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testeoptimum.dto.PessoaDto;
import com.testeoptimum.mapper.PessoaMapper;
import com.testeoptimum.modelos.Pessoa;
import com.testeoptimum.repositorios.RepositorioPessoa;
import com.testeoptimum.requests.PessoaRequest;

@Service
public class PessoaServico {
	
	@Autowired
	private RepositorioPessoa repositorioPessoa;
	
	@Autowired
	private PessoaMapper pessoaMapper;
	
	@Transactional
	public PessoaDto salvar(PessoaRequest pessoaRequest) {
		Pessoa pessoa = pessoaMapper.requestToModel(pessoaRequest);
		return pessoaMapper.modelToDto(repositorioPessoa.save(pessoa));
	}
	
	@Transactional
	public List<PessoaDto> listar() {
		
		System.out.println(repositorioPessoa.findAll().stream().map(cli -> pessoaMapper.modelToDto(cli)).collect(Collectors.toList()));
		return repositorioPessoa.findAll()
				.stream()
				.map(cli -> pessoaMapper.modelToDto(cli))
				.collect(Collectors.toList());
	}
}
