package br.com.fabio.minhasmusicas.modelos;

public class MinhasPreferidas {

	public void inclue(Audio audio) {
		if (audio.getClassificacao() >= 10) {
			System.out.println(audio.getTitulo() + " � considerado sucesso");
		}else {
			System.out.println(audio.getTitulo() + " tambem � bastante escutado" );
		}
	}
}
