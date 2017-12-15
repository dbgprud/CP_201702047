import java.util.Scanner;
public class 극장_예약_시스템 {
	public static int reserve;
	private static int i;
	static int[] seat=new int[10];
	public static void get(int j) {
	  for(j=0;j<10;j++) {
		seat[j]=0;
      	}
	}
	static Scanner scan = new Scanner(System.in);
    public static void reserve() {
    	System.out.print("좌석을 예약하시겠습니까?(1 또는 0)");
        reserve = scan.nextInt();
        극장_예약_시스템.confirm();
    }
    public static void confirm() {
    	if(reserve==1) {
    		System.out.println("현재의 예약 상태는 다음과 같습니다.");
    		System.out.println("---------------------");
    		for(i=1;i<11;i++) {
    			System.out.println(i+" ");
    		}
    		System.out.println("---------------------");
    		극장_예약_시스템.seatReserve();
    	}
    	else
    		극장_예약_시스템.reserve();
    }
    public static void seatReserve() {
    	for(i=0;i<seat.length;i++) {
			seat[i]=scan.nextInt();
			System.out.print(seat[i]+" ");
    	}
    	System.out.print("몇번째 좌석을 예약하시겠습니까? ");
    	i = scan.nextInt();
    	if(seat[i]==0) {
    		System.out.println("예약되었습니다.");
    	}
    	else {
    		System.out.println("예약되지 못 하였습니다.");
    	}
    	
    }
	static void main(String[] args) {
		reserve();
		confirm();
		
    }
}