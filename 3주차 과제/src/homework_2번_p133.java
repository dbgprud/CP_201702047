import java.util.Scanner;
public class homework_2��_p133 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double h;
		double m;
		double w;
		System.out.print("Ű�� �Է��Ͻÿ�.: ");
		h = input.nextDouble();
		System.out.print("�����Ը� �Է��Ͻÿ�.: ");
		w = input.nextDouble();
		
		m = (h-100)*0.9;
		if(m-m*0.1>w)
			System.out.println("��ü���Դϴ�.");
		else if(m+m*0.1<w)
			System.out.println("��ü���Դϴ�.");
		else
			System.out.println("�����Դϴ�.");
		// TODO Auto-generated method stub

	}

}
