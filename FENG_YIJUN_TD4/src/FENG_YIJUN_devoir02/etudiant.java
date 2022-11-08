/**
 * 
 */
package FENG_YIJUN_devoir02;

/**
 * @author junjun
 *
 */
public class etudiant {
	//les attributs
	private String nom;
	private String prenom;
	private int numeroetudiant;
	private int age; 
	private int note1;
	private int note2;
	//le nom et le prenom
	public String getnom() {
		return nom;
	}
	public void setnom(String nom) {
		nom = nom;
	}
	public String getprenom() {
		return prenom;
	}
	public void setprenom() {
		prenom = prenom;
	}
	//le numero d'etudiant
	public int getnumeroetudiant() {
		return numeroetudiant;
	}
	public void setnumeroetudiant(int numeroetudiant) {
		numeroetudiant = numeroetudiant;
	}
	//l'age
	public int getage() {
		return age;
	}
	public void setage(int age) {
		if (age<0 || age>100) {
			System.out.println("Veuillez importer l'âge correct !");
		}else {
			age = age;
		}
	}
	//les notes
	public int getnote1() {
		return note1;
	}
	public void setnote1(int note1) {
		if (note1<0 || note1>20) {
			System.out.println("Veuillez importer le note correct !");
		}else {
			note1 = note1;
		}
	}
	public int getnote2() {
		return note2;
	}
	public void setnote2(int note1) {
		if (note2<0 || note2>20) {
			System.out.println("Veuillez importer le note correct !");
		}else {
			note2 = note2;
		}
	}


}
