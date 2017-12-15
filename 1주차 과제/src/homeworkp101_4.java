import java.util.Scanner;

public class homeworkp101_4 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		float r;
		float h;
		double v;
		
		System.out.print("원기둥 밑면의 반지름을 입력하시오: ");
		r = input.nextFloat();
		
		System.out.print("원기둥의 높이를 입력하시오: ");
		h = input.nextFloat();
		
		v = r*r*h*Math.PI;
		System.out.println("원기둥의 부피는"+v+"입니다.");// TODO Auto-generated method stub

	}

}
