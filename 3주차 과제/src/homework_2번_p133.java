import java.util.Scanner;
public class homework_2번_p133 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double h;
		double m;
		double w;
		System.out.print("키를 입력하시오.: ");
		h = input.nextDouble();
		System.out.print("몸무게를 입력하시오.: ");
		w = input.nextDouble();
		
		m = (h-100)*0.9;
		if(m-m*0.1>w)
			System.out.println("저체중입니다.");
		else if(m+m*0.1<w)
			System.out.println("과체중입니다.");
		else
			System.out.println("정상입니다.");
		// TODO Auto-generated method stub

	}

}
