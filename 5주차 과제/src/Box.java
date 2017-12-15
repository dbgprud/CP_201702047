
public class Box {
	private int width;
	private int length;
	private int height;
	private int volume;
	
	public int getWidth() {return width;}
	public void setWidth(int w) {width = w;}
	public int getLength() {return length;}
	public void setLength(int l) {length = l;}
	public int getHeight() {return height;}
	public void setHeight(int h) {height = h;}
	public int getVolume() {volume = width*length*height;
	                         return volume;}
	public void print() {
		System.out.println(width);
		System.out.println(length);
		System.out.println(volume);
	}
		// TODO Auto-generated method stub

}
