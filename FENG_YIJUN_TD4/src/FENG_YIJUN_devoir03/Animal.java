package FENG_YIJUN_devoir03;

public abstract class Animal{
	
	// 2 attributs
	private String espèce;
	private int nb_pattes=0;
	
	public Animal(String type, int pattes) {
		espèce=type;
			nb_pattes=pattes;
	}
		
	// 2 méthodes
	public void présente() {
		System.out.println("je suis un représentant de l'espèce des " +espèce+ " et j'ai " +nb_pattes+ "pattes" );
	}

	
	public abstract void crie();

}
