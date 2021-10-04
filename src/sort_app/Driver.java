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

		ArrayList<ShapeUtility> lst1 = new ArrayList<ShapeUtility>();
		Random r = new Random();
		
		for(int i = 0; i < 10; i++) {
			double d1 = r.nextDouble()*10;
			double d2 = r.nextDouble()*15;			
			Rectangle newRectangle = new Rectangle(d1, d2);
			lst1.add(newRectangle);
			Triangle t = new Triangle(d1*10, d2*10);
			lst1.add(t);
		}
		
		for(ShapeUtility o : lst1) {
			//getArea is guaranteed to exist for 
			//any object implement the ShapeUtility interface
			System.out.println(o.getArea());
		}
		
		
		

	}

}
