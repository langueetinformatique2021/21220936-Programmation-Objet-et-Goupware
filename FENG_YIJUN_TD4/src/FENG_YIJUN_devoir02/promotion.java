/**
 * 
 */
package FENG_YIJUN_devoir02;

/**
 * @author junjun
 *
 */
public class promotion {
	private int note1;
	private int note2;
	private int noteadmis;
	
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
	public int getnoteadmis() {
		if (noteadmis>=10) {
			System.out.println("Admis.");
		}else {
			System.out.println("Non dmis.");
		}
		return noteadmis;
	}
	public void setnoteadmis(int noteadmis) {
		noteadmis=(note1+note2)/2;
	}

}
