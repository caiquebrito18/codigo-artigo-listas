package br.com.testesartigo;

public class Atleta {
	private String nome;
	private String posicao;
	private String time;
	private Integer idade;
	private Integer totalGolsAno;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Integer getTotalGolsAno() {
		return totalGolsAno;
	}
	public void setTotalGolsAno(Integer totalGolsAno) {
		this.totalGolsAno = totalGolsAno;
	}
	
}