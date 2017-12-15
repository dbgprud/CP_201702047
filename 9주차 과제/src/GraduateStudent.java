public class GraduateStudent extends Student{
    public GraduateStudent(String a, int b, String c, int d, int e) {
		super(a, b, c, d, e);		
		// TODO Auto-generated constructor stub
	}

	String assistant;
    double scholarship;
    
    public String getAssistant() {return assistant;}
    public void setAssistant(String a) {
    	if(a=="교육조교") 
    		assistant = a;
    	else if(a=="연구조교")
    		assistant = a;
    	}
    public double getScholarship() {return scholarship;}
    public void setScholarship(double d) {
    	scholarship = d;
    }
	public static void main(String[] args) {
		GraduateStudent g = new GraduateStudent("유혜경",201702047,"컴퓨터공학과",1,17);// TODO Auto-generated method stub
        g.setAssistant("연구조교");
        g.setScholarship(0.7);
        System.out.println(g.getAssistant());
        System.out.println(g.getScholarship());
	}

}
