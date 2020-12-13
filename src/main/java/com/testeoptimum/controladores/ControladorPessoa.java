package com.testeoptimum.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.testeoptimum.dto.PessoaDto;
import com.testeoptimum.requests.PessoaRequest;
import com.testeoptimum.servicos.PessoaServico;

@CrossOrigin
@RestController
@RequestMapping("/pessoas")
public class ControladorPessoa {
	
	@Autowired
	private PessoaServico pessoaServico;
	
	@GetMapping
	public List<PessoaDto> listar() {
		return pessoaServico.listar();
	}
	
	@PostMapping
	public ResponseEntity<?> salvar(@RequestBody PessoaRequest pessoaRequest) {
		
		try {
			PessoaDto pessoaDto = pessoaServico.salvar(pessoaRequest);
			return ResponseEntity.status(HttpStatus.CREATED).body(pessoaDto);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
}
