package br.com.dobebe.guiadobebe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dobebe.guiadobebe.controller.dto.AtividadeDto;
import br.com.dobebe.guiadobebe.controller.form.AtividadeForm;
import br.com.dobebe.guiadobebe.model.Atividade;
import br.com.dobebe.guiadobebe.repository.AtividadeRepository;
import br.com.dobebe.guiadobebe.repository.GrupoDePessoasRepository;

@RestController
@RequestMapping("/atividades")
public class AtividadeController {

	@Autowired
	private AtividadeRepository atividadeRepository;
	
	@Autowired
	private  GrupoDePessoasRepository grupoDePessoasRepository;
	
	@GetMapping
	public void listar() {
		System.out.println("alo");
	}
	
	@PostMapping
	public ResponseEntity<AtividadeDto> cadastrar(@RequestBody AtividadeForm atividadeForm) {
		
		Atividade atividade = atividadeForm.converter(grupoDePessoasRepository);
		atividadeRepository.save(atividade);
		
		return null;
	}
	
}
