
public class Person {
    public String name;
    public String address;
    public String phone;
    
    public Person(String a,String b,String c) {
    	name=a;
    	address=b;
    	phone=c;
    	System.out.println("�̸�: "+a+" �ּ�: "+b+" ��ȭ��ȣ: "+c);
    }
    public String getName() {return name;}
    public void setName(String n) {name = n;}
    public String getAddress() {return address;}
    public void setAddress(String a) {address=a;}
    public String getPhone() {return phone;}
    public void setPhone(String p) {phone = p;}
	
}
