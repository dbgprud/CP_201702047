import java.util.Random;

public class lotto_random {

	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());
	
		int num1 =0;
		int num2 =0;
		int num3 =0;
		int num4 =0;
		int num5 =0;
		int num6 =0;
		System.out.println("<로또 생성 프로그램>");
	    
           	for(int i=1;i<7;i++) {
           		switch(i) {
           		case 1: 
           			System.out.print(num1 = rand.nextInt(45)+1);
           			System.out.print(" ");
           			break;
           		case 2:
           			System.out.print(num2 = rand.nextInt(45)+1);
           			System.out.print(" ");
           			if(num1==num2)
           				i--;
           			
           			break;
           		case 3:
           			System.out.print(num3 = rand.nextInt(45)+1);
           			System.out.print(" ");
           			if(num2==num3)
           				i--;
           			break;
           		case 4:
           			System.out.print(num4 = rand.nextInt(45)+1);
           			System.out.print(" ");
           			if(num3==num4)
           				i--;
           			break;
           		case 5:
           			System.out.print(num5 = rand.nextInt(45)+1);
           			System.out.print(" ");
           			if(num4==num5)
           				i--;
           			break;
           		case 6:
           			System.out.print(num6 = rand.nextInt(45)+1);
           			System.out.print(" ");
           			if(num5==num6)
           				i--;
           			break;
           		}
           		
           		
           		
           			
           	
           	}
           	     
           			
           	}
             
              
			 
		
	   
			
		}// TODO Auto-generated method stub

	


