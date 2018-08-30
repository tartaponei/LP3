package br.com.livraria.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.livraria.modelo.CategoriasLivro;
import br.com.livraria.modelo.LivrariaTudao;
import br.com.livraria.repository.LivrariaTudaoRepository;

@Controller
@RequestMapping("/livros")
public class TudaoController {

	@Autowired //injecao de dependecia = add TODO Crud
	private LivrariaTudaoRepository tudao;

	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("cadLivros");
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(LivrariaTudao livraria) {
		tudao.save(livraria);
		ModelAndView mv = new ModelAndView("cadLivros");
		mv.addObject("mensagem", "Livro cadastrado com sucesso");
		return mv;

	}

	@ModelAttribute("todasCategoriaLivro")
	public List<CategoriasLivro> todasCategoriasLivro(){
		return Arrays.asList(CategoriasLivro.values());
	}
	
	
}
