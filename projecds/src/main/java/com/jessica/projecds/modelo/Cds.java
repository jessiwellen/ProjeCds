package com.jessica.projecds.modelo;
import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cds {

	@Getter @Setter
	private String album;
	@Getter @Setter
	private String artista;
	@Getter @Setter
	private String gravadora;
	@Getter @Setter
	private String produtora;
	@Getter @Setter
	private String genero;
	@Getter @Setter
	private String anolancamento;
}
