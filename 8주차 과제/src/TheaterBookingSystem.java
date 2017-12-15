

import java.util.Scanner;
public class TheaterBookingSystem {
	public static int reserve;
	public static int i;
	static int[] seat= {0,0,0,0,0,0,0,0,0,0};
	static Scanner scan = new Scanner(System.in);
	public static void reserve() {
		System.out.print("좌석을 예약하시겠습니까?(1 또는 0)");
		reserve = scan.nextInt();
		confirm();
	}
	public static void confirm() {
		if(reserve==1){
			System.out.println("현재의 예약상태는 다음과 같습니다.");
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
		    System.out.println("몇번째 좌석을 예약하시겠습니까?");
		    i = scan.nextInt();
		    if(seat[i-1]==1) {
		    	System.out.println("예약을 할 수 없습니다.");
		    	reserve();
		    }
		    else {
		    	seat[i-1]=1;
		    	System.out.println("예약되었습니다.");
		    	reserve();
		    }
		}
		} public static void main(String[] args) {
			reserve();
	}
	
 }