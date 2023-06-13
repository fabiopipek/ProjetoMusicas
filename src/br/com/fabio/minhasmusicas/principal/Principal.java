package br.com.fabio.minhasmusicas.principal;

import br.com.fabio.minhasmusicas.modelos.MinhasPreferidas;
import br.com.fabio.minhasmusicas.modelos.Musica;
import br.com.fabio.minhasmusicas.modelos.Podcast;

public class Principal {
	public static void main(String[] args) {
		Musica minhaMusica = new Musica();
		minhaMusica.setTitulo("Creep");
		minhaMusica.setCantor("Radiohead");
		
		for (int i = 0;i <  1000; i++) {
			minhaMusica.reproduz();
		}
		
		for (int i = 0;i <  50; i++) {
			minhaMusica.curte();
		}
		
		Podcast meuPodcast = new Podcast();
		meuPodcast.setTitulo("podpa");
		meuPodcast.setHost("Igor" + "Mitico");
		
		for (int i = 0;i <  5000; i++) {
			meuPodcast.reproduz();
		}
		
		for (int i = 0;i <  1000; i++) {
			meuPodcast.curte();
		}
		
		MinhasPreferidas preferidas = new MinhasPreferidas();
		preferidas.inclue(meuPodcast);
		preferidas.inclue(minhaMusica);
	}
}
