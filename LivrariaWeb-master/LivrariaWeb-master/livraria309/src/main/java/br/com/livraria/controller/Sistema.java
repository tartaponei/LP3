package br.com.livraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sistema {

//	@RequestMapping("/")
//	public String index() {
//		return "index";
//
//	}
//	
//	@RequestMapping("/autores")
//	public String autor() {
//		return "cadastroLivros";
//
//	}

	@RequestMapping("/livros")
	public String livros() {
		return "cadLivros";

	}

}
