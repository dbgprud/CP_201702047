
public class Dog {
	private String name;
	public static String breed;
	private int age;
	
	public Dog(String a, int b) {
		name = a;
		age = b;
		breed = "비숑";
	}
	public Dog(String a, String b, int c) {
		name = a;
		breed = b;
		age = c;
	}
	public void print() {
		System.out.println("이름: "+name+"\n종류: "+breed+"\n나이: "+age);
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog("피카",3);
		dog1.print();
		Dog dog2 = new Dog("뿌","포메리안",4);
		dog2.print();// TODO Auto-generated method stub

	}

}
