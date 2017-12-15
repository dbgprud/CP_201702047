
import java.util.Scanner;
public class homework_1번_p133 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("크기 순으로 정렬해라.");
		System.out.print("");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if(a<b&&b<c&&a<c||a==b&&b<c||a<b&&b==c)
	        System.out.printf("%d %d %d",+a,+b,+c);
	    else if(a<c&&c<b&&a<b||a==c&&a<b||a<b&&b==c)
	    	System.out.printf("%d %d %d",+a,+c,+b);
	    else if(b<a&a<c&&b<c||b==a&&a<c||b<a&&a==c)
	    	System.out.printf("%d %d %d",+b,+a,+c);
	    else if(b<c&&c<a&&b<a||b==c&&b<a||a==c&&b<c)
	    	System.out.printf("%d %d %d",+b,+c,+a);
	    else if(c<a&&a<b&&c<b||a==c&&a<b||a==b&&a>c)
	    	System.out.printf("%d %d %d",+c,+a,+b);
	    else if(c<b&&b<a&&c<a||b==c&&a>b||a==b&&b>c)
	    	System.out.printf("%d %d %d",+c,+b,+a);
	    else
	    	System.out.printf("%d %d %d",+a,+a,+a);
			
			 
		// TODO Auto-generated method stub

	}

}
