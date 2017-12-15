
public class Customer extends Person{
	public String number;
	public int mileage;
    
	public Customer(String d,String e,String f){
		super(d,e,f);
		number = "010-7485-5028";
		mileage = 53;
		System.out.println("고객번호: "+number+" 마일리지: "+mileage);
	}
	public int getMileage() {return mileage;}
	public void setMileage(int m) {mileage = m;}
	public String getNumber() {return number;}
	public void setNumber(String n) {number = n;}
	public static void main(String[] args) {
		Customer c = new Customer("윤보미","플랜에이","041-111-1111");
		c.setName("정은지");
		c.setAddress("에이핑크");
		c.setNumber("010-1111-1111");
		c.setPhone("041-000-0000");
		c.setMileage(23);
		System.out.println("이름: "+c.getName()+" 주소: "+c.getAddress()+" 전화번호: "+c.getPhone());
		System.out.println("고객번호: "+c.getNumber()+" 마일리지: "+c.getMileage());// TODO Auto-generated method stub

	}

}
