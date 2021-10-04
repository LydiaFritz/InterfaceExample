/**
 * 
 */
package sort_app;

/**
 * @author Lydia
 *
 */
public class Rectangle {

	private double len, wid;
	
	public Rectangle() {
		this(1,1);
	}

	/**
	 * 
	 * @param l
	 * @param w initialize len and wid
	 */
	public Rectangle(double l, double w) {
		this.wid = w;
		this.len = l;
	}
	
	public double getArea() {
		return this.wid * this.len;
	}

	/**
	 * @return the len
	 */
	public double getLen() {
		return len;
	}

	/**
	 * @param len the len to set
	 */
	public void setLen(double len) {
		this.len = len;
	}

	/**
	 * @return the wid
	 */
	public double getWid() {
		return wid;
	}

	/**
	 * @param wid the wid to set
	 */
	public void setWid(double wid) {
		this.wid = wid;
	}

	@Override
	public String toString() {
		String str = String.format("Rectangle [len = %4.2f, wid = %-5.2f]", len, wid);
		return str;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Rectangle))
			return false;
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(len) != Double.doubleToLongBits(other.len))
			return false;
		if (Double.doubleToLongBits(wid) != Double.doubleToLongBits(other.wid))
			return false;
		return true;
	}

}
