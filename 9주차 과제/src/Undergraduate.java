
public class Undergraduate extends Student{
    String club;
    
    public Undergraduate(String a, int b, String c, int d, int e) {
		super(a,b,c,d,e);
	}
	public String getClub() {return club;}
    public void setClub(String c) {club = c;}
    
    public static void main(String[] args) {
		Undergraduate u = new Undergraduate("������",201702047,"��ǻ�Ͱ��а�",1,17);
        u.setClub("Argos");
        System.out.println(u.getClub());
	}
	
}
