
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
    	company = "한진";
    	model = "대한항공";
    	passenger = d;
    	id = ++Planes;
    }
    public Plane() {
    	company = "금호";
    	model = "아시아나 항공";
    	passenger = 100;
    	id = ++Planes;
    }
    public static void getPlanes() {
    	System.out.println("생성된 비행기 수: "+Planes);
    }
    public void print() {
    	System.out.println("제작사: "+company+"\n모델: "+model+"\n최대 승객 수: "+passenger);
    }
	public static void main(String[] args) {
		Plane p = new Plane();
		p.setCompany("제주");
		p.setModel("제주항공");
		p.setPassenger(75);
		System.out.println("제작사: "+p.getCompany()+"\n모델: "+p.getModel()+"\n최대 승객 수: "+p.getPassenger());
		
		Plane plane1 = new Plane("중견","이스타 항공",50);
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
