import java.util.Scanner;
public class hw1{
   private static Scanner input;
   
public static void reverse(String s) {
	
	for(int i=s.length()-1;i>=0;i--) {
		   System.out.print(s.charAt(i));
	   }
	 }
	   
      public static void main(String[]args) {
    	  input = new Scanner(System.in);
    	  String str;
    	  
    	  System.out.print("���ڿ��� �Է��Ͻÿ�: ");
    	  str = input.nextLine();
    	  
    	  reverse(str);
      }
   
}