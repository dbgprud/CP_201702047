public class GraduateStudent extends Student{
    public GraduateStudent(String a, int b, String c, int d, int e) {
		super(a, b, c, d, e);		
		// TODO Auto-generated constructor stub
	}

	String assistant;
    double scholarship;
    
    public String getAssistant() {return assistant;}
    public void setAssistant(String a) {
    	if(a=="��������") 
    		assistant = a;
    	else if(a=="��������")
    		assistant = a;
    	}
    public double getScholarship() {return scholarship;}
    public void setScholarship(double d) {
    	scholarship = d;
    }
	public static void main(String[] args) {
		GraduateStudent g = new GraduateStudent("������",201702047,"��ǻ�Ͱ��а�",1,17);// TODO Auto-generated method stub
        g.setAssistant("��������");
        g.setScholarship(0.7);
        System.out.println(g.getAssistant());
        System.out.println(g.getScholarship());
	}

}
