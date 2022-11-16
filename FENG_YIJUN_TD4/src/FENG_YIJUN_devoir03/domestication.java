package FENG_YIJUN_devoir03;

public class Crocodile extends Reptile implements Domesticable {
	
	private String nom;
	
	public Crocodile() {
		super("reptiles");
	}
	
	public void domsticable(String nom) {
		domesticable = false;
		cenom = nom;
	}
	
	public String nom() {
		return cenom;
	}
	
	public void manger() {
		if (domesticable == false) super.manger();
		else
			System.out.println("Moi" +cenom()+ "suis herbivoire." )
		
	}

}
