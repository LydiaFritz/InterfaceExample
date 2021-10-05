/**
 * 
 */
package sort_app;

/**
 * @author Lydia
 *
 */
public class Rectangle implements ShapeUtility, Comparable<Object> {

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
		//return true if area is equal
		//to 3 decimal places
		int otherArea = (int) Math.ceil((other.getArea() + .5)*1000);
		if(other.getArea() == this.getArea())
			return true;
		else return false;
	}

	@Override
	public int compareTo(Object o) {
		
		Triangle t; Rectangle r;
		double area = this.getArea();
		double o_area = -1;
		//see if o is this object
		if(o == this)return 0;
		//see if o is a Triangle or Rectangle		
		else if(o instanceof Triangle) {
			t = (Triangle)o;
			o_area = t.getArea();
		}
		else if(o instanceof Rectangle) {
			r = (Rectangle)o;
			o_area = r.getArea();
		}
		if(area > o_area)
			return 1;
		else if(area < o_area)
			return -1;
		return 0;
	}





}
