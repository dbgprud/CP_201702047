
public class Customer extends Person{
	public String number;
	public int mileage;
    
	public Customer(String d,String e,String f){
		super(d,e,f);
		number = "010-7485-5028";
		mileage = 53;
		System.out.println("����ȣ: "+number+" ���ϸ���: "+mileage);
	}
	public int getMileage() {return mileage;}
	public void setMileage(int m) {mileage = m;}
	public String getNumber() {return number;}
	public void setNumber(String n) {number = n;}
	public static void main(String[] args) {
		Customer c = new Customer("������","�÷�����","041-111-1111");
		c.setName("������");
		c.setAddress("������ũ");
		c.setNumber("010-1111-1111");
		c.setPhone("041-000-0000");
		c.setMileage(23);
		System.out.println("�̸�: "+c.getName()+" �ּ�: "+c.getAddress()+" ��ȭ��ȣ: "+c.getPhone());
		System.out.println("����ȣ: "+c.getNumber()+" ���ϸ���: "+c.getMileage());// TODO Auto-generated method stub

	}

}
