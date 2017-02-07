package hehe;

public class Noob extends Usuario {
	
	
	
	
	
	
	@Override
	boolean compraJogo(Jogo j) {
		if(super.getDinheiro() >= j.getPreco()){
			double sobra = super.getDinheiro() - j.getPreco()*0.9;
			super.setDinheiro(sobra);
		}
		return false;
	}

}
