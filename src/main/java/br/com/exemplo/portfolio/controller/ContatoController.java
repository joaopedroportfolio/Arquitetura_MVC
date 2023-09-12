package br.com.exemplo.portfolio.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.exemplo.portfolio.dto.ContatoDto;
import br.com.exemplo.portfolio.model.Contato;
import br.com.exemplo.portfolio.service.ContatoService;

@RestController
@RequestMapping("/contato")
public class ContatoController {

	@Autowired
	private ContatoService contatoService;

	@PostMapping
	private ResponseEntity<ContatoDto> novoContato(@RequestBody ContatoDto contatoDto) {
		Contato contato = contatoService.salvarContato(contatoDto);
		return ResponseEntity.ok(new ContatoDto(contato));
	}

	@GetMapping
	private ResponseEntity<List<ContatoDto>> listarContatos() {
		List<Contato> contatos = contatoService.listarContatos();
		List<ContatoDto> contatosDto = contatos.stream().map(ContatoDto::new).toList();
		return ResponseEntity.ok(contatosDto);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluirContato(@PathVariable Integer id) {
		contatoService.excluirContato(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@PutMapping
	public ResponseEntity<ContatoDto> alterarContato(@RequestBody ContatoDto contatoDto) {
		Contato contato = contatoService.salvarContato(contatoDto);
		return ResponseEntity.ok(new ContatoDto(contato));
	}
}
