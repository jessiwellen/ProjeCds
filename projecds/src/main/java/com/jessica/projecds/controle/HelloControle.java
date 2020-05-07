package com.jessica.projecds.controle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControle {

	@GetMapping
	public String getMansagem() {
		return "Óla, Bem Vindo(a)";	}
	
}
