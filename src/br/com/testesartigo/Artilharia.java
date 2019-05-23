package br.com.testesartigo;

import java.util.ArrayList;
import java.util.Iterator;;

public class Artilharia {

	public static void main(String[] args) {
		// Criando a lista
		ArrayList<Atleta> artilheiros = new ArrayList<Atleta>();
		
		// Adicionando valores "na mão" para que possamos ter elementos para trabalhar
		artilheiros.add(registraAtletaNaArtilharia("João Victor", "Bahia", "Atacante", 21, 28));
		artilheiros.add(registraAtletaNaArtilharia("Caique", "Palmeiras", "Meia", 21, 14));
		artilheiros.add(registraAtletaNaArtilharia("Lucas", "Santos", "Atacante", 25, 20));
		artilheiros.add(registraAtletaNaArtilharia("Julio Cesar", "Cruzeiro", "Volante", 24, 7));
		artilheiros.add(registraAtletaNaArtilharia("Silas", "Corithians", "Atacante", 21, 22));
		artilheiros.add(registraAtletaNaArtilharia("Eder", "Vasco", "Zagueiro", 26, 2));
		
		// Vamos exibir apenas os atletas com mais de 20 gols no ano
		exibeListaArtilheirosForeach(artilheiros);
		
		// Vamos exibir todos os atletas
		exibeListaAtletasIterator(artilheiros);
	}
	
	// Método para criar novo objeto atleta com os parametros passados hard-code
	private static Atleta registraAtletaNaArtilharia(String nome, String time, String posicao, Integer idade, Integer totalGolsAno) {
		Atleta atleta = new Atleta();
		atleta.setNome(nome);
		atleta.setTime(time);
		atleta.setPosicao(posicao);
		atleta.setIdade(idade);
		atleta.setTotalGolsAno(totalGolsAno);
		return atleta;
	}
	
	private static void exibeListaArtilheirosForeach(ArrayList<Atleta> artilheiros){
		for (Atleta listaArtilheiros : artilheiros) {
			if(listaArtilheiros.getTotalGolsAno() >= 20) {
				System.out.println(listaArtilheiros.getNome());
			}
		}
	}
	
	private static void exibeListaAtletasIterator(ArrayList<Atleta> artilheiros){
		for (Iterator<Atleta> iterator = artilheiros.iterator(); iterator.hasNext(); ) {
			Atleta atleta = iterator.next();
			   System.out.println (atleta.getNome());
		}
	}
	
}

