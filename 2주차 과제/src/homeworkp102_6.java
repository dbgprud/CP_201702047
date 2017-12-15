import java.util.Scanner;
public class homeworkp102_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		int m;
		
		System.out.print("오백원의 갯수: ");
		a = input.nextInt();
		System.out.print("백원의 갯수: ");
		b = input.nextInt();
		System.out.print("오십원의 갯수: ");
		c = input.nextInt();
		System.out.print("십원의 갯수: ");
		d = input.nextInt();
		
		m = 500*a+100*b+50*c+10*d;
		System.out.println("동전의 금액은" +m+"원 입니다.");// TODO Auto-generated method stub

	}

}
