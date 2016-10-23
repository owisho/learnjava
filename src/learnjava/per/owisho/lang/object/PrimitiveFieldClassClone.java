package learnjava.per.owisho.lang.object;

public class PrimitiveFieldClassClone implements Cloneable{

	public int i = 1;
	
	public float f = 1;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
