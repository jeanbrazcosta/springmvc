package br.com.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.loja.daos.ProdutoDAO;
import br.com.loja.models.Produto;

@Controller
public class ProdutosController {
	@Autowired
	private ProdutoDAO produtoDAO;

	@RequestMapping("/produtos/form")
	public String form() {
		return "produtos/form";
	}

	@RequestMapping("/produtos")
	public String gravar(Produto produto) {
		System.out.println(produto);
		produtoDAO.gravar(produto);
		return "/produtos/ok";
	}
}
