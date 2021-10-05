/**
 * 
 */
package sort_app;

/**
 * @author Lydia
 *
 */
public class Triangle implements ShapeUtility{

	private double height, base;
	
	public Triangle() {
		this(1.0, 1.0);
	}

	/**
	 * @param height
	 * @param base
	 * initialize the base and height of the triangle
	 */
	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}
	
	/**
	 * 
	 * @return the area of the triangle
	 */
	public double getArea() {
		return .5 * base * height;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public String toString() {
		String str = String.format("Triangle [height = %4.2f, base = %4.2f]", height, base);
		return str;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Triangle))
			return false;
		Triangle other = (Triangle) obj;
		//compare area to three decimal places
		int intArea = (int)Math.ceil((other.getArea() + .5)*1000);
		int thisArea = (int)Math.ceil((this.getArea() + .5)*1000);
		if(thisArea == intArea)
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
