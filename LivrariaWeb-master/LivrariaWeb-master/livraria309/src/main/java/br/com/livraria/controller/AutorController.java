package br.com.livraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.livraria.modelo.Autor;
import br.com.livraria.repository.AutorDAO;

@Controller
public class AutorController {

	@Autowired
	private AutorDAO autores;

	@RequestMapping("/redirect")
	public String novo() {
		return "cadastroAutor";
	}
	
	@RequestMapping(value="novo", method = RequestMethod.POST)
	public ModelAndView salvar(Autor autor) {
		autores.save(autor);
		ModelAndView mv = new ModelAndView("cadastroAutor");
		mv.addObject("mensagem", "Autor cadastrado com sucesso");
		return mv;

	}

}
