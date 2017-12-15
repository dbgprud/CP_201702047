
abstract class ShapeTest{
    protected int width, height;
    
    public ShapeTest(int width,int height) {
    	this.width = width;
    	this.height = height;
    }
    public abstract int area();
}
class Triangle extends ShapeTest{	
	private int area;
	public Triangle(int base,int height) {
		super(base,height);
	}
	public int area() {
		System.out.println("�ﰢ�� ������ ����: "+width);
		System.out.println("�ﰢ�� ������ ����: "+height);
		area = (width*height)/2;
		System.out.print("�ﰢ���� ����: ");
		return area;
	}
}
class Rectangle extends ShapeTest{
	private int area;
	public Rectangle(int width,int height) {
		super(width,height);
	}
	public int area() {
		System.out.println("�簢�� ������ ����: "+width);
		System.out.println("�簢�� ������ ����: "+height);
		area = width*height;
		System.out.print("�簢���� ����: ");
		return area;
	}
}
class Circle extends ShapeTest{
	private int area;
	public Circle(int radius) {
		super(radius,radius);
	}
	public int area() {
		System.out.println("�� �������� ����: "+width);
		area = (int)(width*height*Math.PI);
		System.out.print("���� ����: ");
		return area;
	}
} 
public class Shape{
	public static void main(String[] args) {
		Triangle t = new Triangle(3,2);
		Rectangle r = new Rectangle(4,5);
		Circle c = new Circle(2);
		ShapeTest[] shape = new ShapeTest[3];
		shape[0] = new Triangle(3,2);
		shape[1] = new Rectangle(4,5);
		shape[2] = new Circle(2);
		for(int i = 0;i<shape.length;i++) {
			System.out.println(shape[i].area());
		}// TODO Auto-generated method stub

	}

}

