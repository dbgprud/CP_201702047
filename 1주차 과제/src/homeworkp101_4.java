import java.util.Scanner;

public class homeworkp101_4 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		float r;
		float h;
		double v;
		
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�: ");
		r = input.nextFloat();
		
		System.out.print("������� ���̸� �Է��Ͻÿ�: ");
		h = input.nextFloat();
		
		v = r*r*h*Math.PI;
		System.out.println("������� ���Ǵ�"+v+"�Դϴ�.");// TODO Auto-generated method stub

	}

}
