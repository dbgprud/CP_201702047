
public class Plane {
	private String company;
	private String model;
	private int passenger;
	private int id;
	private static int Planes;
	
	public String getCompany() {return company;}
	public void setCompany(String c) {company = c;}
	public String getModel() {return model;}
	public void setModel(String m) {model = m;}
	public int getPassenger() {return passenger;}
	public void setPassenger(int p) {passenger = p;}
	
    public Plane(String a,String b,int c) {
    	company = a;
    	model = b;
    	passenger = c;
    	id = ++Planes;
    }
    public Plane(int d) {
    	company = "����";
    	model = "�����װ�";
    	passenger = d;
    	id = ++Planes;
    }
    public Plane() {
    	company = "��ȣ";
    	model = "�ƽþƳ� �װ�";
    	passenger = 100;
    	id = ++Planes;
    }
    public static void getPlanes() {
    	System.out.println("������ ����� ��: "+Planes);
    }
    public void print() {
    	System.out.println("���ۻ�: "+company+"\n��: "+model+"\n�ִ� �°� ��: "+passenger);
    }
	public static void main(String[] args) {
		Plane p = new Plane();
		p.setCompany("����");
		p.setModel("�����װ�");
		p.setPassenger(75);
		System.out.println("���ۻ�: "+p.getCompany()+"\n��: "+p.getModel()+"\n�ִ� �°� ��: "+p.getPassenger());
		
		Plane plane1 = new Plane("�߰�","�̽�Ÿ �װ�",50);
		plane1.print();
		Plane plane2 = new Plane(125);
		plane2.print();
		Plane plane3 = new Plane();
		plane3.print();
		Plane plane4 = new Plane(114);
		plane4.print();
		getPlanes();// TODO Auto-generated method stub

	}

}
