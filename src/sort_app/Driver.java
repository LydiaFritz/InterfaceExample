/**
 * 
 */
package sort_app;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Lydia
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Rectangle> lst1 = new ArrayList<Rectangle>();
		Random r = new Random();
		
		for(int i = 0; i < 10; i++) {
			double wid = r.nextDouble()*10;
			double len = r.nextDouble()*15;
			
			Rectangle newRectangle = new Rectangle(wid, len);
			lst1.add(newRectangle);
		}
		
		for(Rectangle o : lst1) {
			System.out.println(o);
		}
		

	}

}
