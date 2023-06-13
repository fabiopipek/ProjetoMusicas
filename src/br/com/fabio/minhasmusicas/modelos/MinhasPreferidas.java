package br.com.fabio.minhasmusicas.modelos;

public class MinhasPreferidas {

	public void inclue(Audio audio) {
		if (audio.getClassificacao() >= 10) {
			System.out.println(audio.getTitulo() + " é considerado sucesso");
		}else {
			System.out.println(audio.getTitulo() + " tambem é bastante escutado" );
		}
	}
}
