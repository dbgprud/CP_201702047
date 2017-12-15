
public class º°Âï±â {

	public static void main(String[] args) {
		int i;
		int j;
		int m;
		
		for(i=1;i<6;i++) {
			for(j=0;j<5-i;j++) { 
				System.out.print(" ");
			}
			for(m=0;m<(i*2)-1;m++) {
			     System.out.print("*");
                 
			}
			System.out.print("\n");
		}
		for(i=1;i<5;i++) {
			for(j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(m=0;m<9-(i*2);m++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		// TODO Auto-generated method stub

	}
}


