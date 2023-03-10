package br.com.isiflix.livro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenssagemController {

	@GetMapping("/")
	public String mensssagem() {
 		return "<htnl> Welcome </html>";
				
				
	}
}
