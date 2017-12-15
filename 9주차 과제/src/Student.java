
public class Student {
    public String name;
    public int studentNo;
    public String depart;
    public int grade;
    public int credit;
    
    public Student(String a, int b, String c, int d, int e) {
    	name = a;
    	studentNo = b;
    	depart = c;
    	grade = d;
    	credit = e;
    	System.out.println("이름: "+a+"학번: "+b+"학과: "+c+"학년: "+d+"이수학점: "+e);
    }
	
}
