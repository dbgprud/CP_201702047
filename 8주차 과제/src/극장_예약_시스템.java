import java.util.Scanner;
public class ����_����_�ý��� {
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
    	System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0)");
        reserve = scan.nextInt();
        ����_����_�ý���.confirm();
    }
    public static void confirm() {
    	if(reserve==1) {
    		System.out.println("������ ���� ���´� ������ �����ϴ�.");
    		System.out.println("---------------------");
    		for(i=1;i<11;i++) {
    			System.out.println(i+" ");
    		}
    		System.out.println("---------------------");
    		����_����_�ý���.seatReserve();
    	}
    	else
    		����_����_�ý���.reserve();
    }
    public static void seatReserve() {
    	for(i=0;i<seat.length;i++) {
			seat[i]=scan.nextInt();
			System.out.print(seat[i]+" ");
    	}
    	System.out.print("���° �¼��� �����Ͻðڽ��ϱ�? ");
    	i = scan.nextInt();
    	if(seat[i]==0) {
    		System.out.println("����Ǿ����ϴ�.");
    	}
    	else {
    		System.out.println("������� �� �Ͽ����ϴ�.");
    	}
    	
    }
	static void main(String[] args) {
		reserve();
		confirm();
		
    }
}