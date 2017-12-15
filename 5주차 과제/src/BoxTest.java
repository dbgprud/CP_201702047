
public class BoxTest {

	public static void main(String[] args) {
		Box mybox = new Box();
		mybox.setWidth(10);
		mybox.setLength(20);
		mybox.setHeight(50);
		
		System.out.println("가로의 길이는:"+ mybox.getWidth());
		System.out.println("세로의 길이는:"+ mybox.getLength());
		System.out.println("높이의 길이는:"+ mybox.getHeight());
		System.out.println("부피의 값은:"+ mybox.getVolume());// TODO Auto-generated method stub

	}

}
