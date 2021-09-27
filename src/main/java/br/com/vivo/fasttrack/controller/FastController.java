package br.com.vivo.fasttrack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FastController {
	
	@RequestMapping("/")
	@ResponseBody
	String catalogoProdutos() {
		return ("Catálogo de produtos");
	}

}
