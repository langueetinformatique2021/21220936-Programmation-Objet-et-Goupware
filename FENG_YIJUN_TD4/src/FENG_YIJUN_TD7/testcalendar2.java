/**
 * 
 */
package FENG_YIJUN_TD7;

import util.Keyboard;
/**
 * @author junjun
 *
 */
public class testcalendar2 {
	public static void main(String[] args) {
		Calendar2 cal = new Calendar2();
		cal.creation();
		Keyboard.getInt("attente");
		cal.creation();
		cal.afficher();
	}

}
