
public class Dog {
	private String name;
	public static String breed;
	private int age;
	
	public Dog(String a, int b) {
		name = a;
		age = b;
		breed = "���";
	}
	public Dog(String a, String b, int c) {
		name = a;
		breed = b;
		age = c;
	}
	public void print() {
		System.out.println("�̸�: "+name+"\n����: "+breed+"\n����: "+age);
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog("��ī",3);
		dog1.print();
		Dog dog2 = new Dog("��","���޸���",4);
		dog2.print();// TODO Auto-generated method stub

	}

}
