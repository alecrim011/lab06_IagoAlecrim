package hehe;

public class Jogo {
	private String nome;
	private Double preco;
	private int qtdJogada = 0;
	private int maiorScore = 0;
	private int qtdZerou = 0;
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Double getPreco() {
		return preco;
	}



	public void setPreco(Double preco) {
		this.preco = preco;
	}



	public int getQtdJogada() {
		return qtdJogada;
	}



	public void setQtdJogada(int qtdJogada) {
		this.qtdJogada = qtdJogada;
	}



	public int getMaiorScore() {
		return maiorScore;
	}



	public void setMaiorScore(int maiorScore) {
		this.maiorScore = maiorScore;
	}



	public int getQtdZerou() {
		return qtdZerou;
	}



	public void setQtdZerou(int qtdZerou) {
		this.qtdZerou = qtdZerou;
	}



	public int registraJogada(int score, boolean zerou){
		if (score > maiorScore){
			maiorScore = score;
		}
		
	
	
	}
	
	
	

}
