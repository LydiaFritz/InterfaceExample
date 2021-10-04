/**
 * 
 */
package sort_app;

/**
 * @author Lydia
 *
 */
public class Triangle {

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
		String str = String.format("[height = %4.2f, base = %4.2f]", height, base);
		return "Triangle [height=" + height + ", base=" + base + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Triangle))
			return false;
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(base) != Double.doubleToLongBits(other.base))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		return true;
	}
	
	
	
	
	
	
}
