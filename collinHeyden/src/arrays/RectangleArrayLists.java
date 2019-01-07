package arrays;

public class RectangleArrayLists {
		
	private int length;
	private int width;
		
	public RectangleArrayLists(int xLength, int xWidth) {
		length = xLength;
		width = xWidth;
	}
		
	public int returnLength() {
		return length;
	}

	public int returnWidth() {
		return width;
	}
		
	public double returnArea() {
		double area = length * width;
		return area;
	}

}
