package br.com.exemplo.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.exemplo.portfolio.dto.ContatoDto;
import br.com.exemplo.portfolio.model.Contato;
import br.com.exemplo.portfolio.repository.ContatoRepository;

@Service
public class ContatoService {
	@Autowired
	private ContatoRepository contatoRepository;

	public Contato salvarContato(ContatoDto contatoDto) {
		Contato contato = new Contato(contatoDto);
		return contatoRepository.save(contato);
	}

	public List<Contato> listarContatos() {
		return contatoRepository.findAll();
	}

	public void excluirContato(Integer id) {
		contatoRepository.deleteById(id);
	}

}
