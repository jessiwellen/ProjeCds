package com.jessica.projecds.controle;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import com.jessica.projecds.modelo.Cds;

public class CdsControle {

	@GetMapping("/")
	public String getMensagem() {
		return "Projeto com Spring Boot";
	}
	
	@GetMapping("/Cds")
	public ArrayList<Cds> getCds() {
		
		Cds c1 = new Cds();
		
		c1.setAlbum("Nevermind");
		c1.setArtista("NIRVANA");
		c1.setGravadora("DGC Records");
		c1.setProdutora("Butch Vig");
		c1.setGenero("Grunge, Punk rock, Rock alternativo");
		c1.setAnolancamento("24 de setembro de 1991");
		
		Cds c2 = new Cds();
		
		c1.setAlbum("News of the World");
		c1.setArtista(" Queen");
		c1.setGravadora("Gravação ocorreu julho de 1977-setembro de 1977");
		c1.setProdutora("Sarm West Studios and Wessex Sound Studios");
		c1.setGenero("Rock, Jazz, Hard rock, Pop rock, Glam rock, Arena rock");
		c1.setAnolancamento(" 28 de outubro de 1977");
		
		ArrayList <Cds> Cds = new ArrayList<>();
		
		Cds.add(c1);
		Cds.add(c2);
		
		return Cds;
	}
}
