import java.util.Scanner;

public class homework101p3 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		float h;
		double i;
		int f;
		
		System.out.print("키를 입력하시오: ");
		h = input.nextFloat();
		
		i = h/2.54;
		f = (int)i/12;
		System.out.println(h+"cm는"+f+"피트"+i+"인치입니다.");// TODO Auto-generated method stub

	}

}
