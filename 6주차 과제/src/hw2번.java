import java.util.Scanner;
public class hw2번 {
	static Scanner Input = new Scanner(System.in);
	static String id1;
	static String pw1;
	public static void join1(){
        System.out.println("<계정생성>");
		System.out.print("아이디를 입력하시오: ");
		id1 = Input.nextLine();
	}
	public static void join2() {
	    System.out.print("비밀번호를 입력하시오: ");
		pw1 = Input.nextLine();
	}
	public static void compare(String a,String b) {
		if(a.equals(id1)&&b.equals(pw1)) 
		   System.out.println("로그인에 성공하였습니다.");
		else 
		   System.out.println("로그인에 실패하였습니다.");	
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String id2;
		String pw2;
		join1();
		join2();
		System.out.println("<로그인>");
		System.out.print("ID: ");
		id2 = input.nextLine();
		System.out.print("PW: ");
		pw2 = input.nextLine();
		compare(id2,pw2);// TODO Auto-generated method stub

	}

}
