

import java.util.Scanner;
public class TheaterBookingSystem {
	public static int reserve;
	public static int i;
	static int[] seat= {0,0,0,0,0,0,0,0,0,0};
	static Scanner scan = new Scanner(System.in);
	public static void reserve() {
		System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0)");
		reserve = scan.nextInt();
		confirm();
	}
	public static void confirm() {
		if(reserve==1){
			System.out.println("������ ������´� ������ �����ϴ�.");
		    System.out.println("-----------------------");
		    for(i=1;i<11;i++) {
		    	System.out.print(i+" ");
		    }
		    System.out.println();
		    System.out.println("-----------------------");
		    for(i=0;i<10;i++) {
		    	System.out.print(seat[i]+" ");
		    }
		    System.out.println();
		    System.out.println("���° �¼��� �����Ͻðڽ��ϱ�?");
		    i = scan.nextInt();
		    if(seat[i-1]==1) {
		    	System.out.println("������ �� �� �����ϴ�.");
		    	reserve();
		    }
		    else {
		    	seat[i-1]=1;
		    	System.out.println("����Ǿ����ϴ�.");
		    	reserve();
		    }
		}
		} public static void main(String[] args) {
			reserve();
	}
	
 }