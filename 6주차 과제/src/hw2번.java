import java.util.Scanner;
public class hw2�� {
	static Scanner Input = new Scanner(System.in);
	static String id1;
	static String pw1;
	public static void join1(){
        System.out.println("<��������>");
		System.out.print("���̵� �Է��Ͻÿ�: ");
		id1 = Input.nextLine();
	}
	public static void join2() {
	    System.out.print("��й�ȣ�� �Է��Ͻÿ�: ");
		pw1 = Input.nextLine();
	}
	public static void compare(String a,String b) {
		if(a.equals(id1)&&b.equals(pw1)) 
		   System.out.println("�α��ο� �����Ͽ����ϴ�.");
		else 
		   System.out.println("�α��ο� �����Ͽ����ϴ�.");	
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String id2;
		String pw2;
		join1();
		join2();
		System.out.println("<�α���>");
		System.out.print("ID: ");
		id2 = input.nextLine();
		System.out.print("PW: ");
		pw2 = input.nextLine();
		compare(id2,pw2);// TODO Auto-generated method stub

	}

}
