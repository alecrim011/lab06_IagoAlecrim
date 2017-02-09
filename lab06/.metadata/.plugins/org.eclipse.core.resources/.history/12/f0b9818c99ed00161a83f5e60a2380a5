package hehe;

public class Veterano extends Usuario {

	@Override
	boolean compraJogo(Jogo j) {
		if(super.getDinheiro() >= j.getPreco()){
			double sobra = super.getDinheiro() - j.getPreco()*0.8;
			super.setDinheiro(sobra);
		}
		
		return false;
		
	}
	

}
