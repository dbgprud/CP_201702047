import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double mile;
		double kilo;
		
		System.out.print("마일을 입력하시오: ");// TODO Auto-generated method stub
        mile = input.nextDouble();
        
        kilo = 1.609 * mile;
        System.out.println(mile+"마일은"+kilo+"킬로미터입니다.");
        
        
	}

}
